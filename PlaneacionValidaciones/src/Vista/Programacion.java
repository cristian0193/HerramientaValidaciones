package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Programacion extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;
    public static int validacion_pendiente_cal = 0;
    public static int validacion_pendiente_pro = 0;

    public Programacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_programaciones();
        ancho_columnas();
        centrar_datos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proyectos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha_inicio = new com.toedter.calendar.JDateChooser();
        txt_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_palabra_clave_consulta = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        txt_lider_consulta = new javax.swing.JTextField();
        combo_consulta = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_gcc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones_programacion = new javax.swing.JTextArea();
        txt_registro_pro = new javax.swing.JTextField();
        btn_programar = new javax.swing.JButton();
        date_fecha_nueva = new javax.swing.JTextField();
        txt_fecha_propuesta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1090, 690));
        setPreferredSize(new java.awt.Dimension(1090, 690));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAMACION DE VALIDACION Ó CALIFICACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 30));

        jLabel6.setText("Numero Registro :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 20));

        jLabel7.setText("Estado Proyecto :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 20));

        tabla_proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_proyectos.setRowHeight(22);
        tabla_proyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_proyectosMouseClicked(evt);
            }
        });
        tabla_proyectos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_proyectosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_proyectos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 278, 1050, 370));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos para Consultar"));

        jLabel2.setText("Fecha Inicial :");

        jLabel3.setText("Fecha Final :");

        txt_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        txt_fecha_inicio.setEnabled(false);

        txt_fecha_final.setDateFormatString("yyyy-MM-dd");
        txt_fecha_final.setEnabled(false);

        jLabel4.setText("Lider Tecnico :");

        jLabel5.setText("Palabra Clave :");

        txt_palabra_clave_consulta.setEnabled(false);

        btn_buscar.setBackground(new java.awt.Color(102, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_lider_consulta.setEnabled(false);

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "FECHA PROPUESTA", "LIDER TECNICO", "PALABRA CLAVE", "GCC" }));
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

        jLabel15.setText("Seleccionar Filtro :");

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Refrescar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("GCC/APR :");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_palabra_clave_consulta)
                    .addComponent(txt_lider_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_lider_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txt_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_palabra_clave_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_fecha_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_buscar)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1060, 110));

        txt_observaciones_programacion.setColumns(20);
        txt_observaciones_programacion.setRows(5);
        jScrollPane2.setViewportView(txt_observaciones_programacion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 620, 90));

        txt_registro_pro.setEditable(false);
        txt_registro_pro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_registro_pro.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_pro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_registro_pro.setToolTipText("Numero de Registro del Proyecto");
        getContentPane().add(txt_registro_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        btn_programar.setBackground(new java.awt.Color(102, 255, 102));
        btn_programar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_programar.setText("Programar");
        btn_programar.setToolTipText("Permite programar un validacion en estado En Creacion");
        btn_programar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_programarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_programar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 90));

        date_fecha_nueva.setEditable(false);
        date_fecha_nueva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        date_fecha_nueva.setForeground(new java.awt.Color(255, 0, 0));
        date_fecha_nueva.setToolTipText("Estado actual de la validacion programada");
        getContentPane().add(date_fecha_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, -1));

        txt_fecha_propuesta.setEditable(false);
        txt_fecha_propuesta.setToolTipText("Fecha Propuesta del Proyecto");
        getContentPane().add(txt_fecha_propuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, -1));

        jLabel8.setText("Fecha Propuesta :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_programarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_programarActionPerformed

        String registro = txt_registro_pro.getText();

        if (txt_registro_pro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " SELECCIONE UN REGISTRO DE LA TABLA");
        } else {
            validacion_pendiente_cal = 0;
            validacion_pendiente_pro = 0;

            int Validacion_cal = Validar_Prerequisitos_Calificacion(registro);
            int Validacion_pro = Validar_Prerequisitos_Proceso(registro);

            if (Validacion_cal > 0) {
                JOptionPane.showMessageDialog(null, " TIENE : " + Validacion_cal + " PENDIENTES PREREQUISITOS DE CALIFICACION ");
            } else if (Validacion_pro > 0) {
                JOptionPane.showMessageDialog(null, " TIENE : " + Validacion_pro + " PENDIENTES PREREQUISITOS DE PROCESO ");
            } else {
                try {
                    int validacionProgramacionSemanaProceso = 0;
                    String tipo = "", lote = "";
                    int contadorSemanas = 0;
                    int contadorLote = 0;
                    int lotesIngresados = 0;

                    String registro_pro = txt_registro_pro.getText();
                    String observacion = txt_observaciones_programacion.getText();
                    String fecha = txt_fecha_propuesta.getText();

                    int rec = this.tabla_proyectos.getSelectedRow();
                    tipo = tabla_proyectos.getValueAt(rec, 6).toString();

                    int validacionProgramacion = verificacionSemanas(fecha, tipo);

                    //Conversin de fecha String a Date
                    SimpleDateFormat convertifecha = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = convertifecha.parse(fecha);

                    int semana = numeroSemanas(date);
                    DateFormat formatoFecha = new SimpleDateFormat("YYYY");
                    int año = Integer.parseInt(formatoFecha.format(date));

                    //Validacion de semanas programadas Jueves, Vienes, Sabado y Domingo
                    validacionProgramacionSemanaProceso = validacionSemanaProceso((semana - 1), año);

                    //Validacion de Lotes Permitidos
                    contadorSemanas = contadorSemana(semana, tipo, año);
                    contadorLote = contadorLotes(semana, tipo);
                    lote = Registro_Lote(registro_pro);
                    lotesIngresados = Integer.parseInt(lote);

                    //VALIDACION CANTIDAD DE LOTES MAYORES A 3 (PROCESO)
                    int resultadoTotalLotes = contadorLote + lotesIngresados;

                    if (tipo.equals("PROCESO")) {
                        if (validacionProgramacion >= 1 || validacionProgramacionSemanaProceso > 0 || resultadoTotalLotes > 3 || contadorSemanas > 3) {

                            int confirmado = JOptionPane.showConfirmDialog(null, "ESTA SEMANA YA TIENE LA CAPACIADAD DE VALIDACIONES PROGRAMADAS COMPLETAS "
                                    + "\n PARA TIPO : " + tipo + " \n ¿ desea programar ?", "Capacidad Completa", JOptionPane.INFORMATION_MESSAGE);

                            if (JOptionPane.OK_OPTION == confirmado) {

                                ObservacionProgramacion justificacion = new ObservacionProgramacion();
                                justificacion.setVisible(true);
                                justificacion.txt_registro_principal.setText(this.txt_registro_pro.getText());

                            } else {

                            }

                        } else {

                            if (this.txt_fecha_inicio.getDate() == null || this.txt_fecha_final.getDate() == null) {

                                // EJECUCIÓN DE ACTUALIZACION
                                boolean resultado = conexion.upgrade_programacion(registro_pro, "Programada", observacion);

                                if (resultado == true) {
                                    JOptionPane.showMessageDialog(null, "PROYECTO PROGRAMADO");
                                    LimpiarCampos();
                                    cargar_tabla_programaciones();                                   
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

                                boolean resultado = conexion.upgrade_programacion(registro_pro, "Programada", observacion);

                                if (resultado == true) {
                                    JOptionPane.showMessageDialog(null, "PROYECTO PROGRAMADO");
                                    LimpiarCampos();
                                    cargar_tabla_programaciones();
                                    consulta_rango_fechas_propuesta(fecha_ingresada_inicio, fecha_ingresada_final);
                                    ancho_columnas();
                                    centrar_datos();
                                    conexion.cerrar();
                                } else {
                                    JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                                    LimpiarCampos();
                                }
                            }

                        }
                    } else {
                        if (validacionProgramacion >= 1 || contadorSemanas > 3) {

                            int confirmado = JOptionPane.showConfirmDialog(null, "ESTA SEMANA YA TIENE LA CAPACIADAD DE VALIDACIONES PROGRAMADAS COMPLETAS "
                                    + "\n PARA TIPO : " + tipo + " \n ¿ desea programar ?", "Capacidad Completa", JOptionPane.INFORMATION_MESSAGE);

                            if (JOptionPane.OK_OPTION == confirmado) {

                                ObservacionProgramacion justificacion = new ObservacionProgramacion();
                                justificacion.setVisible(true);
                                justificacion.txt_registro_principal.setText(this.txt_registro_pro.getText());

                            } else {

                            }

                        } else {
                           if (this.txt_fecha_inicio.getDate() == null || this.txt_fecha_final.getDate() == null) {

                                // EJECUCIÓN DE ACTUALIZACION
                                boolean resultado = conexion.upgrade_programacion(registro_pro, "Programada", observacion);

                                if (resultado == true) {
                                    JOptionPane.showMessageDialog(null, "PROYECTO PROGRAMADO");
                                    LimpiarCampos();
                                    cargar_tabla_programaciones();                                   
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

                                boolean resultado = conexion.upgrade_programacion(registro_pro, "Programada", observacion);

                                if (resultado == true) {
                                    JOptionPane.showMessageDialog(null, "PROYECTO PROGRAMADO");
                                    LimpiarCampos();
                                    cargar_tabla_programaciones();
                                    consulta_rango_fechas_propuesta(fecha_ingresada_inicio, fecha_ingresada_final);
                                    ancho_columnas();
                                    centrar_datos();
                                    conexion.cerrar();
                                } else {
                                    JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                                    LimpiarCampos();
                                }
                            }
                        }
                    }

                } catch (ParseException ex) {
                    Logger.getLogger(Programacion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }


    }//GEN-LAST:event_btn_programarActionPerformed

    private void tabla_proyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_proyectosMouseClicked
        int rec = this.tabla_proyectos.getSelectedRow();

        this.txt_registro_pro.setText(tabla_proyectos.getValueAt(rec, 0).toString());
        this.txt_fecha_propuesta.setText(tabla_proyectos.getValueAt(rec, 4).toString());
        this.date_fecha_nueva.setText(tabla_proyectos.getValueAt(rec, 5).toString());
        this.txt_observaciones_programacion.setText(tabla_proyectos.getValueAt(rec, 7).toString());

    }//GEN-LAST:event_tabla_proyectosMouseClicked

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 1:
                this.txt_fecha_inicio.setEnabled(true);
                this.txt_fecha_final.setEnabled(true);
                this.txt_lider_consulta.setEditable(false);
                this.txt_palabra_clave_consulta.setEditable(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 2:
                this.txt_lider_consulta.setEditable(true);
                this.txt_lider_consulta.setEnabled(true);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_palabra_clave_consulta.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 3:
                this.txt_palabra_clave_consulta.setEditable(true);
                this.txt_palabra_clave_consulta.setEnabled(true);
                this.txt_lider_consulta.setEnabled(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 4:
                this.txt_palabra_clave_consulta.setEditable(false);
                this.txt_palabra_clave_consulta.setEnabled(false);
                this.txt_lider_consulta.setEnabled(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_gcc.setEditable(true);
                this.txt_gcc.setEnabled(true);
                break;
            default:
                this.txt_palabra_clave_consulta.setEditable(false);
                this.txt_palabra_clave_consulta.setEnabled(false);
                this.txt_lider_consulta.setEnabled(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
        }


    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed

    }//GEN-LAST:event_combo_consultaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        int index = combo_consulta.getSelectedIndex();

        if (index == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
        } else if (index == 1) {

            if (this.txt_fecha_inicio.getDate() == null) {
                JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
            } else if (this.txt_fecha_final.getDate() == null) {
                JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
            } else {
                String formato1 = txt_fecha_inicio.getDateFormatString();
                Date date1 = (Date) txt_fecha_inicio.getDate();
                SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

                String formato2 = txt_fecha_final.getDateFormatString();
                Date date2 = (Date) txt_fecha_final.getDate();
                SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
                String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

                consulta_rango_fechas_propuesta(fecha_ingresada_inicio, fecha_ingresada_final);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }

        } else if (index == 2) {

            String lider = txt_lider_consulta.getText();

            if (lider.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE LIDER TECNICO");
            } else {
                consulta_lider(lider);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }

        } else if (index == 3) {
            String registro = txt_palabra_clave_consulta.getText();

            if (registro.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE REGISTRO NUMERICO");
            } else {
                consulta_palabra_clave(registro);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }
        } else {
            String gcc = txt_gcc.getText();

            if (gcc.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE NUMERO DE GCC/APR");
            } else {
                consulta_GCC(gcc);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }
        }


    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cargar_tabla_programaciones();
        ancho_columnas();
        centrar_datos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabla_proyectosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_proyectosKeyPressed

    }//GEN-LAST:event_tabla_proyectosKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_programar;
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JTextField date_fecha_nueva;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_proyectos;
    private com.toedter.calendar.JDateChooser txt_fecha_final;
    private com.toedter.calendar.JDateChooser txt_fecha_inicio;
    private javax.swing.JTextField txt_fecha_propuesta;
    private javax.swing.JTextField txt_gcc;
    private javax.swing.JTextField txt_lider_consulta;
    private javax.swing.JTextArea txt_observaciones_programacion;
    private javax.swing.JTextField txt_palabra_clave_consulta;
    public static javax.swing.JTextField txt_registro_pro;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_registro_pro.setText("");
        date_fecha_nueva.setText("");
        txt_fecha_propuesta.setText("");
        txt_observaciones_programacion.setText("");
        // combo_motivo.setSelectedIndex(0);
    }

    public void cargar_tabla_programaciones() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "TIPO", "OBSERVACIONES"};
        String[] registro = new String[8];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE (ESTADO_PROYECTO = 'En Creacion' "
                + "OR ESTADO_PROYECTO = 'Con Excepcion') "
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

                comentario_final = "REGISTRO : " + com_registro + "\n"
                        + "REPROGRAMACION : " + com_repro + "\n"
                        + "EXCEPCION : " + com_excepciones + "";

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("TIPO");
                registro[7] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_rango_fechas_propuesta(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "TIPO", "OBSERVACIONES"};
        String[] registro = new String[8];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE (ESTADO_PROYECTO = 'En Creacion' "
                + "OR ESTADO_PROYECTO = 'Con Excepcion') AND "
                + "FECHA_PROPUESTA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "' "
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

                comentario_final = "REGISTRO : " + com_registro + "\n"
                        + "REPROGRAMACION : " + com_repro + "\n"
                        + "EXCEPCION : " + com_excepciones + "";

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("TIPO");
                registro[7] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_lider(String lider) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "TIPO", "OBSERVACIONES"};
        String[] registro = new String[8];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "LIDER_TECNICO LIKE '%" + lider.toUpperCase().trim() + "%' AND"
                + "(ESTADO_PROYECTO NOT IN ('Reprogramado','No Ejecutada','No Programada','Cerrada','Programada','Ejecutada')) "
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

                comentario_final = "REGISTRO : " + com_registro + "\n"
                        + "REPROGRAMACION : " + com_repro + "\n"
                        + "EXCEPCION : " + com_excepciones + "";

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("TIPO");
                registro[7] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_palabra_clave(String palabra) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "TIPO", "OBSERVACIONES"};
        String[] registro = new String[8];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "(ESTADO_PROYECTO = 'En Creacion' "
                + "OR ESTADO_PROYECTO = 'Con Excepcion') AND "
                + "NOMBRE_PROYECTO LIKE '%" + palabra.toUpperCase() + "%' "
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

                comentario_final = "REGISTRO : " + com_registro + "\n"
                        + "REPROGRAMACION : " + com_repro + "\n"
                        + "EXCEPCION : " + com_excepciones + "";

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("TIPO");
                registro[7] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    void consulta_GCC(String gcc) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "LIDER", "FECHA ACTUAL", "ESTADO", "TIPO", "OBSERVACIONES"};
        String[] registro = new String[8];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "LIDER_TECNICO AS LIDER, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "(ESTADO_PROYECTO = 'En Creacion' "
                + "OR ESTADO_PROYECTO = 'Con Excepcion') AND "
                + "GCC_APR = '" + gcc + "' "
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

                comentario_final = "REGISTRO : " + com_registro + "\n"
                        + "REPROGRAMACION : " + com_repro + "\n"
                        + "EXCEPCION : " + com_excepciones + "";

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("LIDER");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("ESTADO");
                registro[6] = rs.getString("TIPO");
                registro[7] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_proyectos.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public static int Validar_Prerequisitos_Calificacion(String numero) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] registro = new String[14];
        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "PRE_CAL_ESPECIFICACION_EQUIPO AS ESPECIFICACION, "
                + "PRE_CAL_PROTOCOLOS AS PROTOCOLO, "
                + "PRE_CAL_RU_NO_GXP AS NO_GXP, "
                + "PRE_CAL_LIBRO_PARAMETROS AS LIBRO, "
                + "PRE_CAL_BR_ACTUALIZADO AS BR, "
                + "PRE_CAL_SOP AS SOP, "
                + "PRE_CAL_HOJA_VIDA AS HOJA, "
                + "PRE_CAL_RUTINA_MANTENIMIENTO AS RUTINA, "
                + "PRE_CAL_CERTIFICADO_MATERIALES AS CERTIFICADO, "
                + "PRE_CAL_PLANOS AS PLANO, "
                + "PRE_CAL_MANUALES AS MANUALES, "
                + "PRE_CAL_MATERIALES AS MATERIAL, "
                + "PRE_CAL_RECURSOS AS RECURSOS, "
                + "PRE_CAL_ENTRENAMIENTOS AS ENTRENAMIENTO "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE NUMERO_REGISTRO = " + numero + "";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ESPECIFICACION");
                registro[1] = rs.getString("PROTOCOLO");
                registro[2] = rs.getString("NO_GXP");
                registro[3] = rs.getString("LIBRO");
                registro[4] = rs.getString("BR");
                registro[5] = rs.getString("SOP");
                registro[6] = rs.getString("HOJA");
                registro[7] = rs.getString("RUTINA");
                registro[8] = rs.getString("CERTIFICADO");
                registro[9] = rs.getString("PLANO");
                registro[10] = rs.getString("MANUALES");
                registro[11] = rs.getString("MATERIAL");
                registro[12] = rs.getString("RECURSOS");
                registro[13] = rs.getString("ENTRENAMIENTO");
            }

            for (int i = 0; i < registro.length; i++) {

                String estado = registro[i];

                if (estado.equals("Pendiente")) {
                    validacion_pendiente_cal += 1;
                } else {
                    validacion_pendiente_cal += 0;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return validacion_pendiente_cal;

    }

    public static int Validar_Prerequisitos_Proceso(String numero) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] registro = new String[15];
        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "PRE_PRO_CALIFICACION_IQOQPQ AS CALIFICACION, "
                + "PRE_PRO_ENTRENAMIENTO_HFM AS ENTRENAMIENTO, "
                + "PRE_PRO_ENTRENAMIENTO_ESPECIFICACION AS ESPECIFICACION, "
                + "PRE_PRO_ENTRENAMIENTO_TEST AS TEST, "
                + "PRE_PRO_ENTRENAMIENTO_PROTOCOLO AS PROTOCOLO, "
                + "PRE_PRO_MATERIALES AS MATERIAL, "
                + "PRE_PRO_DP AS DP, "
                + "PRE_PRO_DIAGRAMA AS DIAGRAMA, "
                + "PRE_PRO_FMEA AS FMEA, "
                + "PRE_PRO_PR AS PR, "
                + "PRE_PRO_PF AS PF, "
                + "PRE_PRO_RM AS RM, "
                + "PRE_PRO_PC AS PC, "
                + "PRE_PRO_CG AS CG, "
                + "PRE_PRO_FP AS FP "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE NUMERO_REGISTRO = " + numero + "";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("CALIFICACION");
                registro[1] = rs.getString("ENTRENAMIENTO");
                registro[2] = rs.getString("ESPECIFICACION");
                registro[3] = rs.getString("TEST");
                registro[4] = rs.getString("PROTOCOLO");
                registro[5] = rs.getString("MATERIAL");
                registro[6] = rs.getString("DP");
                registro[7] = rs.getString("DIAGRAMA");
                registro[8] = rs.getString("FMEA");
                registro[9] = rs.getString("PR");
                registro[10] = rs.getString("PF");
                registro[11] = rs.getString("RM");
                registro[12] = rs.getString("PC");
                registro[13] = rs.getString("CG");
                registro[14] = rs.getString("FP");
            }

            for (int i = 0; i < registro.length; i++) {

                String estado = registro[i];

                if (estado.equals("Pendiente")) {
                    validacion_pendiente_pro += 1;
                } else {
                    validacion_pendiente_pro += 0;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return validacion_pendiente_pro;

    }

    public static String Registro_Lote(String registro) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        String lote = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT LOTE FROM PLANEACIONES_VALIDACION WHERE NUMERO_REGISTRO = " + registro + "";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                lote = rs.getString("LOTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return lote;

    }

    public int verificacionSemanas(String fecha, String tipo) {

        int resultado = 0;
        int total = 0;

        try {
            SimpleDateFormat convertifecha = new SimpleDateFormat("yyyy-MM-dd");
            Date fechafinal = convertifecha.parse(fecha);
            int semana = numeroSemanas(fechafinal);

            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String query = "";

            ConexioSQLite con = new ConexioSQLite();
            Connection cn = con.Conectar();

            query = "SELECT COUNT(*) as TOTAL FROM PLANEACIONES_VALIDACION WHERE SEMANA = '" + semana + "' AND TIPO_VALIDACION = '" + tipo + "' AND ESTADO_PROYECTO = 'Programada';";

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                total = Integer.parseInt(rs.getString("TOTAL"));
            }

            if ((total >= 3) && tipo.equals("PROCESO")) {
                resultado = 1;
            } else if ((total >= 3) && tipo.equals("EQUIPOS")) {
                resultado = 1;
            } else if ((total >= 1) && tipo.equals("L&S")) {
                resultado = 1;
            } else if ((total >= 3) && tipo.equals("CSV")) {
                resultado = 1;
            } else if ((total >= 3) && tipo.equals("NO GXP")) {
                resultado = 1;
            } else {
                resultado = 0;
            }

        } catch (ParseException ex) {

        } catch (SQLException ex) {
            Logger.getLogger(Programacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int numeroSemanas(Date fecha) {

        int semana = 0;
        //Calendar calendar = Calendar.getInstance();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setFirstDayOfWeek(calendar.MONDAY);
        calendar.setMinimalDaysInFirstWeek(7);
        calendar.setTime(fecha);
        semana = 0;
        semana = calendar.get(Calendar.WEEK_OF_YEAR);
        return semana;
    }

    public int validacionSemanaProceso(int semana, int año) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();
        int contadorDiaSemana = 0;

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT FECHA_PROPUESTA "
                + " FROM PLANEACIONES_VALIDACION "
                + " WHERE SEMANA = " + semana + ""
                + " AND TIPO_VALIDACION = 'PROCESO'"
                + " AND (ESTADO_PROYECTO = 'Programada' OR ESTADO_PROYECTO = 'Ejecutada' OR ESTADO_PROYECTO = 'Cerrada')"
                + " AND (strftime('%Y',FECHA_PROPUESTA)) = '" + año + "'";

        System.out.println(query);
        try {
            String dia = "";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String fecha = rs.getString("FECHA_PROPUESTA");
                SimpleDateFormat convertifecha = new SimpleDateFormat("yyyy-MM-dd");
                Date fechafinal = convertifecha.parse(fecha);

                dia = DiaSemana(fechafinal);

                if (dia.equals("Jueves") || dia.equals("Viernes") || dia.equals("Sabado") || dia.equals("Domingo")) {
                    contadorDiaSemana += 1;
                } else {
                    contadorDiaSemana += 0;
                }

            }

            conexion.cerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return contadorDiaSemana;

    }

    public String DiaSemana(Date fecha) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);

        String[] strDays = new String[]{
            "Domingo",
            "Lunes",
            "Martes",
            "Miercoles",
            "Jueves",
            "Viernes",
            "Sabado"};

        return strDays[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    // METODO PARA VALIDAR CANTIDAD DE LOTES
    public static int contadorLotes(int semana, String tipo) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();
        int contadorSemana = 0;
        String resultados = null;

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT SUM(LOTE) AS LOTES_CONTADOS FROM PLANEACIONES_VALIDACION "
                + "WHERE SEMANA = " + semana + " "
                + "AND TIPO_VALIDACION = '" + tipo + "' "
                + " AND (ESTADO_PROYECTO = 'Programada')";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            resultados = rs.getString("LOTES_CONTADOS");

            if (resultados == null) {
                contadorSemana = 0;
            } else {
                contadorSemana = Integer.parseInt(resultados);
            }

            conexion.cerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return contadorSemana;
    }

    // METODO PARA VALIDAR CANTIDAD DE VALIDACIONES EN SEMANA
    public static int contadorSemana(int semana, String tipo, int año) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();
        int contadorSemana = 0;

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT COUNT(FECHA_PROPUESTA) AS SEMANA_CONTADA "
                + " FROM PLANEACIONES_VALIDACION "
                + " WHERE SEMANA = " + semana + ""
                + " AND TIPO_VALIDACION = '" + tipo + "'"
                + " AND (ESTADO_PROYECTO = 'Programada')"
                + " AND (strftime('%Y',FECHA_PROPUESTA)) = '" + año + "'";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            contadorSemana = Integer.parseInt(rs.getString("SEMANA_CONTADA"));
            conexion.cerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return contadorSemana;
    }

    public void ancho_columnas() {
        tabla_proyectos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_proyectos.getColumnModel().getColumn(1).setPreferredWidth(90);
        tabla_proyectos.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabla_proyectos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabla_proyectos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_proyectos.getColumnModel().getColumn(5).setPreferredWidth(80);
        tabla_proyectos.getColumnModel().getColumn(6).setPreferredWidth(100);
        tabla_proyectos.getColumnModel().getColumn(7).setPreferredWidth(100);
    }

    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_proyectos.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tabla_proyectos.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        tabla_proyectos.getColumnModel().getColumn(5).setCellRenderer(Alinear);
        tabla_proyectos.getColumnModel().getColumn(6).setCellRenderer(Alinear);
    }

}
