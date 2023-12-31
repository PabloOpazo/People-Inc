/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.Registro;
import Modelo.Employee;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author CETECOM
 */
public class EmployeeModificar extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeListar
     */
    public EmployeeModificar() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id = new javax.swing.JTextField();
        bt_buscar_id = new javax.swing.JButton();
        txt_nombre_completo = new javax.swing.JTextField();
        lb_nombre_completo = new javax.swing.JLabel();
        txt_departamento = new javax.swing.JTextField();
        lb_departamento = new javax.swing.JLabel();
        ftxt_fecha_contratacion = new javax.swing.JFormattedTextField();
        lb_fecha_contratacion = new javax.swing.JLabel();
        lb_sueldo_mensual = new javax.swing.JLabel();
        sp_sueldo_mensual = new javax.swing.JSpinner();
        txt_posicion = new javax.swing.JTextField();
        lb_posicion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        bt_buscar_id.setText("Buscar ID");
        bt_buscar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscar_idActionPerformed(evt);
            }
        });

        txt_nombre_completo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_completoActionPerformed(evt);
            }
        });

        lb_nombre_completo.setText("Nombre completo:");

        txt_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_departamentoActionPerformed(evt);
            }
        });

        lb_departamento.setText("Departamento:");

        ftxt_fecha_contratacion.setForeground(new java.awt.Color(204, 204, 204));
        ftxt_fecha_contratacion.setText("YYYY-MM-DD");
        ftxt_fecha_contratacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftxt_fecha_contratacionMouseClicked(evt);
            }
        });
        ftxt_fecha_contratacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxt_fecha_contratacionActionPerformed(evt);
            }
        });

        lb_fecha_contratacion.setText("Fecha contratación:");

        lb_sueldo_mensual.setText("Sueldo mensual:");

        sp_sueldo_mensual.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_sueldo_mensualStateChanged(evt);
            }
        });

        lb_posicion.setText("Posición:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre_completo)
                            .addComponent(lb_departamento)
                            .addComponent(lb_fecha_contratacion)
                            .addComponent(lb_sueldo_mensual)
                            .addComponent(lb_posicion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_posicion)
                            .addComponent(ftxt_fecha_contratacion)
                            .addComponent(txt_departamento)
                            .addComponent(txt_nombre_completo)
                            .addComponent(sp_sueldo_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_buscar_id)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscar_id))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nombre_completo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_departamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxt_fecha_contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_fecha_contratacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_sueldo_mensual)
                    .addComponent(sp_sueldo_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_posicion))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_nombre_completoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_completoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_completoActionPerformed

    private void txt_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departamentoActionPerformed

    private void ftxt_fecha_contratacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftxt_fecha_contratacionMouseClicked
        ftxt_fecha_contratacion.setValue("");
        ftxt_fecha_contratacion.setForeground(Color.black);
    }//GEN-LAST:event_ftxt_fecha_contratacionMouseClicked

    private void ftxt_fecha_contratacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxt_fecha_contratacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxt_fecha_contratacionActionPerformed

    private void sp_sueldo_mensualStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_sueldo_mensualStateChanged
        //validar numeros negativos

    }//GEN-LAST:event_sp_sueldo_mensualStateChanged

    private void bt_buscar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscar_idActionPerformed
        Employee usu = Registro.buscarPorUsuario(Integer.parseInt(txt_id.getText()));
        if(usu == null) {
            JOptionPane.showMessageDialog(null, "ID no encontrado");
        } else {
            this.txt_nombre_completo.setText(usu.getNombre_completo());
            this.txt_departamento.setText(usu.getDepartamento());
            this.ftxt_fecha_contratacion.setText(usu.getFecha_contratacion());
            this.sp_sueldo_mensual.setValue(usu.getSueldo_mensual());
            this.txt_posicion.setText(usu.getPosicion());
        }
    }//GEN-LAST:event_bt_buscar_idActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar_id;
    private javax.swing.JFormattedTextField ftxt_fecha_contratacion;
    private javax.swing.JLabel lb_departamento;
    private javax.swing.JLabel lb_fecha_contratacion;
    private javax.swing.JLabel lb_nombre_completo;
    private javax.swing.JLabel lb_posicion;
    private javax.swing.JLabel lb_sueldo_mensual;
    private javax.swing.JSpinner sp_sueldo_mensual;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre_completo;
    private javax.swing.JTextField txt_posicion;
    // End of variables declaration//GEN-END:variables
}
