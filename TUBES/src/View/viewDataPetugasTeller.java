/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author YAHYA
 */
public class viewDataPetugasTeller extends javax.swing.JFrame {
    public Connection cn;
    public Statement st;
    /**
     * Creates new form viewDataPetugasCS
     */
    
    public viewDataPetugasTeller() {
        initComponents();
        try{
            cn = DriverManager.getConnection("jdbc://localhost:3306/jdbc:mysql://localhost:3306/teller?zeroDateTimeBehavior=convertToNull","root","");
            st=cn.createStatement();
            JOptionPane.showMessageDialog(null, "Connected");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Not Connected");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idPetugas = new javax.swing.JTextField();
        namaPetugas = new javax.swing.JTextField();
        alamatPetugas = new javax.swing.JTextField();
        tanggalLahir = new javax.swing.JTextField();
        lamaBekerja = new javax.swing.JTextField();
        jenisService = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(idPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 340, 30));
        getContentPane().add(namaPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 340, 30));
        getContentPane().add(alamatPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 340, 30));
        getContentPane().add(tanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 340, 30));
        getContentPane().add(lamaBekerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 340, 30));
        getContentPane().add(jenisService, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 340, 30));

        batal.setText("Batal");
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, 100, 40));

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/background/18.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 964, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

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
            java.util.logging.Logger.getLogger(viewDataPetugasTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDataPetugasTeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatPetugas;
    private javax.swing.JButton batal;
    private javax.swing.JTextField idPetugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jenisService;
    private javax.swing.JTextField lamaBekerja;
    private javax.swing.JTextField namaPetugas;
    private javax.swing.JButton ok;
    private javax.swing.JTextField tanggalLahir;
    // End of variables declaration//GEN-END:variables
}
