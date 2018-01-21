package Vista;

import Conexion.ConexioSQLite;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class PrerequisitoCalificacion extends javax.swing.JFrame {

    public static ConexioSQLite conexion;
    
    public PrerequisitoCalificacion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combo_pre_especificacion = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        combo_pre_protocolos = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        combo_pre_RU = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        combo_pre_libro = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        combo_pre_BR = new javax.swing.JComboBox();
        combo_pre_SOP = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_pre_hoja = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        combo_pre_rutinas = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        combo_pre_certificado = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        combo_pre_planos = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        combo_pre_manual = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        combo_pre_materiales = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        combo_pre_recursos = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        combo_pre_entrenamiento = new javax.swing.JComboBox();
        txt_pre_rutinas = new javax.swing.JTextField();
        txt_pre_certificado = new javax.swing.JTextField();
        txt_pre_planos = new javax.swing.JTextField();
        txt_pre_manual = new javax.swing.JTextField();
        txt_pre_materiales = new javax.swing.JTextField();
        txt_pre_recursos = new javax.swing.JTextField();
        txt_pre_entrenamiento = new javax.swing.JTextField();
        txt_pre_especificacion = new javax.swing.JTextField();
        txt_pre_protocolo = new javax.swing.JTextField();
        txt_pre_RU = new javax.swing.JTextField();
        txt_pre_libro = new javax.swing.JTextField();
        txt_pre_BR = new javax.swing.JTextField();
        txt_pre_SOP = new javax.swing.JTextField();
        txt_pre_hoja = new javax.swing.JTextField();
        txt_fecha_protocolo = new javax.swing.JTextField();
        txt_fecha_especificacion = new javax.swing.JTextField();
        txt_fecha_sop = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_cargar = new javax.swing.JButton();
        txt_registro_principal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_fecha_propuesta = new javax.swing.JTextField();
        btnTodosNA = new javax.swing.JButton();
        btnTodosCompletos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(970, 620));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRE-REQUISITOS DE CALIFICACION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentacion"));

        jLabel2.setText("Especificacion de Equipo :");

        combo_pre_especificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));

        jLabel3.setText("Protocolos Oficiales :");

        combo_pre_protocolos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_protocolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_protocolosActionPerformed(evt);
            }
        });

        jLabel4.setText("Impacto en EHS :");

        combo_pre_RU.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NO", "Pendiente", "SI" }));
        combo_pre_RU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_RUActionPerformed(evt);
            }
        });

        jLabel5.setText("Libro de Parametros :");

        combo_pre_libro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_libroActionPerformed(evt);
            }
        });

        jLabel6.setText("BR Actualizado :");

        combo_pre_BR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_BR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_BRActionPerformed(evt);
            }
        });

        combo_pre_SOP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_SOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_SOPActionPerformed(evt);
            }
        });

        jLabel7.setText("SOP Actualizados :");

        jLabel8.setText("Hoja de Vida Calibracion :");

        combo_pre_hoja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_hoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_hojaActionPerformed(evt);
            }
        });

        jLabel9.setText("Rutinas de Mantenimiento :");

        combo_pre_rutinas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));

        jLabel10.setText("Certificado de Materiales :");

        combo_pre_certificado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_certificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_certificadoActionPerformed(evt);
            }
        });

        jLabel11.setText("Planos Actualizados :");

        combo_pre_planos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_planos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_planosActionPerformed(evt);
            }
        });

        jLabel12.setText("Manual del Equipo :");

        combo_pre_manual.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_manualActionPerformed(evt);
            }
        });

        jLabel13.setText("Materiales Disponibles :");

        combo_pre_materiales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_materiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_materialesActionPerformed(evt);
            }
        });

        jLabel14.setText("Recursos Disponibles :");

        combo_pre_recursos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_recursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_recursosActionPerformed(evt);
            }
        });

        jLabel15.setText("Entrenamientos :");

        combo_pre_entrenamiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Aplica", "Pendiente", "Completo" }));
        combo_pre_entrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pre_entrenamientoActionPerformed(evt);
            }
        });

        txt_pre_rutinas.setEditable(false);

        txt_pre_certificado.setEditable(false);

        txt_pre_planos.setEditable(false);

        txt_pre_manual.setEditable(false);

        txt_pre_materiales.setEditable(false);

        txt_pre_recursos.setEditable(false);

        txt_pre_entrenamiento.setEditable(false);
        txt_pre_entrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pre_entrenamientoActionPerformed(evt);
            }
        });

        txt_pre_especificacion.setEditable(false);

        txt_pre_protocolo.setEditable(false);

        txt_pre_RU.setEditable(false);

        txt_pre_libro.setEditable(false);

        txt_pre_BR.setEditable(false);

        txt_pre_SOP.setEditable(false);

        txt_pre_hoja.setEditable(false);
        txt_pre_hoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pre_hojaActionPerformed(evt);
            }
        });

        txt_fecha_protocolo.setEditable(false);
        txt_fecha_protocolo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_fecha_especificacion.setEditable(false);
        txt_fecha_especificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_fecha_sop.setEditable(false);
        txt_fecha_sop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Estado :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Fecha Esperada :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Estado :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("Nota: Los documentos que no tienen fecha esperada su fecha maxima de creacion es su fecha pruesta.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_hoja, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_pre_SOP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_pre_protocolos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_RU, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_pre_BR, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(txt_pre_SOP)
                    .addComponent(txt_pre_BR)
                    .addComponent(txt_pre_libro)
                    .addComponent(txt_pre_RU)
                    .addComponent(txt_pre_protocolo)
                    .addComponent(txt_pre_especificacion)
                    .addComponent(txt_pre_hoja, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fecha_sop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pre_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_pre_rutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_pre_certificado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pre_manual, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pre_planos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_pre_entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_pre_recursos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_materiales, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_manual, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_planos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_certificado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_rutinas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pre_entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_fecha_protocolo)
                            .addComponent(txt_fecha_especificacion)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(330, 330, 330)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pre_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_protocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_pre_RU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(combo_pre_rutinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_rutinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(combo_pre_certificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_certificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(combo_pre_planos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_planos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(combo_pre_manual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_manual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(combo_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_materiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(combo_pre_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(combo_pre_entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combo_pre_especificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combo_pre_protocolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(combo_pre_RU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(combo_pre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(combo_pre_BR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_BR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(combo_pre_SOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_SOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_sop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(combo_pre_hoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pre_hoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        btn_actualizar.setBackground(new java.awt.Color(102, 255, 0));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setToolTipText("Permite actualizar la documentacion a estado (Pendiente, Completo, No aplica)");
        btn_actualizar.setEnabled(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_cargar.setBackground(new java.awt.Color(51, 102, 255));
        btn_cargar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cargar.setText("Cargar");
        btn_cargar.setToolTipText("Permite Cargar la informacion Obtenida de Base de Datos");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        txt_registro_principal.setEditable(false);
        txt_registro_principal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_registro_principal.setForeground(new java.awt.Color(255, 0, 0));
        txt_registro_principal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setText("Numero Registro :");

        jLabel18.setText("Fecha Propuesta de Calificacion:");

        txt_fecha_propuesta.setEditable(false);
        txt_fecha_propuesta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_fecha_propuesta.setForeground(new java.awt.Color(255, 0, 0));
        txt_fecha_propuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnTodosNA.setBackground(new java.awt.Color(102, 102, 102));
        btnTodosNA.setForeground(new java.awt.Color(255, 255, 255));
        btnTodosNA.setText("Seleccionar Todos N/A");
        btnTodosNA.setEnabled(false);
        btnTodosNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosNAActionPerformed(evt);
            }
        });

        btnTodosCompletos.setBackground(new java.awt.Color(102, 102, 102));
        btnTodosCompletos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodosCompletos.setText("Seleccionar Todos Completos");
        btnTodosCompletos.setEnabled(false);
        btnTodosCompletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosCompletosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_registro_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_fecha_propuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTodosCompletos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnTodosNA))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(3, 3, 3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fecha_propuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTodosNA)
                            .addComponent(btnTodosCompletos)))
                    .addComponent(txt_registro_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_pre_protocolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_protocolosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_protocolosActionPerformed

    private void combo_pre_RUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_RUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_RUActionPerformed

    private void combo_pre_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_libroActionPerformed

    private void combo_pre_BRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_BRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_BRActionPerformed

    private void combo_pre_SOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_SOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_SOPActionPerformed

    private void combo_pre_hojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_hojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_hojaActionPerformed

    private void combo_pre_certificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_certificadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_certificadoActionPerformed

    private void combo_pre_planosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_planosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_planosActionPerformed

    private void combo_pre_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_manualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_manualActionPerformed

    private void combo_pre_materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_materialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_materialesActionPerformed

    private void combo_pre_recursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_recursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_recursosActionPerformed

    private void txt_pre_hojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pre_hojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pre_hojaActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed

        if (!txt_registro_principal.getText().equals("")) {

            String pre_calificacion = txt_registro_principal.getText();

            if (consulta_pre_calificacion(pre_calificacion)) {
                coloresCampos();
                btn_actualizar.setEnabled(true);
                btn_cargar.setEnabled(false);
                btnTodosCompletos.setEnabled(true);
                btnTodosNA.setEnabled(true);
                fechasProximas();
                JOptionPane.showMessageDialog(null, "INFORMACION CARGADA");
            } else {
                JOptionPane.showMessageDialog(null, "INFORMACION NO CARGADA");
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA");
        }

    }//GEN-LAST:event_btn_cargarActionPerformed

    private void txt_pre_entrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pre_entrenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pre_entrenamientoActionPerformed

    private void combo_pre_entrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pre_entrenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_pre_entrenamientoActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if(txt_registro_principal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA");
        }else{
             conexion = new ConexioSQLite();
        conexion.coneccionbase();
        
        String registro = txt_registro_principal.getText();
        String especificacion = combo_pre_especificacion.getSelectedItem().toString();
        String protocolo = combo_pre_protocolos.getSelectedItem().toString();
        String RU = combo_pre_RU.getSelectedItem().toString();
        String libro = combo_pre_libro.getSelectedItem().toString();
        String BR = combo_pre_BR.getSelectedItem().toString();
        String SOP = combo_pre_SOP.getSelectedItem().toString();
        String hoja = combo_pre_hoja.getSelectedItem().toString();
        String rutinas = combo_pre_rutinas.getSelectedItem().toString();
        String certificado = combo_pre_certificado.getSelectedItem().toString();
        String planos = combo_pre_planos.getSelectedItem().toString();
        String manuales = combo_pre_manual.getSelectedItem().toString();
        String materiales = combo_pre_materiales.getSelectedItem().toString();
        String recursos = combo_pre_recursos.getSelectedItem().toString();
        String entrenamiento = combo_pre_entrenamiento.getSelectedItem().toString();
        
        boolean resultado = conexion.upgrade_pre_calificacion(registro, especificacion, protocolo, RU, libro, BR, SOP, hoja, rutinas, certificado, planos, manuales, materiales, recursos, entrenamiento);
        
        if (resultado == true) {
                JOptionPane.showMessageDialog(null, "PROYECTO ACTUALIZADO");
                coloresCampos();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                consulta_pre_calificacion(registro);
            }
        }
        
        
       
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btnTodosCompletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosCompletosActionPerformed
        TodosCompletos();
    }//GEN-LAST:event_btnTodosCompletosActionPerformed

    private void btnTodosNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosNAActionPerformed
        TodosNA();
    }//GEN-LAST:event_btnTodosNAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTodosCompletos;
    private javax.swing.JButton btnTodosNA;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JComboBox combo_pre_BR;
    private javax.swing.JComboBox combo_pre_RU;
    private javax.swing.JComboBox combo_pre_SOP;
    private javax.swing.JComboBox combo_pre_certificado;
    private javax.swing.JComboBox combo_pre_entrenamiento;
    private javax.swing.JComboBox combo_pre_especificacion;
    private javax.swing.JComboBox combo_pre_hoja;
    private javax.swing.JComboBox combo_pre_libro;
    private javax.swing.JComboBox combo_pre_manual;
    private javax.swing.JComboBox combo_pre_materiales;
    private javax.swing.JComboBox combo_pre_planos;
    private javax.swing.JComboBox combo_pre_protocolos;
    private javax.swing.JComboBox combo_pre_recursos;
    private javax.swing.JComboBox combo_pre_rutinas;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_fecha_especificacion;
    public javax.swing.JTextField txt_fecha_propuesta;
    private javax.swing.JTextField txt_fecha_protocolo;
    private javax.swing.JTextField txt_fecha_sop;
    private javax.swing.JTextField txt_pre_BR;
    private javax.swing.JTextField txt_pre_RU;
    private javax.swing.JTextField txt_pre_SOP;
    private javax.swing.JTextField txt_pre_certificado;
    private javax.swing.JTextField txt_pre_entrenamiento;
    private javax.swing.JTextField txt_pre_especificacion;
    private javax.swing.JTextField txt_pre_hoja;
    private javax.swing.JTextField txt_pre_libro;
    private javax.swing.JTextField txt_pre_manual;
    private javax.swing.JTextField txt_pre_materiales;
    private javax.swing.JTextField txt_pre_planos;
    private javax.swing.JTextField txt_pre_protocolo;
    private javax.swing.JTextField txt_pre_recursos;
    private javax.swing.JTextField txt_pre_rutinas;
    public javax.swing.JTextField txt_registro_principal;
    // End of variables declaration//GEN-END:variables

    // METODO PARA CONSULTAR PREREQUISITOS DE CALIFICACION POR REGISTRO
    public boolean consulta_pre_calificacion(String registro) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
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
                + "WHERE "
                + "NUMERO_REGISTRO = " + registro + ";";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                // REGISTROS CONSULTADOS
                combo_pre_especificacion.setSelectedItem(rs.getString("ESPECIFICACION"));
                combo_pre_protocolos.setSelectedItem(rs.getString("PROTOCOLO"));
                combo_pre_RU.setSelectedItem(rs.getString("NO_GXP"));
                combo_pre_libro.setSelectedItem(rs.getString("LIBRO"));
                combo_pre_BR.setSelectedItem(rs.getString("BR"));
                combo_pre_SOP.setSelectedItem(rs.getString("SOP"));
                combo_pre_hoja.setSelectedItem(rs.getString("HOJA"));
                combo_pre_rutinas.setSelectedItem(rs.getString("RUTINA"));
                combo_pre_certificado.setSelectedItem(rs.getString("CERTIFICADO"));
                combo_pre_planos.setSelectedItem(rs.getString("PLANO"));
                combo_pre_manual.setSelectedItem(rs.getString("MANUALES"));
                combo_pre_materiales.setSelectedItem(rs.getString("MATERIAL"));
                combo_pre_recursos.setSelectedItem(rs.getString("RECURSOS"));
                combo_pre_entrenamiento.setSelectedItem(rs.getString("ENTRENAMIENTO"));
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;

        }
    }
        
    // METODO PARA VALIDAR COLORES POR REQUISITO
    public void coloresCampos() {
        
        //VALIDACION ESPECIFICACION DE EQUIPO
        switch (combo_pre_especificacion.getSelectedIndex()) {
            case 0:
                txt_pre_especificacion.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_especificacion.setBackground(Color.RED);
                break;
            default:
                txt_pre_especificacion.setBackground(Color.GREEN);
                break;
        }
                
        //VALIDACION PROTOCOLOS
        switch (combo_pre_protocolos.getSelectedIndex()) {
            case 0:
                txt_pre_protocolo.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_protocolo.setBackground(Color.RED);
                break;
            default:
                txt_pre_protocolo.setBackground(Color.GREEN);
                break;
        }
            
        //VALIDACION RU
        switch (combo_pre_RU.getSelectedIndex()) {
            case 0:
                txt_pre_RU.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_RU.setBackground(Color.RED);
                break;        
            default:
                txt_pre_RU.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION LIBRO
        switch (combo_pre_libro.getSelectedIndex()) {
            case 0:
                txt_pre_libro.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_libro.setBackground(Color.RED);
                break;
            default:
                txt_pre_libro.setBackground(Color.GREEN);
                break;
        }
                
        //VALIDACION BR
        switch (combo_pre_BR.getSelectedIndex()) {
            case 0:
                txt_pre_BR.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_BR.setBackground(Color.RED);
                break;
            default:
                txt_pre_BR.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION SOP
        switch (combo_pre_SOP.getSelectedIndex()) {
            case 0:
                txt_pre_SOP.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_SOP.setBackground(Color.RED);
                break;
            default:
                txt_pre_SOP.setBackground(Color.GREEN);
                break;
        }
                
        //VALIDACION HOJA DE VIDA
        switch (combo_pre_hoja.getSelectedIndex()) {
            case 0:
                txt_pre_hoja.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_hoja.setBackground(Color.RED);
                break;
            default:
                txt_pre_hoja.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION RUTINA DE MANTENIMEINTO
        switch (combo_pre_rutinas.getSelectedIndex()) {
            case 0:
                txt_pre_rutinas.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_rutinas.setBackground(Color.RED);
                break;
            default:
                txt_pre_rutinas.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION CERTIFICADO
        switch (combo_pre_certificado.getSelectedIndex()) {
            case 0:
                txt_pre_certificado.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_certificado.setBackground(Color.RED);
                break;
            default:
                txt_pre_certificado.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION PLANOS
        switch (combo_pre_planos.getSelectedIndex()) {
            case 0:
                txt_pre_planos.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_planos.setBackground(Color.RED);
                break;
            default:
                txt_pre_planos.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION MANUALES
        switch (combo_pre_manual.getSelectedIndex()) {
            case 0:
                txt_pre_manual.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_manual.setBackground(Color.RED);
                break;
            default:
                txt_pre_manual.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION MATERIALES
        switch (combo_pre_materiales.getSelectedIndex()) {
            case 0:
                txt_pre_materiales.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_materiales.setBackground(Color.RED);
                break;
            default:
                txt_pre_materiales.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION RECURSOS
        switch (combo_pre_recursos.getSelectedIndex()) {
            case 0:
                txt_pre_recursos.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_recursos.setBackground(Color.RED);
                break;
            default:
                txt_pre_recursos.setBackground(Color.GREEN);
                break;
        }
        
        //VALIDACION ENTRENAMIENTO
        switch (combo_pre_entrenamiento.getSelectedIndex()) {
            case 0:
                txt_pre_entrenamiento.setBackground(Color.GRAY);
                break;
            case 1:
                txt_pre_entrenamiento.setBackground(Color.RED);
                break;
            default:
                txt_pre_entrenamiento.setBackground(Color.GREEN);
                break;
        }
    }
    
    // METODO PARA CALCULAR FECHAS ESPERADAS POR DOCUMENTOS PREREQUISITOS
    public void fechasProximas() {

        try {
            // CONVERSION DE FECHA PROPUESTA (STRING A DATE)
            String fecha_propuesta = "";
            fecha_propuesta = txt_fecha_propuesta.getText();
            SimpleDateFormat convertifecha = new SimpleDateFormat("yyyy-MM-dd");
            Date fechafinal = convertifecha.parse(fecha_propuesta);

            // SUMA DE DIAS A FECHA PROPUESTA
            Date fechaSuma1 = sumarRestarDiasFecha(fechafinal, -25);           
            DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd");
            String fechaConverida1 = fechaHora.format(fechaSuma1);
            txt_fecha_especificacion.setText(fechaConverida1);
                  
            // SUMA DE DIAS A FECHA PROPUESTA
            Date fechaSuma2 = sumarRestarDiasFecha(fechafinal, -20);           
            DateFormat fechaHora2 = new SimpleDateFormat("yyyy-MM-dd");
            String fechaConverida2 = fechaHora2.format(fechaSuma2);            
            
            txt_fecha_protocolo.setText(fechaConverida2);
            txt_fecha_sop.setText(fechaConverida2);                      
            
        } catch (ParseException ex) {

        }
    }

    // METODO PARA RESTAR DIAS A FECHA PROPUESTA
    public Date sumarRestarDiasFecha(Date fecha, int dias) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias); // numero de días a añadir, o restar en caso de días<0

        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos

    }
    
    public void TodosCompletos(){
      combo_pre_BR.setSelectedIndex(2);
      combo_pre_RU.setSelectedIndex(2);
      combo_pre_SOP.setSelectedIndex(2);
      combo_pre_certificado.setSelectedIndex(2);
      combo_pre_entrenamiento.setSelectedIndex(2);
      combo_pre_especificacion.setSelectedIndex(2);
      combo_pre_hoja.setSelectedIndex(2);
      combo_pre_libro.setSelectedIndex(2);
      combo_pre_manual.setSelectedIndex(2);
      combo_pre_materiales.setSelectedIndex(2);
      combo_pre_planos.setSelectedIndex(2);
      combo_pre_protocolos.setSelectedIndex(2);
      combo_pre_recursos.setSelectedIndex(2);
      combo_pre_rutinas.setSelectedIndex(2);      
    }
    
    public void TodosNA(){
      combo_pre_BR.setSelectedIndex(0);
      combo_pre_RU.setSelectedIndex(0);
      combo_pre_SOP.setSelectedIndex(0);
      combo_pre_certificado.setSelectedIndex(0);
      combo_pre_entrenamiento.setSelectedIndex(0);
      combo_pre_especificacion.setSelectedIndex(0);
      combo_pre_hoja.setSelectedIndex(0);
      combo_pre_libro.setSelectedIndex(0);
      combo_pre_manual.setSelectedIndex(0);
      combo_pre_materiales.setSelectedIndex(0);
      combo_pre_planos.setSelectedIndex(0);
      combo_pre_protocolos.setSelectedIndex(0);
      combo_pre_recursos.setSelectedIndex(0);
      combo_pre_rutinas.setSelectedIndex(0);      
    }
}
