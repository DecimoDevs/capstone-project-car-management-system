/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package automotiverentalsystem;

import automotiverentalsystem.booknowBtn.bmw;
import automotiverentalsystem.booknowBtn.chevrolet;
import automotiverentalsystem.booknowBtn.toyota;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author marlo
 */
public class carChoices extends javax.swing.JFrame {

    public static carChoices Instance;
    public JLabel lbl;
    public JLabel lbl1;
    public JLabel lbl2;
    public JLabel lbl3;
    
    public carChoices() {
        initComponents();
        
        Instance = this;
        lbl = jLabel8;
        lbl1 = jLabel9;
        lbl2 = jLabel10;
        lbl3 = jLabel7;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("CAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (28).jpg")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 160));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (86).png")); // NOI18N
        jLabel11.setText("4.7");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("BMW SEDAN");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel25.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (89).png")); // NOI18N
        jLabel25.setText("   AUTOMATIC");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, 20));

        jLabel22.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (88).png")); // NOI18N
        jLabel22.setText("   GASOLINE");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, 20));

        jLabel31.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (87).png")); // NOI18N
        jLabel31.setText("   4 SEATS");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 120, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 380, 180));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (26).jpg")); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 160));

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (86).png")); // NOI18N
        jLabel13.setText("4.4");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TOYOTA CAMRY");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel34.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (89).png")); // NOI18N
        jLabel34.setText("   AUTOMATIC");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, 20));

        jLabel37.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (88).png")); // NOI18N
        jLabel37.setText("   GASOLINE");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, 20));

        jLabel40.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (87).png")); // NOI18N
        jLabel40.setText("   4 SEATS");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 120, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 380, 180));

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (25).jpg")); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 160));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (86).png")); // NOI18N
        jLabel12.setText("4.8");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("HONDA CIVIC");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel33.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (89).png")); // NOI18N
        jLabel33.setText("   AUTOMATIC");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, 20));

        jLabel36.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (88).png")); // NOI18N
        jLabel36.setText("   GASOLINE");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, 20));

        jLabel39.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel39.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (87).png")); // NOI18N
        jLabel39.setText("   4 SEATS");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 120, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 380, 180));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (29).jpg")); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 160));

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (86).png")); // NOI18N
        jLabel14.setText("4.8");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CHEVROLET CRUZE");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel35.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (89).png")); // NOI18N
        jLabel35.setText("   AUTOMATIC");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, 20));

        jLabel38.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (88).png")); // NOI18N
        jLabel38.setText("   GASOLINE");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, 20));

        jLabel41.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (87).png")); // NOI18N
        jLabel41.setText("   4 SEATS");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 120, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 380, 180));

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BOOK NOW!");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 140, 30));

        jButton2.setBackground(new java.awt.Color(0, 255, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BOOK NOW!");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 140, 30));

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BOOK NOW!");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 140, 30));

        jButton4.setBackground(new java.awt.Color(0, 255, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BOOK NOW!");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 140, 30));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\icons8-green-circle-48.png")); // NOI18N
        jLabel7.setText("AVAILABLE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 240, 50));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\icons8-green-circle-48.png")); // NOI18N
        jLabel8.setText("AVAILABLE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 240, 50));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\icons8-green-circle-48.png")); // NOI18N
        jLabel9.setText("AVAILABLE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 240, 50));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\icons8-green-circle-48.png")); // NOI18N
        jLabel10.setText("AVAILABLE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 240, 50));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\Webp.net-resizeimage (67).png")); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        
        carMenu nJframe = new carMenu();
        nJframe.show();
        dispose ();

    }//GEN-LAST:event_jLabel26MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        addCarRent nJframe = new addCarRent ();
        nJframe.show();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        toyota nJframe = new toyota ();
        nJframe.show();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        bmw nJframe = new bmw ();
        nJframe.show();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        chevrolet nJframe = new chevrolet ();
        nJframe.show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(carChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carChoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
