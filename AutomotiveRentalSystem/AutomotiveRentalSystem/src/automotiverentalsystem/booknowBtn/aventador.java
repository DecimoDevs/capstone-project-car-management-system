/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package automotiverentalsystem.booknowBtn;

import automotiverentalsystem.addCarRent;
import automotiverentalsystem.carrentPane;
import automotiverentalsystem.sportscarChoices;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;


/**
 *
 * @author marlo
 */
public class aventador extends javax.swing.JFrame {

   private static final String username = "root";
    private static final String password = "admin";
    private static final String dataConn = "jdbc:mysql://localhost:3306/carrentdb";
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i , id, deleteItem;
    
    public aventador() {
        initComponents();
    }
    
    public void updateDb(){
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("select * from carrentdb");
        
        rs = pst.executeQuery();
        ResultSetMetaData stData = rs.getMetaData();
        
        q = stData.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)carrentPane.Instance.tbl.getModel();
        RecordTable.setRowCount(0);
        
        while(rs.next()){
            Vector columnData = new Vector();
            
            for (i = 1;i <= q; i++)
            {
                columnData.add(rs.getString("FIRSTNAME"));
                columnData.add(rs.getString("LASTNAME"));
                columnData.add(rs.getString("PURCHASEORDER"));
                columnData.add(rs.getString("RENTDATE"));
                columnData.add(rs.getString("CARMODEL"));
                columnData.add(rs.getString("CARNO"));
            }
            RecordTable.addRow(columnData);
        }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        {
                
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

        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        das = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        returnsubmitBtn = new javax.swing.JButton();
        cn = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        po = new javax.swing.JTextField();
        rd = new javax.swing.JTextField();
        cm = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CAR DETAILS");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CUSTOMER INFORMATION");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        das.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        das.setForeground(new java.awt.Color(255, 255, 255));
        das.setText("RENT DATE:");
        jPanel3.add(das, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CAR NO:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LAST NAME:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID NO:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FIRST NAME:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CAR MODEL:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        returnsubmitBtn.setBackground(new java.awt.Color(0, 255, 51));
        returnsubmitBtn.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        returnsubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnsubmitBtn.setText("SUBMIT");
        returnsubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnsubmitBtnActionPerformed(evt);
            }
        });
        jPanel3.add(returnsubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 170, -1));
        jPanel3.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 190, -1));
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, -1));
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 190, -1));
        jPanel3.add(po, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, -1));
        jPanel3.add(rd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 190, -1));
        jPanel3.add(cm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 190, -1));

        jLabel17.setBackground(new java.awt.Color(255, 204, 0));
        jLabel17.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setText("CAR RENT");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnsubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnsubmitBtnActionPerformed
        // TODO add your handling code here

        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst = sqlConn.prepareStatement("insert into carrentdb (FIRSTNAME, LASTNAME, PURCHASEORDER, RENTDATE, CARMODEL, CARNO) value(?,?,?,?,?,?)");
        
        pst. setString(1, fn.getText());
        pst. setString(2, ln.getText());
        pst. setString(3, po.getText());
        pst. setString(4, rd.getText());
        pst. setString(5, cm.getText());
        pst. setString(6, cn.getText());
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog (null, "Car Rent Successfull");
        dispose();
        
        updateDb();
          }
          
          catch (ClassNotFoundException ex){
              java.util.logging.Logger.getLogger(addCarRent.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
          }
          catch (SQLException ex){
              java.util.logging.Logger.getLogger(addCarRent.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        
          }

        sportscarChoices.Instance.lbl1.setText("NOT AVAILABLE");
        sportscarChoices.Instance.lbl1.setIcon(new javax.swing.ImageIcon("C:\\Users\\marlo\\Downloads\\icons8-red-circle-48.png"));
    }//GEN-LAST:event_returnsubmitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(aventador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aventador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aventador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aventador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aventador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cm;
    private javax.swing.JTextField cn;
    private javax.swing.JLabel das;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField po;
    private javax.swing.JTextField rd;
    private javax.swing.JButton returnsubmitBtn;
    // End of variables declaration//GEN-END:variables
}
