package Vista;

import Conexion.ConexioSQLite;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica_Validaciones_Tipo_Barra extends javax.swing.JFrame {

    private JPanel panel;
    ConexioSQLite conexion;
    DefaultCategoryDataset dataset;
    ResultSet resultado;

    // METODO CONSTRUCTOR
    public Grafica_Validaciones_Tipo_Barra() {
        setTitle("Validaciones vs Tipo");
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

        dataset = new DefaultCategoryDataset();

        Object[] opcion = {"2017", "2018", "2019", "2020", "2021"};
        Object anos = JOptionPane.showInputDialog(null, "Selecciona un año", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);

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

                try {
                    resultado = contador_validaciones(inicio_semana, fin_semana, anos);

                    while (resultado.next()) {

                        String cont_validaciones = resultado.getString("CONTADOR_VALIDACIONES");
                        String cont_tipo = resultado.getString("TIPO_VALIDACION");

                        dataset.setValue(Integer.parseInt(cont_validaciones), cont_tipo, cont_tipo);
                    }
                    conexion.cerrar();
                    // CREANDO GRAFICO
                    JFreeChart chart = ChartFactory.createBarChart("Validaciones vs Tipo", "Validaciones", "Cantidad", (CategoryDataset) dataset, PlotOrientation.VERTICAL, true, true, false);
                    chart.setBackgroundPaint(Color.white);
                    chart.getTitle().setPaint(Color.black);
                    CategoryPlot p = chart.getCategoryPlot();
                    p.getAnnotations();
                    p.setBackgroundPaint(Color.white);
                    
                    // MOSTRAR GRAFICO
                    ChartPanel chartPanel = new ChartPanel(chart);
                    chartPanel.setPreferredSize(new Dimension(1050, 560));
                    panel.add(chartPanel);
                } catch (SQLException ex) {
                    Logger.getLogger(Grafica_Validaciones_Tipo_Barra.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Recuerde que la semana inicio debe ser menor o igual semana fin");
                init();
            }

        }

    }

    // METODO PARA CONTAR VALIDACIONES
    public ResultSet contador_validaciones(String semana_inicio, String semana_fin, Object anos) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT COUNT(ESTADO_PROYECTO) AS CONTADOR_VALIDACIONES, TIPO_VALIDACION "
                + "FROM PLANEACIONES_VALIDACION "
                + "WHERE (SEMANA >= " + semana_inicio + " AND SEMANA <= " + semana_fin + ") "
                + "AND FECHA_PROPUESTA BETWEEN '" + anos + "-01-01' AND '" + anos + "-12-31' "
                + "AND ((ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Cerrada' OR ESTADO_PROYECTO = 'No Ejecutada' OR ESTADO_PROYECTO = 'Reprogramada' OR ESTADO_PROYECTO = 'Programada') "
                + "OR (NO_PROGRAMADA = 'Ejecutada No Programada')) "
                + "GROUP BY TIPO_VALIDACION; ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
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
        new Grafica_Validaciones_Tipo_Barra().setVisible(true);
    }
}
