/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author YAHYA
 */
public class Awal extends javax.swing.JFrame {

    /**
     * Creates new form Awal
     */
    public Awal() {
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

        bLogin = new javax.swing.JButton();
        BACKGROUND = new javax.swing.JLabel();
        customerService = new javax.swing.JButton();
        teller = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bLogin.setText("Login");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/background/7.jpg"))); // NOI18N
        BACKGROUND.setText(" ");
        getContentPane().add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        customerService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerServiceActionPerformed(evt);
            }
        });
        getContentPane().add(customerService, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 230, 170));

        teller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tellerActionPerformed(evt);
            }
        });
        getContentPane().add(teller, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 230, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerServiceActionPerformed
      
    }//GEN-LAST:event_customerServiceActionPerformed

    private void tellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tellerActionPerformed
      
    }//GEN-LAST:event_tellerActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
      
    }//GEN-LAST:event_bLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JButton bLogin;
    private javax.swing.JButton customerService;
    private javax.swing.JButton teller;
    // End of variables declaration//GEN-END:variables

    public JButton getCustomerService() {
        return customerService;
    }

    public void setCustomerService(JButton customerService) {
        this.customerService = customerService;
    }

    public JButton getTeller() {
        return teller;
    }

    public void setTeller(JButton teller) {
        this.teller = teller;
    }
    
        public void addActionListener(ActionListener x) {
        bLogin.addActionListener(x);
        customerService.addActionListener(x);
        teller.addActionListener(x);
    }

    public JButton getbLogin() {
        return bLogin;
    }
    
    


    
}
