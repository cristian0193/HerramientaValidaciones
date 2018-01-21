package Vista;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;

public class PrincipalNoProgramadas extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    DefaultTableModel modelo;
    public static int valor = 0;

    public PrincipalNoProgramadas() {
        initComponents();
        PrerequisitoCalificacion calificacion = new PrerequisitoCalificacion();
        this.setLocationRelativeTo(null);
        cargar_tabla();
        cargar_lista_tipo();
        cargar_lista_lider();
        cargar_lista_planta();
        cargar_lista_maquina();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_registro = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_proyecto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date_fecha_propuesta = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_lider_tecnico = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_GCC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_observaciones_proyecto = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        combo_planta = new javax.swing.JComboBox();
        btn_refrescar = new javax.swing.JButton();
        txt_turnos = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        txt_fecha_propuesta = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        combo_maquina = new javax.swing.JComboBox();
        txt_estado_proyecto = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        combo_lote = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_contenido = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        date_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        date_fecha_final = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txt_consulta_lider = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        combo_consulta = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_consulta_registro = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_consulta_gcc = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_consulta_proyecto = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 670));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE VALIDACIÓN NO PROGRAMADAS");

        txt_registro.setEditable(false);
        txt_registro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_registro.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_registro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 905, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion Relevante"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 20, 20));
        jPanel2.add(txt_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 58, 990, -1));

        jLabel3.setText("Nombre Proyecto : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 58, 110, 20));

        date_fecha_propuesta.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(date_fecha_propuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, -1));

        jLabel4.setText("Planta :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 50, 20));

        jLabel5.setText("Maquina :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 60, 20));

        combo_lider_tecnico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel2.add(combo_lider_tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 200, -1));

        jLabel6.setText("Fecha Propuesta :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 20));

        jLabel7.setText("Tipo Validacion :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 92, 90, -1));

        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel2.add(combo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 178, -1));

        jLabel8.setText("Lider Tecnico :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 92, 80, -1));

        jLabel9.setText("Numero GCC / APR :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 120, 17));
        jPanel2.add(txt_GCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 210, -1));

        jLabel11.setText("Turnos : ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 50, 20));

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Prerequisitos de Calificacion");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 220, 40));

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Prerequisitos de Proceso");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 220, 40));

        jLabel10.setText("Observaciones la el registro de validacion ejectada no programada: ( 4000 Max. Caracteres )");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, 20));

        txt_observaciones_proyecto.setColumns(20);
        txt_observaciones_proyecto.setRows(5);
        jScrollPane3.setViewportView(txt_observaciones_proyecto);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 620, 90));

        jLabel12.setText("Estado del Proyecto :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 20));

        combo_planta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_planta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_plantaActionPerformed(evt);
            }
        });
        jPanel2.add(combo_planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, -1));

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 51));
        btn_refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 90, 30));

        txt_turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_turnosActionPerformed(evt);
            }
        });
        jPanel2.add(txt_turnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 137, -1));

        btn_guardar.setBackground(new java.awt.Color(0, 255, 0));
        btn_guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, 30));

        txt_fecha_propuesta.setEditable(false);
        txt_fecha_propuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_propuestaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fecha_propuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 120, -1));

        btn_actualizar.setBackground(new java.awt.Color(255, 102, 102));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar Estado");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 140, 30));

        jLabel17.setText("Lotes :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("*");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("*");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 60, -1, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("*");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 20, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("*");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 20, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("*");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 20, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("*");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 20, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("*");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 20, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("*");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 20, 20));

        combo_maquina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel2.add(combo_maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 200, -1));

        txt_estado_proyecto.setEditable(false);
        txt_estado_proyecto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_estado_proyecto.setText("Ejecutada No Programada");
        txt_estado_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estado_proyectoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_estado_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, -1));

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 90, 30));

        combo_lote.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3" }));
        jPanel2.add(combo_lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 140, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("*");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 20, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 65, 1150, 340));

        tabla_contenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_contenido.setRowHeight(23);
        tabla_contenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_contenidoMouseClicked(evt);
            }
        });
        tabla_contenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_contenidoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_contenido);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1150, 230));

        jLabel13.setText("Fecha Inicial :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 420, 80, 30));

        date_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        date_fecha_inicio.setEnabled(false);
        getContentPane().add(date_fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 120, 30));

        jLabel14.setText("Fecha Final :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 70, 30));

        date_fecha_final.setDateFormatString("yyyy-MM-dd");
        date_fecha_final.setEnabled(false);
        getContentPane().add(date_fecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 120, 30));

        jLabel15.setText("Seleccionar Filtro :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 120, 20));

        txt_consulta_lider.setEditable(false);
        txt_consulta_lider.setEnabled(false);
        getContentPane().add(txt_consulta_lider, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 200, -1));

        jButton5.setBackground(new java.awt.Color(102, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 200, 30));

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "RANGO DE FECHAS", "LIDER TECNICO", "REGISTRO", "GCC", "PROYECTO" }));
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
        getContentPane().add(combo_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, 200, -1));

        jLabel16.setText("Lider Tecnico :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, 20));

        jLabel25.setText("Registro :");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 60, 20));

        txt_consulta_registro.setEditable(false);
        txt_consulta_registro.setEnabled(false);
        getContentPane().add(txt_consulta_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 90, -1));

        jLabel24.setText("GCC/APR :");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, 20));

        txt_consulta_gcc.setEditable(false);
        txt_consulta_gcc.setToolTipText("");
        txt_consulta_gcc.setEnabled(false);
        getContentPane().add(txt_consulta_gcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 140, -1));

        jLabel28.setText("Proyecto :");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, 20));

        txt_consulta_proyecto.setEditable(false);
        txt_consulta_proyecto.setToolTipText("");
        txt_consulta_proyecto.setEnabled(false);
        getContentPane().add(txt_consulta_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_consultaActionPerformed

    private void combo_plantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_plantaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_plantaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrerequisitoCalificacion calificacion = new PrerequisitoCalificacion();
        calificacion.setVisible(true);

        calificacion.txt_registro_principal.setText(txt_registro.getText());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrerequisitoProceso proceso = new PrerequisitoProceso();
        proceso.setVisible(true);

        proceso.txt_registro_principal.setText(txt_registro.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_turnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_turnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_turnosActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        if (txt_GCC.getText().equals("") || txt_proyecto.getText().equals("") || combo_tipo.getSelectedIndex() == 0 || combo_lider_tecnico.getSelectedIndex() == 0
                || combo_planta.getSelectedIndex() == 0 || combo_maquina.getSelectedIndex() == 0 || date_fecha_propuesta.getDate() == null
                || txt_estado_proyecto.getText().equals("") || combo_lote.getSelectedIndex() == 0 || txt_observaciones_proyecto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS DATOS OBLIGATORIOS (*)");
        } else {

            int resultadoVerificacion = validacionIngresoGCCAPRLimpieza(txt_GCC.getText().toUpperCase());

            if (resultadoVerificacion == 0) {
                txt_GCC.setText("");
                txt_GCC.requestFocus();
            } else {
                String lotes = combo_lote.getSelectedItem().toString();
                String turnos = txt_turnos.getText();

                if (!isNumeric(lotes)) {
                    JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMERICO EN LOTE\n EJEMPLO : 2, 3.4");
                } else if (!isNumeric(turnos)) {
                    JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMERICO EN TURNO\n EJEMPLO : 2, 3.4");
                } else {

                    conexion = new ConexioSQLite();
                    conexion.coneccionbase();
                    String gcc = txt_GCC.getText();
                    String nombre = txt_proyecto.getText();
                    String tipo = combo_tipo.getSelectedItem().toString();
                    String lider = combo_lider_tecnico.getSelectedItem().toString();
                    String planta = combo_planta.getSelectedItem().toString();
                    String maquina = combo_maquina.getSelectedItem().toString();
                    String lote = combo_lote.getSelectedItem().toString();
                    String turno = txt_turnos.getText();

                    String formato = date_fecha_propuesta.getDateFormatString();
                    Date date_ingresada = (Date) date_fecha_propuesta.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat(formato);
                    String fecha_ingresada = String.valueOf(sdf.format(date_ingresada));

                    int semanaObtenida = numeroSemanas(date_ingresada);

                    String estado = "Ejecutada";
                    String observaciones = txt_observaciones_proyecto.getText();

                    boolean resultado = conexion.insertNoprogramadas(gcc.toUpperCase(), nombre.toUpperCase(), tipo, lider, planta, maquina, lote, turno, fecha_ingresada, estado, observaciones,
                            "No Aplica", "No Aplica", "NO", "No Aplica", "No Aplica", "No Aplica",
                            "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica",
                            "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica",
                            "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica",
                            "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "", "", semanaObtenida,
                            "", "", "", "Ejecutada No Programada");

                    if (resultado == true) {
                        JOptionPane.showMessageDialog(null, "PROYECTO INSERTADO");
                        LimpiarCampos();
                        cargar_tabla();
                        conexion.cerrar();
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
                        LimpiarCampos();
                    }

                }
            }

        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tabla_contenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_contenidoMouseClicked

        int rec = this.tabla_contenido.getSelectedRow();

        this.txt_registro.setText(tabla_contenido.getValueAt(rec, 0).toString());
        this.txt_GCC.setText(tabla_contenido.getValueAt(rec, 1).toString());
        this.txt_proyecto.setText(tabla_contenido.getValueAt(rec, 2).toString());
        this.combo_tipo.setSelectedItem(tabla_contenido.getValueAt(rec, 3).toString());
        this.combo_lider_tecnico.setSelectedItem(tabla_contenido.getValueAt(rec, 4).toString());
        this.combo_planta.setSelectedItem(tabla_contenido.getValueAt(rec, 5).toString());
        this.combo_maquina.setSelectedItem(tabla_contenido.getValueAt(rec, 6).toString());
        this.combo_lote.setSelectedItem(tabla_contenido.getValueAt(rec, 7).toString());
        this.txt_turnos.setText(tabla_contenido.getValueAt(rec, 8).toString());
        this.txt_fecha_propuesta.setText(tabla_contenido.getValueAt(rec, 9).toString());
        this.txt_estado_proyecto.setText(tabla_contenido.getValueAt(rec, 10).toString());
        this.txt_observaciones_proyecto.setText(""+tabla_contenido.getValueAt(rec, 11).toString());

    }//GEN-LAST:event_tabla_contenidoMouseClicked

    private void tabla_contenidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_contenidoKeyPressed
    }//GEN-LAST:event_tabla_contenidoKeyPressed

    private void txt_fecha_propuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_propuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_propuestaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int index = combo_consulta.getSelectedIndex();

        switch (index) {
            case 0:
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
                break;
            case 1:
                if (this.date_fecha_inicio.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
                } else if (this.date_fecha_final.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
                } else {
                    String formato1 = date_fecha_inicio.getDateFormatString();
                    Date date1 = (Date) date_fecha_inicio.getDate();
                    SimpleDateFormat sdf1 = new SimpleDateFormat(formato1);
                    String fecha_ingresada_inicio = String.valueOf(sdf1.format(date1));

                    String formato2 = date_fecha_final.getDateFormatString();
                    Date date2 = (Date) date_fecha_final.getDate();
                    SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
                    String fecha_ingresada_final = String.valueOf(sdf2.format(date2));

                    consulta_rango_fechas(fecha_ingresada_inicio, fecha_ingresada_final);
                    conexion.cerrar();
                }
                break;
            case 2:
                String lider = txt_consulta_lider.getText();
                if (lider.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE LIDER TECNICO");
                } else {
                    consulta_lider(lider);
                    conexion.cerrar();
                }
                break;
            case 3: {
                String registro = txt_consulta_registro.getText();
                if (registro.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE REGISTRO NUMERICO");
                } else {
                    consulta_registro(registro);
                    conexion.cerrar();
                }
                break;
            }
            case 4: {
                String registro = txt_consulta_gcc.getText();
                if (registro.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE NUMERO GCC/APR");
                } else {
                    consulta_gcc(registro);
                    conexion.cerrar();
                }
                break;
            }
            default: {
                String registro = txt_consulta_proyecto.getText();
                if (registro.equals("")) {
                    JOptionPane.showMessageDialog(null, "INGRESE NOMBRE PROYECTO");
                } else {
                    consulta_proyecto(registro);
                    conexion.cerrar();
                }
                break;
            }
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        cargar_tabla();
        conexion.cerrar();
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (this.txt_registro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA");
        } else if (this.date_fecha_propuesta.getDate() == null) {
            JOptionPane.showMessageDialog(null, "INGRESE FECHA PROPUESTA");
        } else {

            int resultadoVerificacion = validacionIngresoGCCAPRLimpieza(txt_GCC.getText().toUpperCase());

            if (resultadoVerificacion == 0) {
                txt_GCC.setText("");
                txt_GCC.requestFocus();
            } else {
                String lotes = combo_lote.getSelectedItem().toString();
                String turnos = txt_turnos.getText();

                if (!isNumeric(lotes)) {
                    JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMERICO EN LOTE\n EJEMPLO : 2, 3.4");
                } else if (!isNumeric(turnos)) {
                    JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMERICO EN TURNO\n EJEMPLO : 2, 3.4");
                } else {
                    
                    DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd");
                    Date fecha = (Date) date_fecha_propuesta.getDate();
                    int semana = numeroSemanas(fecha);
                    
                        int confirmado = JOptionPane.showConfirmDialog(null, "ESTA SEGURO QUE DESEA ACTUALIZAR EL REGISTRO ? "
                                + "\n EL SIGUIENTE REGISTRO PRESENTARA LOS SIGUIENTE CAMBIOS : "
                                + "\n ESTADO PROYECTO -> EJECUTADA "
                                + "\n PREREQUISITOS -> NO APLICA "
                                + "\n REGISTRO COMO EJECUTADA NO PROGRAMADA ",
                                 "Confirmacion", JOptionPane.INFORMATION_MESSAGE);

                        if (JOptionPane.OK_OPTION == confirmado) {

                            conexion = new ConexioSQLite();
                            conexion.coneccionbase();
                            String registro = txt_registro.getText();
                            String gcc = txt_GCC.getText();
                            String nombre = txt_proyecto.getText();
                            String tipo = combo_tipo.getSelectedItem().toString();
                            String lider = combo_lider_tecnico.getSelectedItem().toString();
                            String planta = combo_planta.getSelectedItem().toString();
                            String maquina = combo_maquina.getSelectedItem().toString();
                            String lote = combo_lote.getSelectedItem().toString();
                            String turno = txt_turnos.getText();
                            String estado = "Ejecutada";
                            String observaciones = txt_observaciones_proyecto.getText();

                            String formato = date_fecha_propuesta.getDateFormatString();
                            Date date = (Date) date_fecha_propuesta.getDate();
                            SimpleDateFormat sdf = new SimpleDateFormat(formato);
                            String fecha_ingresada = String.valueOf(sdf.format(date));

                            boolean resultado = conexion.upgrade_no_programadas(registro, gcc.toUpperCase().trim(), nombre.toUpperCase(), tipo, lider.toUpperCase().trim(), planta, maquina, lote, turno, fecha_ingresada, estado, observaciones.toUpperCase(),
                                    "No Aplica", "No Aplica", "NO", "No Aplica", "No Aplica", "No Aplica",
                                    "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica",
                                    "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica",
                                    "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica",
                                    "No Aplica", "No Aplica", "No Aplica", "No Aplica", "No Aplica", semana, "Ejecutada No Programada");

                            if (resultado == true) {
                                JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                                LimpiarCampos();
                                cargar_tabla();
                                conexion.cerrar();
                            } else {
                                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                                LimpiarCampos();
                            }

                        } else {

                        }

                   }
            }
        }

    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        switch (index) {          
            case 1:
                this.date_fecha_inicio.setEnabled(true);
                this.date_fecha_final.setEnabled(true);
                this.txt_consulta_lider.setEditable(false);
                this.txt_consulta_lider.setEnabled(false);
                this.txt_consulta_proyecto.setEditable(false);
                this.txt_consulta_gcc.setEditable(false);
                this.txt_consulta_proyecto.setEnabled(false);
                this.txt_consulta_gcc.setEnabled(false);
                break;
            case 2:
                this.txt_consulta_lider.setEditable(true);
                this.txt_consulta_lider.setEnabled(true);
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_consulta_registro.setEnabled(false);
                this.txt_consulta_proyecto.setEditable(false);
                this.txt_consulta_gcc.setEditable(false);
                this.txt_consulta_proyecto.setEnabled(false);
                this.txt_consulta_gcc.setEnabled(false);
                break;
            case 3:
                this.txt_consulta_registro.setEditable(true);
                this.txt_consulta_registro.setEnabled(true);
                this.txt_consulta_lider.setEnabled(false);
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_consulta_proyecto.setEditable(false);
                this.txt_consulta_gcc.setEditable(false);
                this.txt_consulta_proyecto.setEnabled(false);
                this.txt_consulta_gcc.setEnabled(false);
                break;
            case 4:
                this.txt_consulta_registro.setEditable(false);
                this.txt_consulta_registro.setEnabled(false);
                this.txt_consulta_lider.setEnabled(false);
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_consulta_proyecto.setEditable(false);
                this.txt_consulta_gcc.setEditable(true);
                this.txt_consulta_proyecto.setEnabled(false);
                this.txt_consulta_gcc.setEnabled(true);
                break;
            case 5:
                this.txt_consulta_registro.setEditable(false);
                this.txt_consulta_registro.setEnabled(false);
                this.txt_consulta_lider.setEnabled(false);
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_consulta_proyecto.setEditable(true);
                this.txt_consulta_gcc.setEditable(false);
                this.txt_consulta_proyecto.setEnabled(true);
                this.txt_consulta_gcc.setEnabled(false);
                break;
             default:
                this.txt_consulta_registro.setEditable(false);
                this.txt_consulta_registro.setEnabled(false);
                this.txt_consulta_lider.setEnabled(false);
                this.date_fecha_inicio.setEnabled(false);
                this.date_fecha_final.setEnabled(false);
                this.txt_consulta_proyecto.setEditable(false);
                this.txt_consulta_gcc.setEditable(false);
                this.txt_consulta_proyecto.setEnabled(false);
                this.txt_consulta_gcc.setEnabled(false);
                break;
                 
        }

    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void txt_estado_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estado_proyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estado_proyectoActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JComboBox combo_lider_tecnico;
    private javax.swing.JComboBox combo_lote;
    private javax.swing.JComboBox combo_maquina;
    private javax.swing.JComboBox combo_planta;
    private javax.swing.JComboBox combo_tipo;
    private com.toedter.calendar.JDateChooser date_fecha_final;
    private com.toedter.calendar.JDateChooser date_fecha_inicio;
    private com.toedter.calendar.JDateChooser date_fecha_propuesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla_contenido;
    private javax.swing.JTextField txt_GCC;
    private javax.swing.JTextField txt_consulta_gcc;
    private javax.swing.JTextField txt_consulta_lider;
    private javax.swing.JTextField txt_consulta_proyecto;
    private javax.swing.JTextField txt_consulta_registro;
    private javax.swing.JTextField txt_estado_proyecto;
    private javax.swing.JTextField txt_fecha_propuesta;
    private javax.swing.JTextArea txt_observaciones_proyecto;
    private javax.swing.JTextField txt_proyecto;
    public static javax.swing.JTextField txt_registro;
    private javax.swing.JTextField txt_turnos;
    // End of variables declaration//GEN-END:variables

    //METODO PARA LIMPIAR LOS CAMPOS 
    public void LimpiarCampos() {
        txt_registro.setText("");
        txt_GCC.setText("");
        txt_proyecto.setText("");
        combo_tipo.setSelectedIndex(0);
        combo_lider_tecnico.setSelectedIndex(0);
        combo_planta.setSelectedIndex(0);
        combo_maquina.setSelectedIndex(0);
        combo_lote.setSelectedIndex(0);
        txt_turnos.setText("");
        date_fecha_propuesta.setDate(null);
        txt_fecha_propuesta.setText("");
        combo_consulta.setSelectedIndex(0);
        txt_estado_proyecto.setText("Ejecutada No Programada");
        txt_observaciones_proyecto.setText("");
    }

    //METODO PARA VALIDAR DATO NUMERICO O NO NUMERICO
    private boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    //METODO PARA OBTENER SEMANA   
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

    // METODO PARA CARGAR TABLA PRINCIPAL
    public void cargar_tabla() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "FECHA_PROPUESTA AS FECHA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACION "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + " WHERE (ESTADO_PROYECTO = 'En Creacion' OR ESTADO_PROYECTO = 'Con Excepcion') "
                + "ORDER BY NUMERO_REGISTRO DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("LIDER");
                registro[5] = rs.getString("PLANTA");
                registro[6] = rs.getString("MAQUINA");
                registro[7] = rs.getString("LOTE");
                registro[8] = rs.getString("TURNO");
                registro[9] = rs.getString("FECHA");
                registro[10] = rs.getString("ESTADO");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_contenido.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR RANGO DE FECHAS
    public void consulta_rango_fechas(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "FECHA_PROPUESTA AS FECHA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACION "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE (ESTADO_PROYECTO = 'En Creacion' OR ESTADO_PROYECTO = 'Con Excepcion') "
                + "AND FECHA_PROPUESTA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "ORDER BY NUMERO_REGISTRO DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("LIDER");
                registro[5] = rs.getString("PLANTA");
                registro[6] = rs.getString("MAQUINA");
                registro[7] = rs.getString("LOTE");
                registro[8] = rs.getString("TURNO");
                registro[9] = rs.getString("FECHA");
                registro[10] = rs.getString("ESTADO");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_contenido.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR LIDER
    public void consulta_lider(String lider) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "FECHA_PROPUESTA AS FECHA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACION "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE (ESTADO_PROYECTO = 'En Creacion' OR ESTADO_PROYECTO = 'Con Excepcion') "
                + "AND LIDER_TECNICO LIKE '%" + lider.toUpperCase().trim() + "%' "
                + "ORDER BY NUMERO_REGISTRO DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("NUM");
                registro[1] = rs.getString("GCC");
                registro[2] = rs.getString("PROYECTO");
                registro[3] = rs.getString("TIPO");
                registro[4] = rs.getString("LIDER");
                registro[5] = rs.getString("PLANTA");
                registro[6] = rs.getString("MAQUINA");
                registro[7] = rs.getString("LOTE");
                registro[8] = rs.getString("TURNO");
                registro[9] = rs.getString("FECHA");
                registro[10] = rs.getString("ESTADO");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_contenido.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR REGISTROS
    public void consulta_registro(String registro) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO", "OBSERVA"};
        String[] registros = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "FECHA_PROPUESTA AS FECHA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACION "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE (ESTADO_PROYECTO = 'En Creacion' OR ESTADO_PROYECTO = 'Con Excepcion') "
                + "AND NUMERO_REGISTRO = " + registro + " "
                + "ORDER BY NUMERO_REGISTRO DESC";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registros[0] = rs.getString("NUM");
                registros[1] = rs.getString("GCC");
                registros[2] = rs.getString("PROYECTO");
                registros[3] = rs.getString("TIPO");
                registros[4] = rs.getString("LIDER");
                registros[5] = rs.getString("PLANTA");
                registros[6] = rs.getString("MAQUINA");
                registros[7] = rs.getString("LOTE");
                registros[8] = rs.getString("TURNO");
                registros[9] = rs.getString("FECHA");
                registros[10] = rs.getString("ESTADO");
                registros[11] = rs.getString("OBSERVACION");

                modelo.addRow(registros);
            }
            tabla_contenido.setModel(modelo);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR GCC/APR
    public void consulta_gcc(String gcc) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO", "OBSERVA"};
        String[] registros = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "FECHA_PROPUESTA AS FECHA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACION "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE (ESTADO_PROYECTO = 'En Creacion' OR ESTADO_PROYECTO = 'Con Excepcion') "
                + "AND GCC_APR = '" + gcc + "' "
                + "ORDER BY NUMERO_REGISTRO DESC";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registros[0] = rs.getString("NUM");
                registros[1] = rs.getString("GCC");
                registros[2] = rs.getString("PROYECTO");
                registros[3] = rs.getString("TIPO");
                registros[4] = rs.getString("LIDER");
                registros[5] = rs.getString("PLANTA");
                registros[6] = rs.getString("MAQUINA");
                registros[7] = rs.getString("LOTE");
                registros[8] = rs.getString("TURNO");
                registros[9] = rs.getString("FECHA");
                registros[10] = rs.getString("ESTADO");
                registros[11] = rs.getString("OBSERVACION");

                modelo.addRow(registros);
            }
            tabla_contenido.setModel(modelo);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR PROYECTO
    public void consulta_proyecto(String proyecto) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"NUM", "GCC", "PROYECTO", "TIPO", "LIDER", "PLANTA", "MAQUINA", "LOTE", "TURNO", "FECHA", "ESTADO", "OBSERVA"};
        String[] registros = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "NUMERO_REGISTRO AS NUM, "
                + "GCC_APR AS GCC, "
                + "NOMBRE_PROYECTO AS PROYECTO, "
                + "TIPO_VALIDACION AS TIPO, "
                + "LIDER_TECNICO AS LIDER, "
                + "PLANTA AS PLANTA, "
                + "MAQUINA AS MAQUINA, "
                + "LOTE AS LOTE, "
                + "TURNOS AS TURNO, "
                + "FECHA_PROPUESTA AS FECHA, "
                + "ESTADO_PROYECTO AS ESTADO, "
                + "OBSERVACIONES_VALIDACION AS OBSERVACION "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "WHERE (ESTADO_PROYECTO = 'En Creacion' OR ESTADO_PROYECTO = 'Con Excepcion') "
                + "AND NOMBRE_PROYECTO LIKE '%" + proyecto + "%' "
                + "ORDER BY NUMERO_REGISTRO DESC";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registros[0] = rs.getString("NUM");
                registros[1] = rs.getString("GCC");
                registros[2] = rs.getString("PROYECTO");
                registros[3] = rs.getString("TIPO");
                registros[4] = rs.getString("LIDER");
                registros[5] = rs.getString("PLANTA");
                registros[6] = rs.getString("MAQUINA");
                registros[7] = rs.getString("LOTE");
                registros[8] = rs.getString("TURNO");
                registros[9] = rs.getString("FECHA");
                registros[10] = rs.getString("ESTADO");
                registros[11] = rs.getString("OBSERVACION");

                modelo.addRow(registros);
            }
            tabla_contenido.setModel(modelo);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CARGAR LISTA TIPO
    public void cargar_lista_tipo() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM TIPO ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_tipo.addItem(rs.getString("NOMBRE_TIPO"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR LISTA LIDER
    public void cargar_lista_lider() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM LIDER ORDER BY NOMBRE_LIDER ASC";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_lider_tecnico.addItem(rs.getString("NOMBRE_LIDER"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR LISTA PLANTA
    public void cargar_lista_planta() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM PLANTA ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_planta.addItem(rs.getString("NOMBRE_PLANTA"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR LISTA MAQUINA
    public void cargar_lista_maquina() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM MAQUINA ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_maquina.addItem(rs.getString("NOMBRE_MAQUINA"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA VALIDAR REGISTRO GCC/APR/PVM ENTRE OTRAS
    public int validacionIngresoGCCAPRLimpieza(String cadena) {

        String indicativoGCC = "";
        String NumeroGCC = "";
        String cadenaDiferente = cadena;

        if (cadenaDiferente.length() > 4) {

            indicativoGCC = cadena.substring(0, 4);
            NumeroGCC = cadena.substring(4);

            if (indicativoGCC.equals("GCC-") || !cadenaDiferente.equals("")) {

                if (indicativoGCC.equals("GCC-")) {

                    if (isNumeric(NumeroGCC)) {
                        valor = 1;
                        return valor;
                    } else {
                        JOptionPane.showMessageDialog(null, "RECUERDE QUE EL VALOR DEL GCC DEBE SER NUMERICO \n Ej: GCC-000001");
                        valor = 0;
                        return valor;
                    }

                } else if (!cadenaDiferente.equals("")) {
                    valor = 1;
                    return valor;
                } else {
                    valor = 0;
                    return valor;
                }

            } else {
                JOptionPane.showMessageDialog(null, "RECUERDE QUE DEBE INICIAR EL INDICATIVO EN (GCC- o APR-)");
                valor = 0;
                return valor;
            }
        } else {
            JOptionPane.showMessageDialog(null, "RECUERDE QUE LOS INDICATIVOS DEBEN SER MAYOR A 3 CARACTERES \n Ej: (GCC- ; LA- ; PMV ; CO-)");
            valor = 0;
            return valor;
        }

    }

}
