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
import org.jfree.data.general.DefaultPieDataset;

public class Grafica_Validaciones_Tipo_Circular extends javax.swing.JFrame {

    JPanel panel;
    ConexioSQLite conexion;
    DefaultPieDataset dataset;

    // METODO CONSTRUCTOR
    public Grafica_Validaciones_Tipo_Circular() {
        setTitle("Validaciones vs Planta");
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
        // Fuente de Datos
        dataset = new DefaultPieDataset();

        Object[] opciones = {"2017", "2018", "2019", "2020", "2021"};
        Object anos = JOptionPane.showInputDialog(null, "Selecciona un año", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

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

                cadena_tipo_validacion(inicio_semana,fin_semana,anos);

                // Creando el Grafico
                JFreeChart chart = ChartFactory.createPieChart("Validaciones vs Planta", dataset, true, true, false);

                chart.setBackgroundPaint(Color.white);
                chart.getTitle().setPaint(Color.black);

                // Mostrar Grafico
                ChartPanel chartPanel = new ChartPanel(chart);
                chartPanel.setPreferredSize(new Dimension(1050, 560));
                panel.add(chartPanel);

            } else {
                JOptionPane.showMessageDialog(null, "Recuerde que la semana inicio debe ser menor o igual semana fin");
                init();
            }

        }

    }

    // METODO PARA CONTAR TIPO DE VALIDACIONES
    public void cadena_tipo_validacion(String semana_inicial, String semana_fin, Object anos) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query;
        String tipo_calificacion;
        double cantidades;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = " SELECT TIPO_VALIDACION AS TIPO_VALIDACIONES,COUNT(TIPO_VALIDACION) AS CONTADOR "
                + " FROM PLANEACIONES_VALIDACION "
                + " WHERE (SEMANA >= " + semana_inicial + " AND SEMANA <= " + semana_fin + ") "
                + " AND FECHA_PROPUESTA BETWEEN '" + anos + "-01-01' AND '" + anos + "-12-31' "
                + " AND (ESTADO_PROYECTO = 'Programada' OR ESTADO_PROYECTO = 'No Ejecutada' OR ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Cerrada' OR ESTADO_PROYECTO = 'Reprogramado') "
                + " GROUP BY TIPO_VALIDACION;";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                // REGISTROS CONSULTADOS
                tipo_calificacion = rs.getString("TIPO_VALIDACIONES");
                cantidades = Double.parseDouble(rs.getString("CONTADOR"));
                dataset.setValue(tipo_calificacion + "\n " + cantidades , cantidades);
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

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
        new Grafica_Validaciones_Tipo_Circular().setVisible(true);
    }
}
