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


public class EstadoValidaciones extends javax.swing.JFrame {

    public static ConexioSQLite conexion;    
    public static DefaultTableModel modelo;
    
    public EstadoValidaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_ejecutadas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_no_ejecutada = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_con_excepciones = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        date_fecha_Inicio = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADO DE PROYECTOS EJECUTADOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ejecutadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_ejecutadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_ejecutadas.setRowHeight(22);
        jScrollPane2.setViewportView(tabla_ejecutadas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "No Ejecutada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_no_ejecutada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_no_ejecutada.setRowHeight(22);
        jScrollPane1.setViewportView(tabla_no_ejecutada);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(102, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Consular");
        jButton1.setToolTipText("Realiza la consulta segun la semana seleccionada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Con Excepciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabla_con_excepciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_con_excepciones.setRowHeight(22);
        jScrollPane3.setViewportView(tabla_con_excepciones);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_fecha_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_fecha_Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
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

            cargar_tabla_ejecutadas(fecha_ingresada_inicio, fecha_ingresada_final);
            cargar_tabla_no_ejecutadas(fecha_ingresada_inicio, fecha_ingresada_final);
            cargar_tabla_con_excepciones(fecha_ingresada_inicio, fecha_ingresada_final);
                    
            ancho_columnas_ejecutada();
            ancho_columnas_con_excepciones();          
            ancho_columnas_no_ejecutada();
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser date_fecha_Inicio;
    public com.toedter.calendar.JDateChooser date_fecha_final;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla_con_excepciones;
    private javax.swing.JTable tabla_ejecutadas;
    private javax.swing.JTable tabla_no_ejecutada;
    // End of variables declaration//GEN-END:variables

    // METODO PARA CARGAR VALIDACIONES EJECUTADAS 
    void cargar_tabla_ejecutadas(String fecha_inicial, String fecha_final) {

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
                    + "FECHA_PROPUESTA AS FECHA_ACTUAL "
                    + "FROM "
                    + "PLANEACIONES_VALIDACION "
                    + "WHERE ESTADO_PROYECTO = 'Ejecutada' "
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
                tabla_ejecutadas.setModel(modelo);

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);

            }
        }

    // METODO PARA CARGAR VALIDACIONES NO EJECUTADAS 
    void cargar_tabla_no_ejecutadas(String fecha_inicial, String fecha_final) {

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
                    + "FECHA_PROPUESTA AS FECHA_ACTUAL "
                    + "FROM "
                    + "PLANEACIONES_VALIDACION "
                    + "WHERE ESTADO_PROYECTO = 'No Ejecutada' "
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
                tabla_no_ejecutada.setModel(modelo);

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);

            }
        }

    // METODO PARA CARGAR VALIDACIONES CON EXCEPCION 
    void cargar_tabla_con_excepciones(String fecha_inicial, String fecha_final) {

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
                    + "FECHA_PROPUESTA AS FECHA_ACTUAL "
                    + "FROM "
                    + "PLANEACIONES_VALIDACION "
                    + "WHERE (ESTADO_PROYECTO = 'Programada' AND RESPUESTA = 'SI')"
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
                    registro[6] = rs.getString("FECHA_ACTUAL");

                    modelo.addRow(registro);
                }
                tabla_con_excepciones.setModel(modelo);

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);

            }
        }
    
    // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas_ejecutada() {
        tabla_ejecutadas.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabla_ejecutadas.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabla_ejecutadas.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla_ejecutadas.getColumnModel().getColumn(3).setPreferredWidth(120);
        tabla_ejecutadas.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_ejecutadas.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabla_ejecutadas.getColumnModel().getColumn(6).setPreferredWidth(100);             
    }
    
    // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas_no_ejecutada() {
        tabla_no_ejecutada.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabla_no_ejecutada.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabla_no_ejecutada.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla_no_ejecutada.getColumnModel().getColumn(3).setPreferredWidth(120);
        tabla_no_ejecutada.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_no_ejecutada.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabla_no_ejecutada.getColumnModel().getColumn(6).setPreferredWidth(100);             
    }
    
    // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas_con_excepciones() {
        tabla_con_excepciones.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabla_con_excepciones.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabla_con_excepciones.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla_con_excepciones.getColumnModel().getColumn(3).setPreferredWidth(120);
        tabla_con_excepciones.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_con_excepciones.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabla_con_excepciones.getColumnModel().getColumn(6).setPreferredWidth(100);             
    }

}
