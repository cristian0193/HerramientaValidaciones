package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EstadoValidacionesOriginal extends javax.swing.JFrame {

    public static ConexioSQLite conexion;    
    public static DefaultTableModel modelo;
    
    public EstadoValidacionesOriginal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        combo_semana = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_ejecutadas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_no_ejecutada = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_con_excepciones = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        combo_ano = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADO DE PROYECTOS EJECUTADOS");

        combo_semana.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53" }));
        combo_semana.setToolTipText("Seleccion de Semana para verificacion de reporte");

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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Semana :");

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

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Año :");

        combo_ano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "2016", "2017", "2018", "2019", "2020" }));
        combo_ano.setToolTipText("Seleccion de Semana para verificacion de reporte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_semana, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_ano)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_semana)))
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
        
        int index_semana = combo_semana.getSelectedIndex();
        int index_ano = combo_ano.getSelectedIndex();
        
        if(index_semana == 0){
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA SEMANA");
        }else if (index_ano == 0){
            JOptionPane.showMessageDialog(null, "SELECCIONE UN AÑO");                
        }else{
            String semana = combo_semana.getSelectedItem().toString();
            String ano = combo_ano.getSelectedItem().toString();
            cargar_tabla_ejecutadas(semana,ano);
            cargar_tabla_no_ejecutadas(semana,ano);
            cargar_tabla_con_excepciones(semana,ano);
            
            ancho_columnas_ejecutada();
            ancho_columnas_no_ejecutada();
            ancho_columnas_con_excepciones();
            
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_ano;
    private javax.swing.JComboBox combo_semana;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    void cargar_tabla_ejecutadas(String SEMANA,String ANO) {

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
                    + "AND SEMANA = " + SEMANA + " " 
                    + "AND FECHA_PROPUESTA BETWEEN '" + ANO + "-01-01' AND '" + ANO + "-12-31' "
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
    void cargar_tabla_no_ejecutadas(String SEMANA,String ANO) {

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
                    + "AND SEMANA = " + SEMANA + " "
                    + "AND FECHA_PROPUESTA BETWEEN '" + ANO + "-01-01' AND '" + ANO + "-12-31' "
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
    void cargar_tabla_con_excepciones(String SEMANA, String ANO) {

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
                    + "AND SEMANA = " + SEMANA + " "    
                    + "AND FECHA_PROPUESTA BETWEEN '" + ANO + "-01-01' AND '" + ANO + "-12-31' "
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
