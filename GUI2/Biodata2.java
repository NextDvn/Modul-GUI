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
public class Biodata2 extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Biodata2(String nama, String absen, String kelas, String jurusan, String alamat) {
        initComponents();
        Hasil1.setText(nama);
        Hasil2.setText(absen);
        Hasil3.setText(kelas);
        Hasil4.setText(jurusan);
        Hasil5.setText(alamat);
        
    }

    private Biodata2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Hasil5 = new javax.swing.JTextField();
        Hasil2 = new javax.swing.JTextField();
        Hasil1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Hasil3 = new javax.swing.JTextField();
        Hasil4 = new javax.swing.JTextField();
        Alamat1 = new javax.swing.JTextField();
        Alamat2 = new javax.swing.JTextField();
        Absen1 = new javax.swing.JTextField();
        Nama1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 220, 90, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 60, 90, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 100, 90, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Kelas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 140, 90, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Jurusan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 180, 90, 20);

        Hasil5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Hasil5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hasil5ActionPerformed(evt);
            }
        });
        getContentPane().add(Hasil5);
        Hasil5.setBounds(170, 220, 150, 30);

        Hasil2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Hasil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hasil2ActionPerformed(evt);
            }
        });
        getContentPane().add(Hasil2);
        Hasil2.setBounds(170, 100, 150, 30);

        Hasil1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Hasil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hasil1ActionPerformed(evt);
            }
        });
        getContentPane().add(Hasil1);
        Hasil1.setBounds(170, 60, 150, 30);

        jPanel1.setBackground(new java.awt.Color(50, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HASIL BIODATA");

        Hasil3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Hasil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hasil3ActionPerformed(evt);
            }
        });

        Hasil4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Hasil4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hasil4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hasil3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hasil4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(Hasil3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Hasil4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        Alamat1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Alamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alamat1ActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat1);
        Alamat1.setBounds(170, 220, 150, 30);

        Alamat2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Alamat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alamat2ActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat2);
        Alamat2.setBounds(170, 220, 150, 30);

        Absen1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Absen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Absen1ActionPerformed(evt);
            }
        });
        getContentPane().add(Absen1);
        Absen1.setBounds(170, 100, 150, 30);

        Nama1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama1ActionPerformed(evt);
            }
        });
        getContentPane().add(Nama1);
        Nama1.setBounds(170, 60, 150, 30);

        jPanel2.setBackground(new java.awt.Color(50, 0, 0));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HASIL BIODATA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 300);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void Alamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alamat1ActionPerformed

    private void Alamat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alamat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alamat2ActionPerformed

    private void Absen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Absen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Absen1ActionPerformed

    private void Nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama1ActionPerformed

    private void Hasil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hasil2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hasil2ActionPerformed

    private void Hasil5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hasil5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hasil5ActionPerformed

    private void Hasil4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hasil4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hasil4ActionPerformed

    private void Hasil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hasil3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hasil3ActionPerformed

    private void Hasil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hasil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hasil1ActionPerformed

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
            java.util.logging.Logger.getLogger(Biodata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biodata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biodata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biodata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biodata2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen1;
    private javax.swing.JTextField Alamat1;
    private javax.swing.JTextField Alamat2;
    private javax.swing.JTextField Hasil1;
    private javax.swing.JTextField Hasil2;
    private javax.swing.JTextField Hasil3;
    private javax.swing.JTextField Hasil4;
    private javax.swing.JTextField Hasil5;
    private javax.swing.JTextField Nama1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
