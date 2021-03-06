/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atmmachine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Fast extends javax.swing.JFrame {

    /**
     * Creates new form Fast
     */
    public Fast() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        f1 = new javax.swing.JButton();
        f2 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        f6 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        accn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("Account Number:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        f1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        f1.setText("Rs 10,000");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        f2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        f2.setText("Rs 15,000");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        f3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        f3.setText("Rs 20,000");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        f5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        f5.setText("Rs 30,000");
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        f4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        f4.setText("Rs 25,000");
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        f6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        f6.setText("Rs 35,000");
        f6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f1)
                    .addComponent(f2)
                    .addComponent(f3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f4)
                    .addComponent(f5)
                    .addComponent(f6))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(f4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(f5)
                        .addGap(65, 65, 65)
                        .addComponent(f6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(f1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(f2)
                        .addGap(65, 65, 65)
                        .addComponent(f3)))
                .addContainerGap())
        );

        back.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atmmachine/icons8-back-50.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        accn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        accn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(back)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(accn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm_project";
	    String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            String bal="";
            Integer amm = 15000;           
            try{
                
                String query = "SELECT balance from account where accno=?";
                PreparedStatement past = con.prepareStatement(query);
                past.setString(1, accn.getText());
                ResultSet rs = past.executeQuery();
                
                if(rs.next()){
                    bal = rs.getString("balance");
                }
                
                Integer ba = Integer.valueOf(bal);
                
                if(ba >= amm){
                    
                    int total = ba - amm;
                                        
                    try{
                        
                        String sql = "UPDATE `account` SET balance=? WHERE accno=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, total);
                        ps.setString(2, accn.getText());
                        
                        ps.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null,"Ammount has been withdrawl: RS "+amm);
                        
                        new Menu().setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm_project";
	    String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            String bal="";
            Integer amm = 20000;           
            try{
                
                String query = "SELECT balance from account where accno=?";
                PreparedStatement past = con.prepareStatement(query);
                past.setString(1, accn.getText());
                ResultSet rs = past.executeQuery();
                
                if(rs.next()){
                    bal = rs.getString("balance");
                }
                
                Integer ba = Integer.valueOf(bal);
                
                if(ba >= amm){
                    
                    int total = ba - amm;
                                        
                    try{
                        
                        String sql = "UPDATE `account` SET balance=? WHERE accno=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, total);
                        ps.setString(2, accn.getText());
                        
                        ps.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null,"Ammount has been withdrawl: RS "+amm);
                        
                        new Menu().setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_f3ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm_project";
	    String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            String bal="";
            Integer amm = 30000;           
            try{
                
                String query = "SELECT balance from account where accno=?";
                PreparedStatement past = con.prepareStatement(query);
                past.setString(1, accn.getText());
                ResultSet rs = past.executeQuery();
                
                if(rs.next()){
                    bal = rs.getString("balance");
                }
                
                Integer ba = Integer.valueOf(bal);
                
                if(ba >= amm){
                    
                    int total = ba - amm;
                                        
                    try{
                        
                        String sql = "UPDATE `account` SET balance=? WHERE accno=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, total);
                        ps.setString(2, accn.getText());
                        
                        ps.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null,"Ammount has been withdrawl: RS "+amm);
                        
                        new Menu().setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_f5ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm_project";
	    String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            String bal="";
            Integer amm = 10000;           
            try{
                
                String query = "SELECT balance from account where accno=?";
                PreparedStatement past = con.prepareStatement(query);
                past.setString(1, accn.getText());
                ResultSet rs = past.executeQuery();
                
                if(rs.next()){
                    bal = rs.getString("balance");
                }
                
                Integer ba = Integer.valueOf(bal);
                
                if(ba >= amm){
                    
                    int total = ba - amm;
                                        
                    try{
                        
                        String sql = "UPDATE `account` SET balance=? WHERE accno=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, total);
                        ps.setString(2, accn.getText());
                        
                        ps.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null,"Ammount has been withdrawl: RS "+amm);
                        
                        new Menu().setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_f1ActionPerformed

    private void accnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accnActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm_project";
	    String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            String bal="";
            Integer amm = 25000;           
            try{
                
                String query = "SELECT balance from account where accno=?";
                PreparedStatement past = con.prepareStatement(query);
                past.setString(1, accn.getText());
                ResultSet rs = past.executeQuery();
                
                if(rs.next()){
                    bal = rs.getString("balance");
                }
                
                Integer ba = Integer.valueOf(bal);
                
                if(ba >= amm){
                    
                    int total = ba - amm;
                                        
                    try{
                        
                        String sql = "UPDATE `account` SET balance=? WHERE accno=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, total);
                        ps.setString(2, accn.getText());
                        
                        ps.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null,"Ammount has been withdrawl: RS "+amm);
                        
                        new Menu().setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_f4ActionPerformed

    private void f6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm_project";
	    String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            String bal="";
            Integer amm = 35000;           
            try{
                
                String query = "SELECT balance from account where accno=?";
                PreparedStatement past = con.prepareStatement(query);
                past.setString(1, accn.getText());
                ResultSet rs = past.executeQuery();
                
                if(rs.next()){
                    bal = rs.getString("balance");
                }
                
                Integer ba = Integer.valueOf(bal);
                
                if(ba >= amm){
                    
                    int total = ba - amm;
                                        
                    try{
                        
                        String sql = "UPDATE `account` SET balance=? WHERE accno=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, total);
                        ps.setString(2, accn.getText());
                        
                        ps.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null,"Ammount has been withdrawl: RS "+amm);
                        
                        new Menu().setVisible(true);
                        this.dispose();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_f6ActionPerformed

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
            java.util.logging.Logger.getLogger(Fast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accn;
    private javax.swing.JButton back;
    private javax.swing.JButton f1;
    private javax.swing.JButton f2;
    private javax.swing.JButton f3;
    private javax.swing.JButton f4;
    private javax.swing.JButton f5;
    private javax.swing.JButton f6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
