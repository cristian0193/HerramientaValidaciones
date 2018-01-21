package Vista;

import Conexion.ConexioSQLite;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica_Programadas_NoEjecutadas extends javax.swing.JFrame {

    private JPanel panel;
    ConexioSQLite conexion;

    // METODO CONSTRUCTOR
    public Grafica_Programadas_NoEjecutadas() {
        setTitle("Validaciones Programadas vs No Ejecutadas");
        setSize(1100, 630);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        init();
    }

    // METODO PARA CARGAR COMPONENTES
    private void init() {

        panel = new JPanel();
        getContentPane().add(panel);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        Object[] anos = {"2017", "2018", "2019", "2020", "2021"};
        Object opcion = JOptionPane.showInputDialog(null, "Selecciona un año", "Elegir", JOptionPane.QUESTION_MESSAGE, null, anos, anos[0]);

        String inicio_semana = JOptionPane.showInputDialog("Ingrese Semana Inicial : ");
        String fin_semana = JOptionPane.showInputDialog("Ingrese Semana Final : ");

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar Valor para el Año");
            init();
        } else if (inicio_semana.equals("") || fin_semana.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar Valor en Semana (Inicio o Fin)");
            init();
        } else if (isNumeric(inicio_semana) == false || isNumeric(fin_semana) == false) {
            JOptionPane.showMessageDialog(null, "Ingrese Solo Valores Numericos");
            init();
        } else {

            int inicio = Integer.parseInt(inicio_semana);
            int fin = Integer.parseInt(fin_semana);

            if (inicio <= fin) {
                for (int i = inicio; i <= fin; i++) {
                    int contador_programadas = contador_programadas(i, opcion);
                    int contador_Noejecutadas = contador_Noejecutadas(i, opcion);

                    dataset.setValue(contador_programadas, "Programadas", "" + i);
                    dataset.setValue(contador_Noejecutadas, "No Ejecutadas", "" + i);
                }

                // CREANDO GRAFICO
                JFreeChart chart = ChartFactory.createBarChart("Programadas vs No Ejecutadas", "Validaciones", "Cantidad",
                        dataset, PlotOrientation.VERTICAL, true, true, false);
                chart.setBackgroundPaint(Color.white);
                chart.getTitle().setPaint(Color.black);
                CategoryPlot p = chart.getCategoryPlot();
                p.getAnnotations();
                p.setBackgroundPaint(Color.white);
                BarRenderer renderer = (BarRenderer) p.getRenderer();
                renderer.setItemMargin(0.0);

                // MOSTRAR GRAFICO
                ChartPanel chartPanel = new ChartPanel(chart);
                chartPanel.setPreferredSize(new Dimension(1050, 560));
                panel.add(chartPanel);
            } else {
                JOptionPane.showMessageDialog(null, "Recuerde que la semana inicio debe ser menor o igual semana fin");
                init();
            }

        }

    }

    // METODO PARA CONTAR VALIDACIONES EJECUTADAS EN LA SEMANA
    public int contador_Noejecutadas(int semana, Object anos) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int cont_ejecutadas = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT COUNT(ESTADO_PROYECTO) AS NO_EJECUTADAS "
                + "FROM PLANEACIONES_VALIDACION WHERE SEMANA = " + semana + " "
                + "AND FECHA_PROPUESTA BETWEEN '" + anos + "-01-01' AND '" + anos + "-12-31' "
                + "AND (ESTADO_PROYECTO = 'No Ejecutada'); ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                // REGISTROS CONSULTADOS
                cont_ejecutadas = Integer.parseInt(rs.getString("NO_EJECUTADAS"));
            }
            conexion.cerrar();
            return cont_ejecutadas;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return cont_ejecutadas;
    }

    // METODO PARA CONTAR VALIDACIONES PROGRAMADAS EN LA SEMANA
    public int contador_programadas(int semana, Object anos) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query;
        int cont_ejecutadas = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT COUNT(ESTADO_PROYECTO) AS PROGRAMADAS "
                + "FROM PLANEACIONES_VALIDACION "
                + "WHERE SEMANA = " + semana + " "
                + "AND FECHA_PROPUESTA BETWEEN '" + anos + "-01-01' AND '" + anos + "-12-31' "
                + "AND (ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Cerrada' OR ESTADO_PROYECTO = 'No Ejecutada' OR ESTADO_PROYECTO = 'Reprogramada' OR ESTADO_PROYECTO = 'Programada');";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                // REGISTROS CONSULTADOS
                cont_ejecutadas = Integer.parseInt(rs.getString("PROGRAMADAS"));
            }
            conexion.cerrar();
            return cont_ejecutadas;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return cont_ejecutadas;
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    // METODO PARA EJECUTAR
    public static void main(String args[]) {
        new Grafica_Programadas_NoEjecutadas().setVisible(true);
    }
}
