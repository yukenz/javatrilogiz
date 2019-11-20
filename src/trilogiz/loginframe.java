/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trilogiz;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane; 

/**
 *
 * @author ryzen
 */
public class loginframe extends javax.swing.JFrame {

    /**
     * Creates new form Writedata
     */
    public loginframe() {
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

        PanelIconLogin = new javax.swing.JPanel();
        LoginText = new javax.swing.JLabel();
        IconKontak = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        LabelUsername = new javax.swing.JLabel();
        LabelLogin = new javax.swing.JLabel();
        LabelPass = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        password_input = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN SETTER");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIconLogin.setBackground(new java.awt.Color(6, 82, 221));

        LoginText.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        LoginText.setForeground(new java.awt.Color(255, 255, 255));
        LoginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginText.setText("LOGIN");

        IconKontak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconKontak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trilogiz/icon/icons8_user_127px.png"))); // NOI18N

        javax.swing.GroupLayout PanelIconLoginLayout = new javax.swing.GroupLayout(PanelIconLogin);
        PanelIconLogin.setLayout(PanelIconLoginLayout);
        PanelIconLoginLayout.setHorizontalGroup(
            PanelIconLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIconLoginLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(PanelIconLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(IconKontak)
                    .addComponent(LoginText))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        PanelIconLoginLayout.setVerticalGroup(
            PanelIconLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIconLoginLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(IconKontak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginText)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        getContentPane().add(PanelIconLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 470));

        PanelLogin.setBackground(new java.awt.Color(255, 255, 255));

        LabelUsername.setFont(new java.awt.Font("NewsGoth BT", 0, 14)); // NOI18N
        LabelUsername.setForeground(new java.awt.Color(102, 102, 102));
        LabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelUsername.setText("USERNAME :");

        LabelLogin.setBackground(new java.awt.Color(102, 102, 102));
        LabelLogin.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        LabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogin.setText("LOGIN");
        LabelLogin.setOpaque(true);
        LabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelLoginMouseExited(evt);
            }
        });

        LabelPass.setFont(new java.awt.Font("NewsGoth BT", 0, 14)); // NOI18N
        LabelPass.setForeground(new java.awt.Color(102, 102, 102));
        LabelPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelPass.setText("PASSWORD:");

        username_input.setBackground(new java.awt.Color(255, 255, 255));
        username_input.setForeground(new java.awt.Color(0, 0, 0));
        username_input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        username_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_inputActionPerformed(evt);
            }
        });
        username_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                username_inputKeyPressed(evt);
            }
        });

        password_input.setBackground(new java.awt.Color(255, 255, 255));
        password_input.setForeground(new java.awt.Color(0, 0, 0));
        password_input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        password_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_inputKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPass)
                    .addComponent(LabelUsername)
                    .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(username_input)
                        .addComponent(password_input, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(LabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(LabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 370, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void username_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_inputActionPerformed

    private void LabelLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLoginMouseEntered
        // TODO add your handling code here:
        LabelLogin.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_LabelLoginMouseEntered

    private void LabelLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLoginMouseExited
        // TODO add your handling code here:
        LabelLogin.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_LabelLoginMouseExited

    private void LabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLoginMouseClicked
        // TODO add your handling code here:
        //read_data readbarang = new read_data(new String[]{"id","username","password","nama"},new String[]{"string","string","string","string"},"user");
        //readbarang.read_data();
        read_data loginstatus = new read_data(null,null,null);
        int statusloginnya = loginstatus.statuslogin(username_input.getText(), password_input.getText());
        //1.setter 2.operator 0.gatauanjing
        if(statusloginnya == 1){
            //if(Trilogiz.job == 1){
            JOptionPane.showMessageDialog(null, "Login Berhasil, hai setter");
            Setter setter= new Setter();
            setter.setVisible(true);
            /*}else if(Trilogiz.job == 2){
            JOptionPane.showMessageDialog(null, "Login Berhasil, hai operator");
            }else{
            JOptionPane.showMessageDialog(null, "Login Berhasil, Lu siapa anjing");
            }*/
            dispose();
        }else if(statusloginnya == 2){
            JOptionPane.showMessageDialog(null, "jangan kosongi username maupun password");
        }else{
            JOptionPane.showMessageDialog(null, "Username atau Password salah");
        }
    }//GEN-LAST:event_LabelLoginMouseClicked

    private void password_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_inputKeyPressed
        // TODO add your handling code here:
                if (evt.getKeyCode()==KeyEvent.VK_ENTER){
                    System.out.println("Enter Press detected in login");
                    LabelLoginMouseClicked(null);
                }
    }//GEN-LAST:event_password_inputKeyPressed

    private void username_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_inputKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
                    System.out.println("Enter Press detected in login");
                    LabelLoginMouseClicked(null);
         }
    }//GEN-LAST:event_username_inputKeyPressed

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
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconKontak;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JLabel LoginText;
    private javax.swing.JPanel PanelIconLogin;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JTextField password_input;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}