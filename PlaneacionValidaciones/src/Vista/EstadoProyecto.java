package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EstadoProyecto extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;
    public static int validacion_pendiente_cal = 0;
    public static int validacion_pendiente_pro = 0;

    public EstadoProyecto() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_estados();
        ancho_columnas();
        centrar_datos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proyectos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha_inicio = new com.toedter.calendar.JDateChooser();
        txt_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_lider_consulta = new javax.swing.JTextField();
        combo_consulta = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        combo_estado_consulta = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        btn_refrescar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_gcc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones_programacion = new javax.swing.JTextArea();
        txt_registro_pro = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        combo_estado = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1058, 670));
        setPreferredSize(new java.awt.Dimension(1100, 663));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADO DE PROYECTO DE VALIDACION Ó CALIFICACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 40));

        jLabel6.setText("Numero Registro :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 20));

        tabla_proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_proyectos.setRowHeight(23);
        tabla_proyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_proyectosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_proyectos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 268, 1050, 360));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos para Consultar"));

        jLabel2.setText("Fecha Inicial :");

        jLabel3.setText("Fecha Final :");

        txt_fecha_inicio.setToolTipText("Fecha de Inicio de consulta");
        txt_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        txt_fecha_inicio.setEnabled(false);

        txt_fecha_final.setToolTipText("Fecha de Fin de consulta");
        txt_fecha_final.setDateFormatString("yyyy-MM-dd");
        txt_fecha_final.setEnabled(false);

        jLabel4.setText("Lider Tecnico :");

        btn_buscar.setBackground(new java.awt.Color(102, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setToolTipText("Permite realizar la consulta segun la seleccion del filtro");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_lider_consulta.setToolTipText("Lider encargado de la ejecucion del proyecto");
        txt_lider_consulta.setEnabled(false);

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "FECHA PROPUESTA", "LIDER TECNICO", "ESTADO", "GCC" }));
        combo_consulta.setToolTipText("Permite Seleccioar el Filtro con el que se realiara la consulta");
        combo_consulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_consultaItemStateChanged(evt);
            }
        });
        combo_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_consultaActionPerformed(evt);
            }
        });

        jLabel15.setText("Filtro :");

        combo_estado_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Ejecutada", "Programada", "Ejecutada No Programada" }));
        combo_estado_consulta.setToolTipText("Filtro para verificacion por estado");
        combo_estado_consulta.setEnabled(false);

        jLabel7.setText("Estado :");

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 0));
        btn_refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        jLabel5.setText("GCC/APR :");

        txt_gcc.setToolTipText("Lider encargado de la ejecucion del proyecto");
        txt_gcc.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_estado_consulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_lider_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_refrescar)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_fecha_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_refrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txt_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txt_lider_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_estado_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1050, 110));

        txt_observaciones_programacion.setColumns(20);
        txt_observaciones_programacion.setRows(5);
        txt_observaciones_programacion.setToolTipText("Campo para observaciones del Proyecto");
        jScrollPane2.setViewportView(txt_observaciones_programacion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 570, 80));

        txt_registro_pro.setEditable(false);
        txt_registro_pro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_registro_pro.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_pro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_registro_pro.setToolTipText("Numero del Registro del Proyecto");
        getContentPane().add(txt_registro_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));

        btn_actualizar.setBackground(new java.awt.Color(102, 255, 102));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setToolTipText("Permite Realizar la actualizacion del estado del proyecto");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 100, 80));

        jLabel8.setText("Cambio de Estado :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 20));

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Ejecutada", "No Ejecutada", "Cerrada" }));
        combo_estado.setToolTipText("Seleccion de Estado para Cambio en la validacion");
        getContentPane().add(combo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 170, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("*");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("*");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 60, -1, 20));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (txt_registro_pro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " SELECCIONE UN REGISTRO DE LA TABLA");
        } else if (combo_estado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, " SELECCIONE EL ESTADO");
        } else if (txt_observaciones_programacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " INGRESE JUSTIFICACIÓN");
        } else {

            String num_registro = txt_registro_pro.getText();
            String estado = combo_estado.getSelectedItem().toString();

            int EHS = validacionEHS(num_registro, estado);

            if (EHS == 1) {

                String observacion = txt_observaciones_programacion.getText();

                if (this.txt_fecha_inicio.getDate() == null || this.txt_fecha_final.getDate() == null) {

                    // EJECUCIÓN DE ACTUALIZACION
                    boolean resultado = conexion.upgrade_estado(num_registro, estado, observacion);

                    if (resultado == true) {
                        JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                        LimpiarCampos();
                        cargar_tabla_estados();
                        ancho_columnas();
                        centrar_datos();

                        conexion.cerrar();
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                        LimpiarCampos();
                    }

                } else {

                    // CONVERSION DE FECHAS (DATE A STRING)
                    String formato1 = txt_fecha_inicio.getDateFormatString();
                    Date date1 = (Date) txt_fecha_inicio.getDate();
                    SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                    String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

                    // CONVERSION DE FECHAS (DATE A STRING)
                    String formato2 = txt_fecha_final.getDateFormatString();
                    Date date2 = (Date) txt_fecha_final.getDate();
                    SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
                    String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

                    // EJECUCIÓN DE ACTUALIZACION
                    boolean resultado = conexion.upgrade_estado(num_registro, estado, observacion);

                    if (resultado == true) {
                        JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                        LimpiarCampos();
                        cargar_tabla_estados();
                        consulta_rango_fechas_propuesta(fecha_ingresada_inicio, fecha_ingresada_final);
                        ancho_columnas();
                        centrar_datos();

                        conexion.cerrar();
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                        LimpiarCampos();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "NO SE PERMITE EL CIERRE DEL PROYECTO \n "
                        + "POR PENDIENTES EN VALIDACIÓN DE EHS",
                        "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void tabla_proyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_proyectosMouseClicked

        // CAPTURA DE DATOS AL SER SELECCIONADO EN TABLA
        int rec;

        rec = this.tabla_proyectos.getSelectedRow();

        this.txt_registro_pro.setText(tabla_proyectos.getValueAt(rec, 0).toString());
        this.txt_observaciones_programacion.setText(tabla_proyectos.getValueAt(rec, 8).toString());

    }//GEN-LAST:event_tabla_proyectosMouseClicked

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 1:
                this.txt_fecha_inicio.setEnabled(true);
                this.txt_fecha_final.setEnabled(true);
                this.txt_lider_consulta.setEditable(false);
                this.txt_lider_consulta.setEnabled(false);
                this.combo_estado_consulta.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 2:
                this.txt_lider_consulta.setEditable(true);
                this.txt_lider_consulta.setEnabled(true);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.combo_estado_consulta.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 3:
                this.combo_estado_consulta.setEditable(true);
                this.combo_estado_consulta.setEnabled(true);
                this.txt_lider_consulta.setEnabled(false);
                this.txt_lider_consulta.setEditable(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 4:
                this.combo_estado_consulta.setEditable(false);
                this.combo_estado_consulta.setEnabled(false);
                this.txt_lider_consulta.setEnabled(false);
                this.txt_lider_consulta.setEditable(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_gcc.setEditable(true);
                this.txt_gcc.setEnabled(true);
                break;
             default:
                this.combo_estado_consulta.setEditable(false);
                this.combo_estado_consulta.setEnabled(false);
                this.txt_lider_consulta.setEnabled(false);
                this.txt_lider_consulta.setEditable(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
        }

    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_consultaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 0:
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCIÓN");
                break;
            case 1:
                // CONSULTA POR RANGO DE FECHAS
                if (this.txt_fecha_inicio.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
                } else if (this.txt_fecha_final.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
                } else {

                    // CONVERSION DE FECHAS (DATE A STRING)
                    String formato1 = txt_fecha_inicio.getDateFormatString();
                    Date date1 = (Date) txt_fecha_inicio.getDate();
                    SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                    String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

                    // CONVERSION DE FECHAS (DATE A STRING)
                    String formato2 = txt_fecha_final.getDateFormatString();
                    Date date2 = (Date) txt_fecha_final.getDate();
                    SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
                    String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

                    // EJECUCIÓN DE CONSULTA A LA BASE DE DATOS
                    consulta_rango_fechas_propuesta(fecha_ingresada_inicio, fecha_ingresada_final);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
            case 2:

                // CONSULTA POR LIDER                
                String lider = txt_lider_consulta.getText();

                if (lider.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE LIDER TECNICO");
                } else {
                    consulta_lider(lider);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
            case 3:

                // CONSULTA POR ESTADO
                int registro = combo_estado_consulta.getSelectedIndex();

                if (registro == 0) {
                    JOptionPane.showMessageDialog(null, "SELECCIONAR UN ESTADO");
                } else {
                    String registros = combo_estado_consulta.getSelectedItem().toString();
                    consulta_estado(registros);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
            default:

                // CONSULTA POR GCC
                String gcc = txt_gcc.getText();

                if (gcc.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE NUMERO GCC");
                } else {
                    consulta_gcc(gcc);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }
                break;
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed

        // ACCION DEL BOTON REFRESCAR
        cargar_tabla_estados();
        ancho_columnas();
        centrar_datos();
        LimpiarCampos();
    }//GEN-LAST:event_btn_refrescarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JComboBox combo_estado;
    private javax.swing.JComboBox combo_estado_consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_proyectos;
    private com.toedter.calendar.JDateChooser txt_fecha_final;
    private com.toedter.calendar.JDateChooser txt_fecha_inicio;
    private javax.swing.JTextField txt_gcc;
    private javax.swing.JTextField txt_lider_consulta;
    private javax.swing.JTextArea txt_observaciones_programacion;
    public static javax.swing.JTextField txt_registro_pro;
    // End of variables declaration//GEN-END:variables

    // METODO PARA LIMPIAR CAMPOS
    public void LimpiarCampos() {
        txt_registro_pro.setText("");
        txt_observaciones_programacion.setText("");
        combo_estado.setSelectedIndex(0);
    }

    // METODO PARA CARGAR TABLA DE DATOS
    void cargar_tabla_estados() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        // TITULOS DE TABLA DE DATOS
        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "TIPO", "FECHA ACTUAL", "REPROGRAMA", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS REPROGRAMA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'Programada' "
                + "OR ESTADO_PROYECTO = 'Reprogramado' "
                + "OR ESTADO_PROYECTO = 'Ejecutada' "
                + "OR ESTADO_PROYECTO = 'Ejecutada No Programada' "
                + "ORDER BY FECHA_PROPUESTA";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                String com_repro = "";
                String com_registro = "";
                String com_excepciones = "";
                String comentario_final = "";

                com_registro = rs.getString("OBSER_VAL");
                com_repro = rs.getString("OBSER_REPRO");
                com_excepciones = rs.getString("EXPECIONES");

                comentario_final = "" + com_registro + "\n"
                        + "" + com_repro + "\n"
                        + "" + com_excepciones + "";

                // REGISTROS CONSULTADOS
                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("TIPO");
                registro[5] = rs.getString("FECHA_ACTUAL");
                registro[6] = rs.getString("REPROGRAMA");
                registro[7] = rs.getString("ESTADO");
                registro[8] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR RANGO DE FECHAS
    void consulta_rango_fechas_propuesta(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        // TITULOS DE TABLA DE DATOS
        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "TIPO", "FECHA ACTUAL", "REPROGRAMA", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS REPROGRAMA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "FECHA_PROPUESTA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "' AND"
                + "(ESTADO_PROYECTO NOT IN ('En Creacion','No Ejecutada','Cerrada','Reprogramada')) "
                + "ORDER BY FECHA_PROPUESTA";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                String com_repro = "";
                String com_registro = "";
                String com_excepciones = "";
                String comentario_final = "";

                com_registro = rs.getString("OBSER_VAL");
                com_repro = rs.getString("OBSER_REPRO");
                com_excepciones = rs.getString("EXPECIONES");

                comentario_final = "" + com_registro + "\n"
                        + "" + com_repro + "\n"
                        + "" + com_excepciones + "";

                // REGISTROS CONSULTADOS
                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("TIPO");
                registro[5] = rs.getString("FECHA_ACTUAL");
                registro[6] = rs.getString("REPROGRAMA");
                registro[7] = rs.getString("ESTADO");
                registro[8] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR LIDER
    void consulta_lider(String lider) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        // TITULOS DE TABLA DE DATOS
        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "TIPO", "FECHA ACTUAL", "REPROGRAMA", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS REPROGRAMA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "LIDER_TECNICO LIKE '%" + lider.toUpperCase().trim() + "%' AND "
                + "(ESTADO_PROYECTO NOT IN ('En Creacion','No Ejecutada','Cerrada','Reprogramada')) "
                + "ORDER BY FECHA_PROPUESTA";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                String com_repro = "";
                String com_registro = "";
                String com_excepciones = "";
                String comentario_final = "";

                com_registro = rs.getString("OBSER_VAL");
                com_repro = rs.getString("OBSER_REPRO");
                com_excepciones = rs.getString("EXPECIONES");

                comentario_final = "" + com_registro + "\n"
                        + "" + com_repro + "\n"
                        + "" + com_excepciones + "";

                // REGISTROS CONSULTADOS
                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("TIPO");
                registro[5] = rs.getString("FECHA_ACTUAL");
                registro[6] = rs.getString("REPROGRAMA");
                registro[7] = rs.getString("ESTADO");
                registro[8] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR ESTADO
    void consulta_estado(String estado) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        // TITULOS DE TABLA DE DATOS
        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "TIPO", "FECHA ACTUAL", "REPROGRAMA", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = " SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS REPROGRAMA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "ESTADO_PROYECTO = '" + estado + "' AND "
                + "(ESTADO_PROYECTO NOT IN ('En Creacion','No Ejecutada','Cerrada','Reprogramada')) "
                + "ORDER BY FECHA_PROPUESTA";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                String com_repro = "";
                String com_registro = "";
                String com_excepciones = "";
                String comentario_final = "";

                com_registro = rs.getString("OBSER_VAL");
                com_repro = rs.getString("OBSER_REPRO");
                com_excepciones = rs.getString("EXPECIONES");

                comentario_final = "" + com_registro + "\n"
                        + "" + com_repro + "\n"
                        + "" + com_excepciones + "";

                // REGISTROS CONSULTADOS
                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("TIPO");
                registro[5] = rs.getString("FECHA_ACTUAL");
                registro[6] = rs.getString("REPROGRAMA");
                registro[7] = rs.getString("ESTADO");
                registro[8] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR GCC
    void consulta_gcc(String gcc) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        // TITULOS DE TABLA DE DATOS
        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "TIPO", "FECHA ACTUAL", "REPROGRAMA", "ESTADO", "OBSERVACIONES"};
        String[] registro = new String[9];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS REPROGRAMA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "GCC_APR = '" + gcc.toUpperCase().trim() + "' AND "
                + "(ESTADO_PROYECTO NOT IN ('En Creacion','No Ejecutada','Cerrada','Reprogramada')) "
                + "ORDER BY FECHA_PROPUESTA";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                String com_repro = "";
                String com_registro = "";
                String com_excepciones = "";
                String comentario_final = "";

                com_registro = rs.getString("OBSER_VAL");
                com_repro = rs.getString("OBSER_REPRO");
                com_excepciones = rs.getString("EXPECIONES");

                comentario_final = "" + com_registro + "\n"
                        + "" + com_repro + "\n"
                        + "" + com_excepciones + "";

                // REGISTROS CONSULTADOS
                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("TIPO");
                registro[5] = rs.getString("FECHA_ACTUAL");
                registro[6] = rs.getString("REPROGRAMA");
                registro[7] = rs.getString("ESTADO");
                registro[8] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA VALIDAR SI UNA VALIDACION EHS SE ENCUENTRA OK O PENDIENTE
    public int validacionEHS(String gcc, String estado) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query;
        int contador = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT ESTADO_EHS AS EHS, PRE_CAL_RU_NO_GXP AS PRE "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "NUMERO_REGISTRO = '" + gcc.toUpperCase().trim() + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                // REGISTROS CONSULTADOS
                String impacto = rs.getString("EHS");
                String prerequisito = rs.getString("PRE");

                if (estado.equals("Cerrada")) {
                    if (prerequisito.equals("SI") && impacto.equals("En Proceso")) {
                        contador = 0;
                    } else if (prerequisito.equals("SI") && impacto.equals("")) {
                        contador = 0;
                    } else if (prerequisito.equals("SI") && impacto.equals("Completo")) {
                        contador = 1;
                    } else {
                        contador = 1;
                    }
                } else {
                    contador = 1;
                }

            }
            conexion.cerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return contador;
    }

    // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas() {
        tabla_proyectos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_proyectos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabla_proyectos.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabla_proyectos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabla_proyectos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_proyectos.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabla_proyectos.getColumnModel().getColumn(6).setPreferredWidth(100);
        tabla_proyectos.getColumnModel().getColumn(7).setPreferredWidth(100);
    }

    // METODO PARA CENTRAR DATOS DE TABLA
    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_proyectos.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tabla_proyectos.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        tabla_proyectos.getColumnModel().getColumn(5).setCellRenderer(Alinear);
        tabla_proyectos.getColumnModel().getColumn(6).setCellRenderer(Alinear);
    }

}
