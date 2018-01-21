package Vista;

import Conexion.ConexioSQLite;
import static Vista.Principal.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AcuerdoCalidad extends javax.swing.JFrame {

    public AcuerdoCalidad() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_lista_autorizado();
        this.gcc.setVisible(false);
        this.nombre.setVisible(false);
        this.tipo.setVisible(false);
        this.planta.setVisible(false);
        this.lider.setVisible(false);
        this.lote.setVisible(false);
        this.turno.setVisible(false);
        this.maquina.setVisible(false);
        this.fecha.setVisible(false);
        this.estado.setVisible(false);
        this.evento.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones_expciones = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combo_respuesta = new javax.swing.JComboBox();
        combo_acordado = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        registro = new javax.swing.JLabel();
        gcc = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        lider = new javax.swing.JLabel();
        planta = new javax.swing.JLabel();
        maquina = new javax.swing.JLabel();
        lote = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        evento = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_observaciones_expciones.setColumns(20);
        txt_observaciones_expciones.setRows(5);
        txt_observaciones_expciones.setText("Fecha de Acuerdo : (DD/MMM/YYYY)\nConclusion Acuerdo:");
        txt_observaciones_expciones.setToolTipText("Ejemplo\nFecha de Acuerdo : (01/ENE/2016)\nConclusion Acuerdo: Se debe dar prioridad debido a que esta semana\ndebe quedar validado por vencimiento del control de cambio GCC-XXXXX.");
        jScrollPane1.setViewportView(txt_observaciones_expciones);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACUERDO DE EXCEPCIONES");

        jLabel4.setText("Observaciones:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Respuesta :");

        combo_respuesta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "SI", "NO" }));
        combo_respuesta.setToolTipText("Respuesta del Acuerdo con el Area de Calidad");

        combo_acordado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_acordado.setToolTipText("Persona del Area de Calidad \nque Apruebo el Acuerdo");
        combo_acordado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_acordadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Acordado :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("*");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_acordado, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_acordado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("*");

        registro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registro.setForeground(new java.awt.Color(204, 0, 0));
        registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registro.setText("JLabel5");

        gcc.setText("jLabel5");

        nombre.setText("jLabel5");

        tipo.setText("jLabel5");

        lider.setText("jLabel5");

        planta.setText("jLabel5");

        maquina.setText("jLabel5");

        lote.setText("jLabel5");

        turno.setText("jLabel5");

        fecha.setText("jLabel5");

        estado.setText("jLabel5");

        evento.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(0, 466, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gcc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lider)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(planta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maquina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lote)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(evento)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gcc)
                    .addComponent(nombre)
                    .addComponent(tipo)
                    .addComponent(lider)
                    .addComponent(planta)
                    .addComponent(maquina)
                    .addComponent(lote)
                    .addComponent(turno)
                    .addComponent(fecha)
                    .addComponent(estado)
                    .addComponent(evento))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (combo_respuesta.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "INGRESE UNA RESPUESTA");
        } else if (combo_acordado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "INGRESE UNA AUTORIZACION");
        } else if (txt_observaciones_expciones.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE UNA JUSTIFICACION DE LA PROGRAMACION CON EXCEPCIONES");
        } else {

            if (combo_respuesta.getSelectedItem().equals("NO")) {
                JOptionPane.showMessageDialog(null, "POR FAVOR REALICE UN ACUERDO DE CALIDAD PREVIO");
            } else {
                Principal excepciones = new Principal();

                if (evento.getText().equals("GUARDAR")) {
                    excepciones.lb_respuesta.setVisible(true);
                    excepciones.lb_aprobador.setVisible(true);
                    excepciones.txt_respuesta.setVisible(true);
                    excepciones.txt_aprobador.setVisible(true);

                    excepciones.txt_registro.setText(registro.getText());
                    excepciones.txt_GCC.setText(gcc.getText());
                    excepciones.txt_proyecto.setText(nombre.getText());
                    excepciones.txt_fecha_propuesta.setText(fecha.getText());
                    excepciones.txt_turnos.setText(turno.getText());
                    excepciones.txt_estado_proyecto.setText(estado.getText());
                    excepciones.combo_lider_tecnico.setSelectedItem(lider.getText());
                    excepciones.combo_tipo.setSelectedItem(tipo.getText());
                    excepciones.combo_planta.setSelectedItem(planta.getText());
                    excepciones.combo_maquina.setSelectedItem(maquina.getText());
                    excepciones.combo_lote.setSelectedItem(lote.getText());

                    excepciones.txt_respuesta.setText(combo_respuesta.getSelectedItem().toString());
                    excepciones.txt_aprobador.setText(combo_acordado.getSelectedItem().toString());
                    excepciones.txt_observaciones_proyecto.setText(txt_observaciones_expciones.getText());
                    excepciones.txt_estado_proyecto.setText("Con Excepcion");
                    this.hide();
                    excepciones.setVisible(true);

                } else {
                    excepciones.lb_respuesta.setVisible(true);
                    excepciones.lb_aprobador.setVisible(true);
                    excepciones.txt_respuesta.setVisible(true);
                    excepciones.txt_aprobador.setVisible(true);

                    excepciones.txt_registro.setText(registro.getText());
                    excepciones.txt_GCC.setText(gcc.getText());
                    excepciones.txt_proyecto.setText(nombre.getText());
                    excepciones.txt_fecha_propuesta.setText(fecha.getText());
                    excepciones.txt_turnos.setText(turno.getText());
                    excepciones.txt_estado_proyecto.setText(estado.getText());
                    excepciones.combo_lider_tecnico.setSelectedItem(lider.getText());
                    excepciones.combo_tipo.setSelectedItem(tipo.getText());
                    excepciones.combo_planta.setSelectedItem(planta.getText());
                    excepciones.combo_maquina.setSelectedItem(maquina.getText());
                    excepciones.combo_lote.setSelectedItem(lote.getText());

                    excepciones.txt_respuesta.setText(combo_respuesta.getSelectedItem().toString());
                    excepciones.txt_aprobador.setText(combo_acordado.getSelectedItem().toString());
                    excepciones.txt_observaciones_proyecto.setText(txt_observaciones_expciones.getText());
                    excepciones.txt_estado_proyecto.setText("Con Excepcion");
                    this.hide();
                    excepciones.setVisible(true);

                }

            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo_acordadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_acordadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_acordadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_acordado;
    private javax.swing.JComboBox combo_respuesta;
    public javax.swing.JLabel estado;
    public javax.swing.JLabel evento;
    public javax.swing.JLabel fecha;
    public javax.swing.JLabel gcc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lider;
    public javax.swing.JLabel lote;
    public javax.swing.JLabel maquina;
    public javax.swing.JLabel nombre;
    public javax.swing.JLabel planta;
    public javax.swing.JLabel registro;
    public javax.swing.JLabel tipo;
    public javax.swing.JLabel turno;
    private javax.swing.JTextArea txt_observaciones_expciones;
    // End of variables declaration//GEN-END:variables

// METODO PARA CARGAR LISTA DE AUTORIZADO
    public void cargar_lista_autorizado() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM AUTORIZADOS_EXCEPCIONES ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_acordado.addItem(rs.getString("NOMBRE_AUTORIZADO"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
