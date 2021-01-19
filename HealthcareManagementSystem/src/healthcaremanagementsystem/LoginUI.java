package healthcaremanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginUI extends javax.swing.JFrame {
    public LoginUI() {
        /* load credentials from DB; if possible */
        credentials = new Credentials();
        credentials.loadData();
        
        /* Init UI components */
        initComponents();
        
        /* Set close behavoir */
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUser = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(238, 238, 238));
        setLocation(new java.awt.Point(100, 100));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(280, 2147483647));
        setMinimumSize(new java.awt.Dimension(280, 230));
        setPreferredSize(new java.awt.Dimension(280, 230));

        tfUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfUser.setForeground(new java.awt.Color(108, 110, 114));
        tfUser.setText("Username");
        tfUser.setPreferredSize(new java.awt.Dimension(120, 20));
        tfUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUserFocusLost(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(80, 160, 90));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);
        loginButton.setPreferredSize(new java.awt.Dimension(70, 24));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 110, 114));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ASU");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 110, 114));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Health Management");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(108, 110, 114));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("System - login");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthcaremanagementsystem/login_image.png"))); // NOI18N

        tfPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfPass.setForeground(new java.awt.Color(108, 110, 114));
        tfPass.setText("00000000");
        tfPass.setPreferredSize(new java.awt.Dimension(120, 21));
        tfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPassFocusLost(evt);
            }
        });
        tfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUser, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusGained
        if (tfUser.getText().equals("Username")) {
            tfUser.setText("");
        }
    }//GEN-LAST:event_tfUserFocusGained
    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        login();
    }//GEN-LAST:event_loginButtonMouseClicked
    private void tfUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusLost
        if (tfUser.getText().equals("")) {
            tfUser.setText("Username");
        }
    }//GEN-LAST:event_tfUserFocusLost
    private void tfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPassFocusGained
        if (tfPass.getText().equals("00000000")) {
            tfPass.setText("");
        }
    }//GEN-LAST:event_tfPassFocusGained
    private void tfPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPassFocusLost
        if (tfPass.getText().equals("")) {
            tfPass.setText("00000000");
        }
    }//GEN-LAST:event_tfPassFocusLost
    private void tfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPassKeyPressed
        Character key = evt.getKeyChar();
        boolean enterIsPressed = key.compareTo('\n') == 0;
        if (enterIsPressed) {
            loginButton.requestFocus();
            login();
        }
    }//GEN-LAST:event_tfPassKeyPressed
    
    /* Check login credentials */
    private void login() {
        /* IF CORRECT */
        if (credentials.check(tfUser.getText(), tfPass.getText())) {
            System.out.println("Login Status: Successful login.");
            HealthcareManagementSystem.showManagementSystem();  // open UI
            exit();                                             // exit current
        } else { /* IF WRONG */
            System.out.println("Login Status: Incorrect username or password!");
            JOptionPane.showMessageDialog(null,
                                          "Incorrect username or password",
                                          "Login Error",
                                          JOptionPane.ERROR_MESSAGE);
            tfPass.setText("");
            tfPass.requestFocus();
        }
    }
    
    /* Exit function */
    private void exit() {
        super.setVisible(false);
        super.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables

    /* Parameters */
    Credentials credentials;
}
