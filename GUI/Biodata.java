/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author grand
 */
public class Biodata extends javax.swing.JFrame {

    /**
     * Creates new form Biodata
     */
    public Biodata() {
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

        rbjurusan = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        TKJ = new javax.swing.JRadioButton();
        RPL = new javax.swing.JRadioButton();
        pro = new javax.swing.JCheckBox();
        ani = new javax.swing.JCheckBox();
        tek = new javax.swing.JCheckBox();
        des = new javax.swing.JCheckBox();
        exit = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Hasil");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 210, 120, 16);

        jLabel2.setText("BIODATA SISWA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 10, 120, 16);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 120, 16);

        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 80, 120, 16);

        jLabel5.setText("Jurusan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 110, 120, 16);

        jLabel6.setText("Hobi");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 140, 120, 16);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 210, 240, 83);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(80, 40, 240, 30);

        absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absenActionPerformed(evt);
            }
        });
        getContentPane().add(absen);
        absen.setBounds(80, 70, 240, 30);

        rbjurusan.add(TKJ);
        TKJ.setText("TKJ");
        TKJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKJActionPerformed(evt);
            }
        });
        getContentPane().add(TKJ);
        TKJ.setBounds(160, 100, 70, 28);

        rbjurusan.add(RPL);
        RPL.setText("RPL");
        RPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPLActionPerformed(evt);
            }
        });
        getContentPane().add(RPL);
        RPL.setBounds(80, 100, 70, 28);

        pro.setText("Programming");
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });
        getContentPane().add(pro);
        pro.setBounds(80, 130, 120, 24);

        ani.setText("Animator");
        ani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniActionPerformed(evt);
            }
        });
        getContentPane().add(ani);
        ani.setBounds(80, 150, 80, 24);

        tek.setText("Teknisi");
        tek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekActionPerformed(evt);
            }
        });
        getContentPane().add(tek);
        tek.setBounds(200, 130, 69, 24);

        des.setText("Designer");
        des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desActionPerformed(evt);
            }
        });
        getContentPane().add(des);
        des.setBounds(200, 150, 79, 24);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(240, 170, 51, 32);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(80, 170, 70, 32);

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus);
        hapus.setBounds(160, 170, 66, 32);

        setSize(new java.awt.Dimension(359, 352));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void absenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absenActionPerformed

    private void TKJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TKJActionPerformed

    private void RPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RPLActionPerformed

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String Nama=nama.getText();
        String Absen=absen.getText();
        String Jurusan;
        String Hobi="";
        
        if(RPL.isSelected())
            Jurusan = "RPL";
        else if(TKJ.isSelected())
            Jurusan = "TKJ";
        else
            Jurusan = " ";
        
        if(pro.isSelected())
            Hobi+=pro.getText()+", ";
        if(ani.isSelected())
            Hobi+=ani.getText()+", ";
        if(tek.isSelected())
            Hobi+=tek.getText()+", ";
        if(des.isSelected())
            Hobi+=des.getText()+", ";
        
        hasil.setText("Nama Siswa: "+Nama+"\nAbsen: "+Absen+"\nJurusan: "+Jurusan+"\nHobi: "+Hobi);
    }//GEN-LAST:event_submitActionPerformed

    private void tekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tekActionPerformed

    private void aniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniActionPerformed

    private void desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        hasil.setText("");
        nama.setText("");
        absen.setText("");
        rbjurusan.clearSelection();
        pro.setSelected(false);
        ani.setSelected(false);
        tek.setSelected(false);
        des.setSelected(false);
    }//GEN-LAST:event_hapusActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RPL;
    private javax.swing.JRadioButton TKJ;
    private javax.swing.JTextField absen;
    private javax.swing.JCheckBox ani;
    private javax.swing.JCheckBox des;
    private javax.swing.JButton exit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JCheckBox pro;
    private javax.swing.ButtonGroup rbjurusan;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox tek;
    // End of variables declaration//GEN-END:variables
}
