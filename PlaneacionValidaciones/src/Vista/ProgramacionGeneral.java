package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProgramacionGeneral extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;

    public ProgramacionGeneral() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_programacion_general = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        date_fecha_Inicio = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAMACION GENERAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        tabla_programacion_general.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_programacion_general.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_programacion_general.setRowHeight(23);
        tabla_programacion_general.setRowMargin(2);
        tabla_programacion_general.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(tabla_programacion_general);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_buscar.setBackground(new java.awt.Color(102, 255, 0));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_buscar.setText("Consultar");
        btn_buscar.setToolTipText("Realiza la consulta segun la semana seleccionada");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        date_fecha_Inicio.setDateFormatString("yyyy-MM-dd");
        date_fecha_Inicio.setMinSelectableDate(new java.util.Date(-62135747930000L));

        jLabel6.setText("Fecha Inicio :");

        jLabel7.setText("Fecha Final :");

        date_fecha_final.setDateFormatString("yyyy-MM-dd");
        date_fecha_final.setMinSelectableDate(new java.util.Date(-62135747930000L));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_fecha_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_fecha_Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        if (this.date_fecha_Inicio.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
        } else if (this.date_fecha_final.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
        } else {

            String formato1 = date_fecha_Inicio.getDateFormatString();
            Date date1 = (Date) date_fecha_Inicio.getDate();
            SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
            String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

            String formato2 = date_fecha_final.getDateFormatString();
            Date date2 = (Date) date_fecha_final.getDate();
            SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
            String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

            cargar_tabla_programadas_general(fecha_ingresada_inicio, fecha_ingresada_final);

            ancho_columnas_programadas();
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    public com.toedter.calendar.JDateChooser date_fecha_Inicio;
    public com.toedter.calendar.JDateChooser date_fecha_final;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_programacion_general;
    // End of variables declaration//GEN-END:variables

// METODO PARA CARGAR VALIDACIONES PROGRAMADAS    
    void cargar_tabla_programadas_general(String fecha_inicio, String fecha_fin) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"GCC", "PROYECTO", "TIPO", "LIDER", "MAQUINA", "LOTE","ESTADO", "FECHA", "REPRO","NO_PROGRAMADA"};
        String[] registro = new String[10];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "NO_PROGRAMADA AS NO_PROGRAMADA "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE (ESTADO_PROYECTO = 'Programada' OR ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Con Excepcion' OR ESTADO_PROYECTO = 'Reprogramada' OR ESTADO_PROYECTO = 'No Ejecutada' OR ESTADO_PROYECTO = 'No Ejecutada' OR NO_PROGRAMADA = 'Ejecutada No Programada') "
                + "AND FECHA_PROPUESTA BETWEEN '" + fecha_inicio + "' AND '" + fecha_fin + "' "
                + "ORDER BY ESTADO_PROYECTO ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("GCC");
                registro[1] = rs.getString("PROYECTO");
                registro[2] = rs.getString("TIPO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("MAQUINA");
                registro[5] = rs.getString("LOTE");
                registro[6] = rs.getString("ESTADO");
                registro[7] = rs.getString("FECHA_ACTUAL");
                registro[8] = rs.getString("FECHA_REPRO");
                registro[9] = rs.getString("NO_PROGRAMADA");

                modelo.addRow(registro);
            }
            tabla_programacion_general.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas_programadas() {
        tabla_programacion_general.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabla_programacion_general.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabla_programacion_general.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla_programacion_general.getColumnModel().getColumn(3).setPreferredWidth(120);
        tabla_programacion_general.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_programacion_general.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabla_programacion_general.getColumnModel().getColumn(6).setPreferredWidth(100);
    }

}
