/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JComboBox<>();
        tkj = new javax.swing.JRadioButton();
        rpl = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIODATA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 0, 140, 50);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 220, 90, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 60, 90, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 100, 90, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 140, 90, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jurusan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 180, 90, 20);

        Alamat.setBackground(new java.awt.Color(51, 51, 51));
        Alamat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Alamat.setForeground(new java.awt.Color(255, 255, 255));
        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat);
        Alamat.setBounds(170, 220, 150, 30);

        Absen.setBackground(new java.awt.Color(51, 51, 51));
        Absen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Absen.setForeground(new java.awt.Color(255, 255, 255));
        Absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenActionPerformed(evt);
            }
        });
        getContentPane().add(Absen);
        Absen.setBounds(170, 100, 150, 30);

        Nama.setBackground(new java.awt.Color(51, 51, 51));
        Nama.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Nama.setForeground(new java.awt.Color(255, 255, 255));
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(170, 60, 150, 30);

        Kelas.setBackground(new java.awt.Color(51, 51, 51));
        Kelas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Kelas.setForeground(new java.awt.Color(255, 255, 255));
        Kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7" }));
        getContentPane().add(Kelas);
        Kelas.setBounds(170, 140, 150, 30);

        tkj.setBackground(new java.awt.Color(51, 51, 51));
        tkj.setForeground(new java.awt.Color(255, 255, 255));
        tkj.setText("TKJ");
        tkj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkjActionPerformed(evt);
            }
        });
        getContentPane().add(tkj);
        tkj.setBounds(250, 180, 60, 28);

        rpl.setBackground(new java.awt.Color(51, 51, 51));
        rpl.setForeground(new java.awt.Color(255, 255, 255));
        rpl.setText("RPL");
        rpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rplActionPerformed(evt);
            }
        });
        getContentPane().add(rpl);
        rpl.setBounds(180, 180, 60, 28);

        jPanel1.setBackground(new java.awt.Color(50, 0, 0));

        Exit.setBackground(new java.awt.Color(51, 51, 51));
        Exit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Print.setBackground(new java.awt.Color(51, 51, 51));
        Print.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("PRINT");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(Print)
                .addGap(69, 69, 69)
                .addComponent(Exit)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit)
                    .addComponent(Print))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 340);

        setBounds(0, 0, 416, 376);
    }// </editor-fold>//GEN-END:initComponents

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void AbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbsenActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void tkjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkjActionPerformed

    private void rplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rplActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        String nama = Nama.getText();
        String absen = Absen.getText();
        String kelas = Kelas.getSelectedItem().toString();
        String jurusan = null;
        String alamat = Alamat.getText();
        
        if(rpl.isSelected())
            jurusan="RPL";
        else if(tkj.isSelected())
            jurusan="TKJ";
        
        if(Kelas.getSelectedItem()=="X RPL 1"){
        }
        if(Kelas.getSelectedItem()=="X RPL 2"){
        }
        if(Kelas.getSelectedItem()=="X RPL 3"){
        }
        if(Kelas.getSelectedItem()=="X RPL 4"){
        }
        if(Kelas.getSelectedItem()=="X RPL 5"){
        }
        if(Kelas.getSelectedItem()=="X RPL 6"){
        }
        if(Kelas.getSelectedItem()=="X RPL 7"){
        }
        
        new Biodata2(nama,absen,kelas,jurusan,alamat).setVisible(true);
    }//GEN-LAST:event_PrintActionPerformed

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
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Print;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rpl;
    private javax.swing.JRadioButton tkj;
    // End of variables declaration//GEN-END:variables
}
