/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author YAHYA
 */
public class viewAntrean extends javax.swing.JFrame {

    /**
     * Creates new form viewAntrean
     */
    public viewAntrean() {
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

        isiForm = new javax.swing.JButton();
        antreTeller = new javax.swing.JTextField();
        AntreCS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        isiForm.setText("Isi Form");
        getContentPane().add(isiForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        antreTeller.setEditable(false);
        antreTeller.setBackground(new java.awt.Color(51, 102, 255));
        antreTeller.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        antreTeller.setForeground(new java.awt.Color(255, 255, 255));
        antreTeller.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        antreTeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antreTellerActionPerformed(evt);
            }
        });
        getContentPane().add(antreTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 280, 258));

        AntreCS.setEditable(false);
        AntreCS.setBackground(new java.awt.Color(51, 102, 255));
        AntreCS.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        AntreCS.setForeground(new java.awt.Color(255, 255, 255));
        AntreCS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AntreCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntreCSActionPerformed(evt);
            }
        });
        getContentPane().add(AntreCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 280, 258));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/background/48.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void antreTellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antreTellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antreTellerActionPerformed

    private void AntreCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntreCSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AntreCSActionPerformed

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
            java.util.logging.Logger.getLogger(viewAntrean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewAntrean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewAntrean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewAntrean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewAntrean().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AntreCS;
    private javax.swing.JTextField antreTeller;
    private javax.swing.JButton isiForm;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    public void addActionListener(ActionListener x) {
        isiForm.addActionListener(x);
    }

    public String getAntreTeller() {
        return antreTeller.getText();
    }

    public void setAntreTeller(String antreTeller) {
        this.antreTeller.setText(antreTeller);
    }

    public JButton getIsiForm() {
        return isiForm;
    }

    public void setIsiForm(JButton isiForm) {
        this.isiForm = isiForm;
    }

    public String getAntreCS() {
        return AntreCS.getText();
    }

    public void setAntreCS(String AntreCS) {
        this.AntreCS.setText(AntreCS);
    }
    
    

}
