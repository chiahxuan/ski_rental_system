/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ski.rental.system;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author chiahxuan
 */
public class Login extends javax.swing.JFrame {
private static enum Userrole {admin, manager, incorrect};
    public static Userrole userrole;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //Image Auto Scale 
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Login1.jpeg")));
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        
        ImageLabel.setIcon(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagePanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JPasswordField();
        lblLoginPage = new javax.swing.JLabel();
        lblUsername3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        lblLoginPage1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagePanel.setBackground(new java.awt.Color(255, 255, 255));
        ImagePanel.setForeground(new java.awt.Color(255, 255, 255));
        ImagePanel.setLayout(null);

        ImageLabel.setBackground(new java.awt.Color(255, 255, 255));
        ImagePanel.add(ImageLabel);
        ImageLabel.setBounds(0, 0, 410, 470);

        getContentPane().add(ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 410, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(234, 63, 63));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 140, 50));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword.setText("forgot your password?");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        UsernameTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        UsernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        PasswordTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, -1));

        lblLoginPage.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblLoginPage.setForeground(new java.awt.Color(2, 51, 71));
        lblLoginPage.setText("Ski Inventory System");
        jPanel1.add(lblLoginPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lblUsername3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername3.setForeground(new java.awt.Color(204, 204, 204));
        lblUsername3.setText("Username: ");
        jPanel1.add(lblUsername3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 20, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 20, 20));

        lblPassword1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword1.setText("Password: ");
        jPanel1.add(lblPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        lblLoginPage1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblLoginPage1.setForeground(new java.awt.Color(1, 51, 71));
        lblLoginPage1.setText("Login ");
        jPanel1.add(lblLoginPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTxtActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = UsernameTxt.getText();
        String password = PasswordTxt.getText();
        Loginverification test = new Loginverification();
        Account set = new Account();
        
      if(true)
      {
           
//          this.setVisible(false);
//        new admin_dashboard().setVisible(true);
      } else  
      {
          JLabel label = new JLabel("wrong username or Password.");
                    JOptionPane.showMessageDialog(null,label,"Error",JOptionPane.ERROR_MESSAGE);
      }
      
      switch(test.verifylogin(username, password)) 
        {
        case admin:
            
            set.setUsername(username);
            
            this.setVisible(false);
        new admin_dashboard().setVisible(true);
            break;
        
        case manager:
            
            set.setUsername(username);
            
            this.setVisible(false);
        new pm_dashboard().setVisible(true);
            break;
            
        case incorrect:
            JLabel label = new JLabel("wrong username or Password.");
                    JOptionPane.showMessageDialog(null,label,"Error",JOptionPane.ERROR_MESSAGE);
            break;
      
        }
    
      
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JTextField UsernameTxt;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLoginPage;
    private javax.swing.JLabel lblLoginPage1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUsername3;
    // End of variables declaration//GEN-END:variables
}
