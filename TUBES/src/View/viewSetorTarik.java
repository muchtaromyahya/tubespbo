/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author YAHYA
 */
public class viewSetorTarik extends javax.swing.JFrame {

    /**
     * Creates new form viewSetorTarik
     */
    public viewSetorTarik() {
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

        pilihan = new javax.swing.JComboBox<>();
        jumlahUang = new javax.swing.JTextField();
        berita = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pilihan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "setoran", "tarikan" }));
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });
        getContentPane().add(pilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 90, 40));
        getContentPane().add(jumlahUang, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 360, 40));
        getContentPane().add(berita, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 360, 100));

        ok.setText("OK");
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 70, 40));

        batal.setText("Batal");
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/background/10.jpg"))); // NOI18N
        jLabel1.setText("background");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 941, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanActionPerformed

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
            java.util.logging.Logger.getLogger(viewSetorTarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewSetorTarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewSetorTarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewSetorTarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewSetorTarik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JTextField berita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jumlahUang;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox<String> pilihan;
    // End of variables declaration//GEN-END:variables
    public void addActionListener(ActionListener x) {
        ok.addActionListener(x);
        batal.addActionListener(x);
        pilihan.addActionListener(x);

        
    }

    public JButton getBatal() {
        return batal;
    }

    public void setBatal(JButton batal) {
        this.batal = batal;
    }

    public String getBerita() {
        return berita.getText();
    }

    public void setBerita(String berita) {
        this.berita.setText(berita);
    }

    public String getJumlahUang() {
        return jumlahUang.getText();
    }

    public void setJumlahUang(String jumlahUang) {
        this.jumlahUang.setText(jumlahUang);
    }

    public JButton getOk() {
        return ok;
    }

    public void setOk(JButton ok) {
        this.ok = ok;
    }

    public String getPilihan() {
        return pilihan.getItemAt(pilihan.getSelectedIndex());
    }
    

}
