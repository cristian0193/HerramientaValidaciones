package Vista;

import Conexion.ConexioSQLite;
import static Vista.Programacion.Registro_Lote;
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

public class Reprogramacion extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;

    public Reprogramacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_reprogramaciones();
        ancho_columnas();
        centrar_datos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date_nueva_fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reprogramaciones = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha_inicio = new com.toedter.calendar.JDateChooser();
        txt_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_palabra_clave_consulta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_lider_consulta = new javax.swing.JTextField();
        combo_consulta = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_gcc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones_reprogramacion = new javax.swing.JTextArea();
        txt_registro_repro = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt_fecha_reprogramda = new javax.swing.JTextField();
        txt_fecha_propuesta2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        combo_motivo = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 660));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RE-PROGRAMACION DE VALIDACION Ó CALIFICACION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 30));

        jLabel6.setText("Fecha Propuesta :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 20));

        jLabel7.setText("Fecha Reprogramada :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 20));

        date_nueva_fecha.setToolTipText("");
        date_nueva_fecha.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(date_nueva_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, -1));

        tabla_reprogramaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_reprogramaciones.setRowHeight(22);
        tabla_reprogramaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_reprogramacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reprogramaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 278, 1060, 370));

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

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_lider_consulta.setEnabled(false);

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "FECHA PROPUESTA", "FECHA REPROGRAMACION", "LIDER TECNICO", "PALABRA CLAVE", "GCC" }));
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

        jLabel10.setText("GCC/APR :");

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
                .addGap(31, 31, 31)
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
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_lider_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txt_gcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_fecha_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1070, 110));

        txt_observaciones_reprogramacion.setColumns(20);
        txt_observaciones_reprogramacion.setRows(5);
        txt_observaciones_reprogramacion.setToolTipText("Justificacion Oblicagatoria de Reprogramacion");
        jScrollPane2.setViewportView(txt_observaciones_reprogramacion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 590, 70));

        txt_registro_repro.setEditable(false);
        txt_registro_repro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_registro_repro.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_repro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_registro_repro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 120, -1));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Reprogramar");
        jButton2.setToolTipText("Permite Reprogramar las calificaciones con estado No Ejecutadas.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, 70));

        txt_fecha_reprogramda.setEditable(false);
        txt_fecha_reprogramda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_fecha_reprogramda.setForeground(new java.awt.Color(255, 0, 0));
        txt_fecha_reprogramda.setToolTipText("Fecha en caso de que ya se encuentre como reprogramada o No ejecutada");
        getContentPane().add(txt_fecha_reprogramda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, -1));

        txt_fecha_propuesta2.setEditable(false);
        txt_fecha_propuesta2.setToolTipText("Fecha Actual de validacion para el Proyecto");
        getContentPane().add(txt_fecha_propuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        jLabel8.setText("Motivo :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 70, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("*");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 20, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("*");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 20, 20));

        combo_motivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Cancelado", "Prerequisitos No Listos", "Incumplimiento de RU", "Recursos de Ejecucion", "Prioridad" }));
        combo_motivo.setToolTipText("Seleccionador de Filtro segun motivo de reprogramacion");
        getContentPane().add(combo_motivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 220, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("*");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 20, 20));

        jLabel9.setText("Nueva Fecha :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 20));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (txt_registro_repro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA");
        } else if (this.date_nueva_fecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE NUEVA FECHA");
        } else if (combo_motivo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "INGRESE MOTIVO");
        } else if (txt_observaciones_reprogramacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE JUSTIFICACION DE REPROGRAMACION");
        } else {

            String registro_pro = txt_registro_repro.getText();

            Date fecha = date_nueva_fecha.getDate();

            int semana = numeroSemanas(fecha);
            int rec = this.tabla_reprogramaciones.getSelectedRow();
            String tipo_validacion = tabla_reprogramaciones.getValueAt(rec, 3).toString();
            DateFormat formatoFecha = new SimpleDateFormat("YYYY");
            int año = Integer.parseInt(formatoFecha.format(fecha));

            int validacionProgramacionSemanaProceso = 0;
            String lote = "";
            int contadorSemanas = 0;
            int contadorLote = 0;
            int lotesIngresados = 0;

            //Conversin de fecha Date a String
            DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd");
            String fechaConverida = fechaHora.format(fecha);

            int validacionProgramacion = verificacionSemanas(fechaConverida, tipo_validacion);

            // VALIDACION DE SEMANAS PROGRAMADAS (Jueves, Vienes, Sabado y Domingo)
            validacionProgramacionSemanaProceso = validacionSemanaProceso((semana - 1), año);

            // VALIDACION DE LOTES PERMITIDOS
            contadorSemanas = contadorSemana(semana, tipo_validacion, año);
            contadorLote = contadorLotes(semana, tipo_validacion);
            lote = Registro_Lote(registro_pro);
            lotesIngresados = Integer.parseInt(lote);

            //VALIDACION CANTIDAD DE LOTES MAYORES A 3 (PROCESO)
            int resultadoTotalLotes = contadorLote + lotesIngresados;

            if (tipo_validacion.equals("PROCESO")) {
                if (validacionProgramacion >= 1 || validacionProgramacionSemanaProceso > 0 || resultadoTotalLotes > 3 || contadorSemanas > 3) {

                    int confirmado = JOptionPane.showConfirmDialog(null, "ESTA SEMANA YA TIENE LA CAPACIADAD DE VALIDACIONES PROGRAMADAS COMPLETAS "
                            + "\n PARA TIPO : " + tipo_validacion + " \n ¿ desea reprogramar ?", "Capacidad Completa", JOptionPane.INFORMATION_MESSAGE);

                    if (JOptionPane.OK_OPTION == confirmado) {

                        ObservacionReprogramacion justificacion = new ObservacionReprogramacion();
                        justificacion.setVisible(true);

                        justificacion.txt_registro_principal.setText(this.txt_registro_repro.getText());
                        justificacion.txt_fecha.setText(fechaConverida);

                    } else {
                        conexion = new ConexioSQLite();
                        conexion.coneccionbase();

                        String registro = txt_registro_repro.getText();

                        String formato = date_nueva_fecha.getDateFormatString();
                        Date date = (Date) date_nueva_fecha.getDate();
                        SimpleDateFormat sdf = new SimpleDateFormat(formato);
                        String fecha_ingresada = String.valueOf(sdf.format(date));

                        String motivo = combo_motivo.getSelectedItem().toString();
                        String observaciones = txt_observaciones_reprogramacion.getText();
                        int semana_fecha = numeroSemanas(date);

                        boolean resultado = conexion.upgrade_reprogramacion(registro, fecha_ingresada, observaciones, motivo, semana_fecha);

                        if (resultado == true) {
                            JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                            LimpiarCampos();
                            ancho_columnas();
                            centrar_datos();
                            cargar_tabla_reprogramaciones();

                        } else {
                            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                            LimpiarCampos();
                        }
                    }

                } else {
                    conexion = new ConexioSQLite();
                    conexion.coneccionbase();

                    String registro = txt_registro_repro.getText();

                    String formato = date_nueva_fecha.getDateFormatString();
                    Date date = (Date) date_nueva_fecha.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat(formato);
                    String fecha_ingresada = String.valueOf(sdf.format(date));

                    String motivo = combo_motivo.getSelectedItem().toString();
                    String observaciones = txt_observaciones_reprogramacion.getText();
                    int semana_fecha = numeroSemanas(date);
                    boolean resultado = conexion.upgrade_reprogramacion(registro, fecha_ingresada, observaciones, motivo, semana_fecha);

                    if (resultado == true) {
                        JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                        LimpiarCampos();
                        ancho_columnas();
                        centrar_datos();
                        cargar_tabla_reprogramaciones();

                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                        LimpiarCampos();
                    }
                }
            } else {
                if (validacionProgramacion >= 1 || contadorSemanas > 3) {

                    int confirmado = JOptionPane.showConfirmDialog(null, "ESTA SEMANA YA TIENE LA CAPACIADAD DE VALIDACIONES PROGRAMADAS COMPLETAS "
                            + "\n PARA TIPO : " + tipo_validacion + " \n ¿ desea reprogramar ?", "Capacidad Completa", JOptionPane.INFORMATION_MESSAGE);

                    if (JOptionPane.OK_OPTION == confirmado) {

                        ObservacionReprogramacion justificacion = new ObservacionReprogramacion();
                        justificacion.setVisible(true);

                        justificacion.txt_registro_principal.setText(this.txt_registro_repro.getText());
                        justificacion.txt_fecha.setText(fechaConverida);

                    } else {
                        conexion = new ConexioSQLite();
                        conexion.coneccionbase();

                        String registro = txt_registro_repro.getText();

                        String formato = date_nueva_fecha.getDateFormatString();
                        Date date = (Date) date_nueva_fecha.getDate();
                        SimpleDateFormat sdf = new SimpleDateFormat(formato);
                        String fecha_ingresada = String.valueOf(sdf.format(date));

                        String motivo = combo_motivo.getSelectedItem().toString();
                        String observaciones = txt_observaciones_reprogramacion.getText();
                        int semana_fecha = numeroSemanas(date);

                        boolean resultado = conexion.upgrade_reprogramacion(registro, fecha_ingresada, observaciones, motivo, semana_fecha);

                        if (resultado == true) {
                            JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                            LimpiarCampos();
                            ancho_columnas();
                            centrar_datos();
                            cargar_tabla_reprogramaciones();

                        } else {
                            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                            LimpiarCampos();
                        }
                    }

                } else {
                    conexion = new ConexioSQLite();
                    conexion.coneccionbase();

                    String registro = txt_registro_repro.getText();

                    String formato = date_nueva_fecha.getDateFormatString();
                    Date date = (Date) date_nueva_fecha.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat(formato);
                    String fecha_ingresada = String.valueOf(sdf.format(date));

                    String motivo = combo_motivo.getSelectedItem().toString();
                    String observaciones = txt_observaciones_reprogramacion.getText();
                    int semana_fecha = numeroSemanas(date);
                    boolean resultado = conexion.upgrade_reprogramacion(registro, fecha_ingresada, observaciones, motivo, semana_fecha);

                    if (resultado == true) {
                        JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                        LimpiarCampos();
                        ancho_columnas();
                        centrar_datos();
                        cargar_tabla_reprogramaciones();

                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                        LimpiarCampos();
                    }
                }
            }

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabla_reprogramacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reprogramacionesMouseClicked
        int rec = this.tabla_reprogramaciones.getSelectedRow();

        this.txt_registro_repro.setText(tabla_reprogramaciones.getValueAt(rec, 0).toString());
        this.txt_fecha_propuesta2.setText(tabla_reprogramaciones.getValueAt(rec, 4).toString());

        try {
            this.txt_fecha_reprogramda.setText(tabla_reprogramaciones.getValueAt(rec, 5).toString());
        } catch (NullPointerException e) {
            this.txt_fecha_reprogramda.setText("");
        }

        this.txt_observaciones_reprogramacion.setText(tabla_reprogramaciones.getValueAt(rec, 6).toString());

    }//GEN-LAST:event_tabla_reprogramacionesMouseClicked

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 1:
                this.txt_fecha_inicio.setEnabled(true);
                this.txt_fecha_final.setEnabled(true);
                this.txt_lider_consulta.setEditable(false);
                this.txt_lider_consulta.setEnabled(false);
                this.txt_palabra_clave_consulta.setEditable(false);
                this.txt_palabra_clave_consulta.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 2:
                this.txt_fecha_inicio.setEnabled(true);
                this.txt_fecha_final.setEnabled(true);
                this.txt_lider_consulta.setEditable(false);
                this.txt_palabra_clave_consulta.setEditable(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 3:
                this.txt_lider_consulta.setEditable(true);
                this.txt_lider_consulta.setEnabled(true);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_palabra_clave_consulta.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 4:
                this.txt_palabra_clave_consulta.setEditable(true);
                this.txt_palabra_clave_consulta.setEnabled(true);
                this.txt_lider_consulta.setEnabled(false);
                this.txt_fecha_inicio.setEnabled(false);
                this.txt_fecha_final.setEnabled(false);
                this.txt_gcc.setEditable(false);
                this.txt_gcc.setEnabled(false);
                break;
            case 5:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_consultaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 0:
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
                break;
            case 1:
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
                }   break;
            case 2:
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
                    
                    consulta_rango_fechas_reprogramada(fecha_ingresada_inicio, fecha_ingresada_final);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }   break;
            case 3:
                String lider = txt_lider_consulta.getText();
                if (lider.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE LIDER TECNICO");
                } else {
                    consulta_lider(lider);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }   break;
            case 4:
                String registro = txt_palabra_clave_consulta.getText();
                if (registro.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE REGISTRO NUMERICO");
                } else {
                    consulta_palabra_clave(registro);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }   break;
            default:
                String gcc = txt_gcc.getText();
                if (gcc.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE REGISTRO NUMERICO");
                } else {
                    consulta_gcc(gcc);
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                }   break;
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cargar_tabla_reprogramaciones();
        ancho_columnas();
        centrar_datos();
        LimpiarCampos();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JComboBox combo_motivo;
    private com.toedter.calendar.JDateChooser date_nueva_fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JTable tabla_reprogramaciones;
    private com.toedter.calendar.JDateChooser txt_fecha_final;
    private com.toedter.calendar.JDateChooser txt_fecha_inicio;
    private javax.swing.JTextField txt_fecha_propuesta2;
    private javax.swing.JTextField txt_fecha_reprogramda;
    private javax.swing.JTextField txt_gcc;
    private javax.swing.JTextField txt_lider_consulta;
    private javax.swing.JTextArea txt_observaciones_reprogramacion;
    private javax.swing.JTextField txt_palabra_clave_consulta;
    public static javax.swing.JTextField txt_registro_repro;
    // End of variables declaration//GEN-END:variables

    // METODO PARA LIMPIAR CAMPOS
    public void LimpiarCampos() {
        txt_registro_repro.setText("");
        date_nueva_fecha.setDate(null);
        txt_fecha_reprogramda.setText("");
        txt_observaciones_reprogramacion.setText("");
        combo_motivo.setSelectedIndex(0);
        txt_fecha_propuesta2.setText("");
    }

    // METODO PARA CALCULAR NUMERO DE SEMANA DE LA FECHA
    public int numeroSemanas(Date fecha) {

        int semana = 0;        
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setFirstDayOfWeek(calendar.MONDAY);
        calendar.setMinimalDaysInFirstWeek(7);
        calendar.setTime(fecha);
        semana = 0;
        semana = calendar.get(Calendar.WEEK_OF_YEAR);
        return semana;
    }

    // METODO PARA CARGAR TABLA DE REPROGRAMACION
    void cargar_tabla_reprogramaciones() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "FECHA ACTUAL", "FECHA REPRO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                 + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE ESTADO_PROYECTO = 'No Ejecutada' "
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
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_reprogramaciones.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO DE CONSULTA DE RANGO DE FECHAS PROPUESTA
    void consulta_rango_fechas_propuesta(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "FECHA ACTUAL", "FECHA REPRO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "FECHA_PROPUESTA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "' AND"
                + "(ESTADO_PROYECTO NOT IN ('En Creacion','Ejecutada','No Programada','Cerrada','Programada','Con Excepcion')) "
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
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_reprogramaciones.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CALCULAR NUMERO DE SEMANA DE LA FECHA REPROGRAMACION
    void consulta_rango_fechas_reprogramada(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "FECHA ACTUAL", "FECHA REPRO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "FECHA_REPROGRAMACION BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "' AND"
                + "(ESTADO_PROYECTO NOT IN ('En Creacion','Ejecutada','No Programada','Cerrada','Programada','Con Excepcion')) "
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
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_reprogramaciones.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR LIDER
    void consulta_lider(String lider) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "FECHA ACTUAL", "FECHA REPRO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "LIDER_TECNICO LIKE '%" + lider.toUpperCase().trim() + "%' AND "
                + "(ESTADO_PROYECTO NOT IN ('En Creacion','Ejecutada','No Programada','Cerrada','Programada','Con Excepcion')) "
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
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_reprogramaciones.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR PALABRA CLAVE
    void consulta_palabra_clave(String palabra) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "FECHA ACTUAL", "FECHA REPRO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "ESTADO_PROYECTO = 'No Ejecutada' AND "
                + "NOMBRE_PROYECTO LIKE '%" + palabra + "%' "
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
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_reprogramaciones.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR GCC
    void consulta_gcc(String gcc) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "FECHA ACTUAL", "FECHA REPRO", "OBSERVACIONES"};
        String[] registro = new String[7];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "FECHA_PROPUESTA AS FECHA_ACTUAL, "
                + "FECHA_REPROGRAMACION AS FECHA_REPRO, "
                + "OBSERVACION_EXCEPCIONES AS OBSER_REPRO, "
                + "OBSERVACION_REPROGRAMACION AS EXPECIONES, "
                + "OBSERVACIONES_VALIDACION AS OBSER_VAL "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE "
                + "ESTADO_PROYECTO = 'No Ejecutada' AND "
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
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("FECHA_ACTUAL");
                registro[5] = rs.getString("FECHA_REPRO");
                registro[6] = comentario_final;

                modelo.addRow(registro);
            }
            tabla_reprogramaciones.setModel(modelo);
            conexion.cerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
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

    // METODO PARA CONSULTAR DIA DE LA SEMANA POR FECHA
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

    // METODO PARA VALIDACION DE SEMANA ANTERIOR PARA CALIFICAICON DE PROCESO
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

    // METODO PARA CONSULTAR VERIFICACION DE LA SEMANA
    public int verificacionSemanas(String fecha, String tipo) {

        int resultado = 0;
        int total = 0;

        try {

            SimpleDateFormat convertifecha = new SimpleDateFormat("yyyy-MM-dd");
            Date date = convertifecha.parse(fecha);
            int semana = numeroSemanas(date);

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

    // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas() {
        tabla_reprogramaciones.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla_reprogramaciones.getColumnModel().getColumn(1).setPreferredWidth(60);
        tabla_reprogramaciones.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabla_reprogramaciones.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabla_reprogramaciones.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_reprogramaciones.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabla_reprogramaciones.getColumnModel().getColumn(6).setPreferredWidth(250);
    }

    // METODO PARA CENTRAR DATOS DE TABLA
    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_reprogramaciones.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tabla_reprogramaciones.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        tabla_reprogramaciones.getColumnModel().getColumn(4).setCellRenderer(Alinear);
        tabla_reprogramaciones.getColumnModel().getColumn(5).setCellRenderer(Alinear);
    }
}
