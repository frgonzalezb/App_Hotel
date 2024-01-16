/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controlador.RegistroHotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Hotel;
import sql.Conexion;

public class Listar extends javax.swing.JFrame {

    static RegistroHotel registro = new RegistroHotel(); // Static hace llamado directo al método, no necesita objeto

    public Listar() {
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
        tfCodigo = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        tablaListar = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btEliminar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listar hoteles - Asociación Hotelera Nacional");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Código:");

        tfCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Ciudad", "Estrellas", "Mascotas"
            }
        ));
        tablaListar.setViewportView(jTable1);

        btEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablaListar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btEliminar)
                        .addGap(172, 172, 172)
                        .addComponent(btModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(tablaListar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminar)
                    .addComponent(btModificar)
                    .addComponent(btSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        String codigo = this.tfCodigo.getText().trim();

        if (!codigo.equals("")) {
            buscarCodigo(codigo);
        } else {
            mostrarTodos();
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        // TODO add your handling code here:  
        if (jTable1.getSelectedRowCount() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila !!");
        } else if (jTable1.getSelectedRowCount() > 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar sólo una fila !!");
        } else {
            // Captura datos, gracias Maykol !!
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            String codigo = String.valueOf(tm.getValueAt(jTable1.getSelectedRow(),0));
            this.tfCodigo.setText(codigo);
            
            Modificar m1 = new Modificar(codigo);
            m1.setVisible(true);
            
            m1.codigoex = codigo;
        }
        
    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRowCount() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar una fila !!");
        } else if (jTable1.getSelectedRowCount() > 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar sólo una fila !!");
        } else {
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            String codigo = String.valueOf(tm.getValueAt(jTable1.getSelectedRow(),0));
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este hotel?", "¡Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (respuesta == 0) { // Si el usuario dice que sí
                eliminarHotel(codigo);
                JOptionPane.showMessageDialog(null, "Se borró correctamente");
                mostrarTodos();
            }
        }
    }//GEN-LAST:event_btEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tablaListar;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables

    private void buscarCodigo(String codigo) {
        //ahora a traves del controlador solicitamos el registro
        Hotel hotel = new RegistroHotel().buscarPorCodigo(codigo);
        //analizamos si retorno el registro o viene vacio
        if (hotel == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay registros para el codigo: " + codigo);
//        } else if (codigo == "") {
//            mostrarTodos();
        } else {

            //JOptionPane.showMessageDialog(null, hotel.toString());
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            modelo.addColumn("Ciudad");
            modelo.addColumn("Estrellas");
            modelo.addColumn("¿Mascotas?");

            this.jTable1.setModel(modelo);
            String[] datos = new String[5];

            datos[0] = hotel.getCodigo();
            datos[1] = hotel.getNombre();
            datos[2] = hotel.getCiudad();
            datos[3] = hotel.getEstrellas() + "";

            String r = "SI";
            if (hotel.isMascotas() == false) {
                r = "NO";
            }
            datos[4] = r;
            modelo.addRow(datos);

            this.jTable1.setModel(modelo);
        }
    }
    
    private void mostrarTodos() {
        //ahora a traves del controlador solicitamos el registro

        ArrayList<Hotel> Registro = new RegistroHotel().mostrarTodos();

        //JOptionPane.showMessageDialog(null, hotel.toString());
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Estrellas");
        modelo.addColumn("¿Mascotas?");

        this.jTable1.setModel(modelo);
        String[] datos = new String[5];

        for (Hotel hotel : Registro) {

            datos[0] = hotel.getCodigo();
            datos[1] = hotel.getNombre();
            datos[2] = hotel.getCiudad();
            datos[3] = hotel.getEstrellas() + "";

            String r = "SI";
            if (hotel.isMascotas() == false) {
                r = "NO";
            }
            datos[4] = r;
            modelo.addRow(datos);
        }

        this.jTable1.setModel(modelo);

    }

    private void eliminarHotel(String codigo) {
        boolean hotel = new RegistroHotel().eliminarHotel(codigo);
    }

    
}