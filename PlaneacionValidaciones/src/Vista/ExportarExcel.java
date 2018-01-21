package Vista;

import Conexion.ConexioSQLite;
import Conexion.export_excel;
import static Vista.Principal.conexion;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExportarExcel extends javax.swing.JDialog {

    DefaultTableModel modelo;
    private JFileChooser FileChooser = new JFileChooser();
    public JDialog jDialog = new JDialog();
    Vector columna = new Vector();
    Vector filas = new Vector();

    public ExportarExcel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_general();
    }

    ExportarExcel() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ubic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_cargar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXPORTAR A EXCEL");

        ubic.setToolTipText("Ruta donde se guardara la informacion en EXCEL");

        jLabel2.setText("Ruta :");

        btn_cargar.setBackground(new java.awt.Color(153, 255, 51));
        btn_cargar.setText("Cargar");
        btn_cargar.setToolTipText("Permite realizar el cargue de la ruta donde se exportará la informacion");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        btn_exportar.setBackground(new java.awt.Color(255, 153, 51));
        btn_exportar.setText("Exportar");
        btn_exportar.setToolTipText("Permite Exportar archivo a Excel");
        btn_exportar.setEnabled(false);
        btn_exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportarActionPerformed(evt);
            }
        });

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_exportar)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ubic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(btn_exportar))
                    .addComponent(btn_cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            File dir = dialog.getSelectedFile();
            String fl = dir.toString();

            ubic.setText(fl);
            this.btn_exportar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_cargarActionPerformed

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
        // TODO add your handling code here:
        if (ubic.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE LA RUTA DESTINO");
        } else {
            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(tabla_datos);
                //-------------------
                export_excel excelExporter = new export_excel(tb, new File(ubic.getText() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            llama_excel();
        }

    }//GEN-LAST:event_btn_exportarActionPerformed

    public void llama_excel() {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + ubic.getText() + ".xls");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void CrearTabla(File file) throws IOException {

        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(file);

            Sheet sheet = workbook.getSheet(0);
            columna.clear();

            for (int i = 0; i < sheet.getColumns(); i++) {
                Cell cell1 = sheet.getCell(i, 0);
                columna.add(cell1.getContents());
            }
            filas.clear();

            for (int j = 1; j < sheet.getRows(); j++) {

                Vector d = new Vector();

                for (int i = 0; i < sheet.getColumns(); i++) {

                    Cell cell = sheet.getCell(i, j);
                    d.add(cell.getContents());
                }
                d.add("\n");
                filas.add(d);
            }

        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_datos;
    private javax.swing.JTextField ubic;
    // End of variables declaration//GEN-END:variables

    // METODO PARA CARGAR TABLA DE DATOS
    void cargar_tabla_general() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        // TITULOS DE TABLA DE DATOS
        String[] titulos = {"NUMERO_REGISTRO", "GCC_APR", "NOMBRE_PROYECTO", "TIPO_VALIDACION", "LIDER_TECNICO", "PLANTA", "MAQUINA", "LOTE", "TURNOS", "FECHA_PROPUESTA", "ESTADO_PROYECTO", "OBSERVACIONES_VALIDACION", "FECHA_REPROGRAMACION", "OBSERVACION_REPROGRAMACION", "MOTIVO_REPROGRAMACION", "SEMANA","RESPUESTA","AUTORIZADO","OBSERVACION_EXCEPCIONES","NO_PROGRAMADA","ESTADO_EHS"};
        String[] registro = new String[22];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT NUMERO_REGISTRO, GCC_APR, NOMBRE_PROYECTO, TIPO_VALIDACION, LIDER_TECNICO, PLANTA, MAQUINA, LOTE, TURNOS, FECHA_PROPUESTA, ESTADO_PROYECTO, OBSERVACIONES_VALIDACION, FECHA_REPROGRAMACION, OBSERVACION_REPROGRAMACION, MOTIVO_REPROGRAMACION, SEMANA, RESPUESTA, AUTORIZADO, OBSERVACION_EXCEPCIONES, NO_PROGRAMADA, ESTADO_EHS "
                + "FROM "
                + "PLANEACIONES_VALIDACION "
                + "ORDER BY NUMERO_REGISTRO ASC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                // REGISTROS CONSULTADOS
                registro[0] = rs.getString("NUMERO_REGISTRO");
                registro[1] = rs.getString("GCC_APR");
                registro[2] = rs.getString("NOMBRE_PROYECTO");
                registro[3] = rs.getString("TIPO_VALIDACION");
                registro[4] = rs.getString("LIDER_TECNICO");
                registro[5] = rs.getString("PLANTA");
                registro[6] = rs.getString("MAQUINA");
                registro[7] = rs.getString("LOTE");
                registro[8] = rs.getString("TURNOS");
                registro[9] = rs.getString("FECHA_PROPUESTA");
                registro[10] = rs.getString("ESTADO_PROYECTO");
                registro[11] = rs.getString("OBSERVACIONES_VALIDACION");
                registro[12] = rs.getString("FECHA_REPROGRAMACION");
                registro[13] = rs.getString("OBSERVACION_REPROGRAMACION");
                registro[14] = rs.getString("MOTIVO_REPROGRAMACION");
                registro[15] = rs.getString("SEMANA");
                registro[16] = rs.getString("RESPUESTA");
                registro[17] = rs.getString("AUTORIZADO");
                registro[18] = rs.getString("OBSERVACION_EXCEPCIONES");
                registro[19] = rs.getString("NO_PROGRAMADA");
                registro[20] = rs.getString("ESTADO_EHS");

                modelo.addRow(registro);
            }
            tabla_datos.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
