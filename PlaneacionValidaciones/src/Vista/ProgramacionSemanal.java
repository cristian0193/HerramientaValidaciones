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


public class ProgramacionSemanal extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;
    
    public ProgramacionSemanal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_programadas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reprogramadas = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_no_programada = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        date_fecha_Inicio = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAMACION SEMANAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Programadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_programadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_programadas.setRowHeight(22);
        tabla_programadas.setRowMargin(2);
        jScrollPane2.setViewportView(tabla_programadas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reprogramadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_reprogramadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_reprogramadas.setRowHeight(22);
        tabla_reprogramadas.setRowMargin(2);
        tabla_reprogramadas.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tabla_reprogramadas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ejecutada No Programadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_no_programada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_no_programada.setRowHeight(22);
        tabla_no_programada.setRowMargin(2);
        jScrollPane4.setViewportView(tabla_no_programada);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Fecha Inicio :");

        date_fecha_Inicio.setDateFormatString("yyyy-MM-dd");
        date_fecha_Inicio.setMinSelectableDate(new java.util.Date(-62135747930000L));

        jLabel7.setText("Fecha Final :");

        date_fecha_final.setDateFormatString("yyyy-MM-dd");
        date_fecha_final.setMinSelectableDate(new java.util.Date(-62135747930000L));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date_fecha_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_fecha_Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

            cargar_tabla_programadas(fecha_ingresada_inicio, fecha_ingresada_final);
            cargar_tabla_reprogramadas(fecha_ingresada_inicio, fecha_ingresada_final);
            cargar_tabla_noprogramadas(fecha_ingresada_inicio, fecha_ingresada_final);
                    
            ancho_columnas_programadas();
            ancho_columnas_no_programadas();
            ancho_columnas_reprogramada();
            
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla_no_programada;
    private javax.swing.JTable tabla_programadas;
    private javax.swing.JTable tabla_reprogramadas;
    // End of variables declaration//GEN-END:variables

// METODO PARA CARGAR VALIDACIONES PROGRAMADAS    
void cargar_tabla_programadas(String fecha_inicial, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"GCC", "PROYECTO", "TIPO","LIDER","MAQUINA","LOTE", "FECHA"};
        String[] registro = new String[7];
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
                + "FECHA_PROPUESTA AS FECHA_ACTUAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'Programada' "
                + "AND FECHA_PROPUESTA BETWEEN '" + fecha_inicial + "' AND '" + fecha_final + "' "
                + "ORDER BY FECHA_PROPUESTA ASC;";
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
                registro[6] = rs.getString("FECHA_ACTUAL");

                modelo.addRow(registro);                  
            }
            tabla_programadas.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

// METODO PARA CARGAR VALIDACIONES REPROGRAMADAS
void cargar_tabla_reprogramadas(String fecha_inicial, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"GCC", "PROYECTO", "TIPO","LIDER", "MAQUINA","LOTE", "FECHA"};
        String[] registro = new String[7];
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
                + "FECHA_REPROGRAMACION AS FECHA "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'Reprogramado' "
                + "AND FECHA_PROPUESTA BETWEEN '" + fecha_inicial + "' AND '" + fecha_final + "' "
                + "ORDER BY FECHA_REPROGRAMACION ASC;";

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
                registro[6] = rs.getString("FECHA");

                modelo.addRow(registro);
            }
            tabla_reprogramadas.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

// METODO PARA CARGAR VALIDACIONES NO PROGRAMDAS
void cargar_tabla_noprogramadas(String fecha_inicial, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"GCC", "PROYECTO", "TIPO","LIDER", "MAQUINA","LOTE", "FECHA"};
        String[] registro = new String[7];
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
                + "FECHA_PROPUESTA AS FECHA "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ((NO_PROGRAMADA = 'Ejecutada No Programada') AND (ESTADO_PROYECTO NOT IN ('En Creacion','No Ejecutada','Cerrada','Reprogramada'))) "                  
                + "AND FECHA_PROPUESTA BETWEEN '" + fecha_inicial + "' AND '" + fecha_final + "' "
                + "ORDER BY FECHA_REPROGRAMACION ASC;";

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
                registro[6] = rs.getString("FECHA");

                modelo.addRow(registro);
            }
            tabla_no_programada.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

 // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas_programadas() {
        tabla_programadas.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabla_programadas.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabla_programadas.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla_programadas.getColumnModel().getColumn(3).setPreferredWidth(120);
        tabla_programadas.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_programadas.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabla_programadas.getColumnModel().getColumn(6).setPreferredWidth(100);             
    }
    
  // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas_no_programadas() {
        tabla_no_programada.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabla_no_programada.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabla_no_programada.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla_no_programada.getColumnModel().getColumn(3).setPreferredWidth(120);
        tabla_no_programada.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_no_programada.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabla_no_programada.getColumnModel().getColumn(6).setPreferredWidth(100);             
    }
    
      // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas_reprogramada() {
        tabla_reprogramadas.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabla_reprogramadas.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabla_reprogramadas.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla_reprogramadas.getColumnModel().getColumn(3).setPreferredWidth(120);
        tabla_reprogramadas.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_reprogramadas.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabla_reprogramadas.getColumnModel().getColumn(6).setPreferredWidth(100);             
    }
}
