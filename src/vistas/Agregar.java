/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controlador.RegistroHotel;
import javax.swing.JOptionPane;
import modelo.Hotel;

/**
 *
 * @author Francisco
 */
public class Agregar extends javax.swing.JFrame {
    
    static RegistroHotel registro = new RegistroHotel(); // Static hace llamado directo al método, no necesita objeto
    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfHotel = new javax.swing.JTextField();
        tfCiudad = new javax.swing.JTextField();
        nroEstrellas = new javax.swing.JComboBox<>();
        mascotaSi = new javax.swing.JRadioButton();
        mascotaNo = new javax.swing.JRadioButton();
        btGrabar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar un hotel - Asociación Hotelera Nacional");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre hotel:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ciudad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Estrellas:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("¿Acepta mascotas?:");

        tfCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfHotel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tfCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        nroEstrellas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nroEstrellas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", "5" }));
        nroEstrellas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroEstrellasActionPerformed(evt);
            }
        });

        mascotaSi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mascotaSi.setText("Sí");
        mascotaSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotaSiActionPerformed(evt);
            }
        });

        mascotaNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mascotaNo.setText("No");
        mascotaNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotaNoActionPerformed(evt);
            }
        });

        btGrabar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btGrabar.setText("Grabar");
        btGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGrabarActionPerformed(evt);
            }
        });

        btLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(mascotaSi)
                        .addGap(18, 18, 18)
                        .addComponent(mascotaNo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nroEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(tfCiudad)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGrabar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btGrabar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nroEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mascotaSi)
                            .addComponent(mascotaNo))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mascotaNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotaNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascotaNoActionPerformed

    private void btGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGrabarActionPerformed
        // TODO add your handling code here:
        try {

            Hotel hotel = new Hotel();
            
            // Guardar código y que NO SEA NULO
            String codigoBD = this.tfCodigo.getText();
            if (codigoBD.length() == 0) {
                throw new Exception("Debe escribir un código !!");
            } else {
                hotel.setCodigo(this.tfCodigo.getText());
            }
            
            // Guardar nombre hotel y que NO SEA NULO
            String nombreBD = this.tfHotel.getText();
            if (nombreBD.length() == 0) {
                throw new Exception("Debe escribir un nombre de hotel !!");
            } else {
                hotel.setNombre(this.tfHotel.getText());
            }
            
            // Guardar ciudad y que NO SEA NULO
            String ciudadBD = this.tfCiudad.getText();
            if (ciudadBD.length() == 0) {
                throw new Exception("Debe escribir una ciudad !!");
            } else {
                hotel.setCiudad(this.tfCiudad.getText());
            }

            // Guardar estrellas y que NO SEA NULO
            if(this.nroEstrellas.getSelectedIndex()== 0){
                throw new Exception("Debe seleccionar estrellas !!");
            } else {
                hotel.setEstrellas(this.nroEstrellas.getSelectedIndex());
            }

            // Guardar mascotas y que NO SEA NULO
            if (this.mascotaSi.isSelected() && this.mascotaNo.isSelected()) {
                throw new Exception("Debe seleccionar SOLO UNA OPCIÓN en mascotas !!");
            } else if (this.mascotaSi.isSelected()) {
                hotel.setMascotas(true);
            } else if (this.mascotaNo.isSelected()) {
                hotel.setMascotas(false);
            } else {
                throw new Exception("Debe seleccionar una opción en mascotas !!");
            }
            
            
            
            if (registro.agregarHotel(hotel)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Registro Grabado !!");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se grabo !!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR:\n" + ex.getMessage());
            
        }
    }//GEN-LAST:event_btGrabarActionPerformed

    private void nroEstrellasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroEstrellasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroEstrellasActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
            this.tfCodigo.setText("");
            this.tfHotel.setText("");
            this.tfCiudad.setText("");
            this.nroEstrellas.setSelectedIndex(0);
            this.mascotaSi.setSelected(false);
            this.mascotaNo.setSelected(false);
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void mascotaSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotaSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascotaSiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGrabar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton mascotaNo;
    private javax.swing.JRadioButton mascotaSi;
    private javax.swing.JComboBox<String> nroEstrellas;
    private javax.swing.JTextField tfCiudad;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfHotel;
    // End of variables declaration//GEN-END:variables
}
