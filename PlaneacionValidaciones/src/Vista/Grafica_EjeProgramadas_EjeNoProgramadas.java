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
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica_EjeProgramadas_EjeNoProgramadas extends javax.swing.JFrame {

    private JPanel panel;
    ConexioSQLite conexion;

    // METODO CONSTRUCTOR
    public Grafica_EjeProgramadas_EjeNoProgramadas() {
        setTitle("Validaciones Ejecutadas Programadas vs Ejecutadas No Programadas");
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

        Object[] opcion = {"2017", "2018", "2019", "2020", "2021"};
        Object anos = JOptionPane.showInputDialog(null, "Selecciona un año", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);

        String inicio_semana = JOptionPane.showInputDialog("Ingrese Semana Inicial : ");
        String fin_semana = JOptionPane.showInputDialog("Ingrese Semana Final : ");

        if (anos == null) {
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

                int contador_eje_programadas = contador_ejecutadas(inicio_semana, fin_semana, anos);
                int contador_eje_no_ejecutadas = contador_no_ejecutadas(inicio_semana, fin_semana, anos);

                dataset.setValue(contador_eje_programadas, "Ejecutadas Programadas", "Ejecutadas Programadas");
                dataset.setValue(contador_eje_no_ejecutadas, "Ejecutadas No Programadas", "Ejecutadas No Programadas");

                // CREANDO GRAFICO
                JFreeChart chart = ChartFactory.createBarChart("Ejecutadas Programadas vs Ejecutadas No Ejecutadas", "Validaciones", "Cantidad",
                        dataset, PlotOrientation.VERTICAL, true, true, false);
                chart.setBackgroundPaint(Color.white);
                chart.getTitle().setPaint(Color.black);
                CategoryPlot p = chart.getCategoryPlot();
                p.setRangeGridlinePaint(Color.white);
                p.getAnnotations();
                p.setBackgroundPaint(Color.white);
                
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

    // METODO PARA CONTAR VALIDACIONES EJECUTADAS PROGRAMADAS EN LA SEMANA
    public int contador_ejecutadas(String semana_inicial, String semana_fin, Object anos) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int cont_ejecutadas = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT COUNT(ESTADO_PROYECTO) AS EJECUTADAS_PROGRAMADAS "
                + "FROM PLANEACIONES_VALIDACION "
                + "WHERE (SEMANA >= " + semana_inicial + " AND SEMANA <= " + semana_fin + ") "
                + "AND FECHA_PROPUESTA BETWEEN '" + anos + "-01-01' AND '" + anos + "-12-31' "
                + "AND (ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Cerrada'); ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                // REGISTROS CONSULTADOS
                cont_ejecutadas = Integer.parseInt(rs.getString("EJECUTADAS_PROGRAMADAS"));
            }
            conexion.cerrar();
            return cont_ejecutadas;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return cont_ejecutadas;
    }

    // METODO PARA CONTAR CONTAR VALIDACIONES EJECUTADAS NO PROGRAMADAS EN LA SEMANA
    public int contador_no_ejecutadas(String semana_inicial, String semana_fin, Object anos) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int cont_ejecutadas = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT COUNT(ESTADO_PROYECTO) AS EJECUTADAS_NO_PROGRAMADAS "
                + "FROM PLANEACIONES_VALIDACION "
                + "WHERE (SEMANA >= " + semana_inicial + " AND SEMANA <= " + semana_fin + ") "
                + "AND FECHA_PROPUESTA BETWEEN '" + anos + "-01-01' AND '" + anos + "-12-31' "
                + "AND (NO_PROGRAMADA = 'Ejecutada No Programada');";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                // REGISTROS CONSULTADOS
                cont_ejecutadas = Integer.parseInt(rs.getString("EJECUTADAS_NO_PROGRAMADAS"));
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
        new Grafica_EjeProgramadas_EjeNoProgramadas().setVisible(true);
    }
}
