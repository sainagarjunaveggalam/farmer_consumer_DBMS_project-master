/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer_consumer;

/**
 *
 * @author admin
 */
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    private final dbConnect db = new dbConnect();
    public Registration() {
        try {
            db.connect();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning", JOptionPane.WARNING_MESSAGE);
        }
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

        youAre = new javax.swing.ButtonGroup();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registrationBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        streetF = new javax.swing.JTextField();
        radioCustomer = new javax.swing.JRadioButton();
        radioFarmer = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cityF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        stateF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        zipCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        registrationBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrationBtn.setText("Register");
        registrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setText("Registration");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setText("Welcome to E-Market !");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel5.setText("Fresh Farm Products One Click Away");

        jLabel6.setText("Phone Number");

        jLabel7.setText("Address");

        youAre.add(radioCustomer);
        radioCustomer.setText("Customer");

        youAre.add(radioFarmer);
        radioFarmer.setText("Farmer");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("You are a:");

        loginBtn.setText("Go to Login Page");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Street");

        jLabel10.setText("City");

        jLabel11.setText("State");

        jLabel12.setText("ZipCode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(89, 89, 89))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(349, 349, 349))))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(radioCustomer)
                                .addGap(30, 30, 30)
                                .addComponent(radioFarmer))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(registrationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cityF)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(username)
                            .addComponent(phoneNo)
                            .addComponent(streetF)
                            .addComponent(password)
                            .addComponent(stateF)
                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioCustomer)
                    .addComponent(radioFarmer))
                .addGap(18, 18, 18)
                .addComponent(registrationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationBtnActionPerformed
        // TODO add your handling code here:
        String user = this.username.getText();
        try{
            if(user.isEmpty())
                throw new Exception("Username cannot be Empty!");
            db.prestmt = db.con.prepareStatement("select uid from users where username=?");
            db.prestmt.setString(1,user);
            db.rs = db.prestmt.executeQuery();
            if(db.rs.next()){
                JOptionPane.showMessageDialog(this, "Username already exists !");
            }
            else{
                String pass = this.password.getText();
                if(pass.isEmpty())
                    throw new Exception("Password cannot be Empty!");
                String userType = null;
                String phone = this.phoneNo.getText();
                if(phone.length()!=10)
                    throw new Exception("Phone number should be 10 digits!");
                String street = this.streetF.getText();
                String city = this.cityF.getText();
                String state = this.stateF.getText();
                String zipc = this.zipCode.getText();
                if(zipc.length()!=6)
                    throw new Exception("Zip Code should be 6 digits!");
                int zip = Integer.parseInt(zipc);
                if(radioFarmer.isSelected())
                    userType = "farmer";
                else if(radioCustomer.isSelected())
                    userType = "customer";
                else
                    throw new Exception("Select User type.");
                int lastid;
                db.prestmt = db.con.prepareStatement("insert into users(username,password,usertype,phone) values(?,?,?,?)");
                db.prestmt.setString(1, user);
                db.prestmt.setString(2, Crypto.getMD5(pass));
                db.prestmt.setString(3, userType);
                db.prestmt.setString(4, phone);
                db.prestmt.executeUpdate();
                db.rs = db.stmt.executeQuery("select last_insert_id() as last_id from users");
                if(db.rs.next()){
                    lastid = Integer.parseInt(db.rs.getString("last_id"));
                    db.prestmt = db.con.prepareStatement("insert into address values(?,?,?,?,?)");
                    db.prestmt.setString(1, street);
                    db.prestmt.setString(2, city);
                    db.prestmt.setString(3, state);
                    db.prestmt.setInt(4, zip);
                    db.prestmt.setInt(5, lastid);
                    db.prestmt.executeUpdate();

                    db.prestmt = db.con.prepareStatement("insert into "+userType+"(uid) values(?)");
                    db.prestmt.setInt(1, lastid);
                    db.prestmt.executeUpdate();
                }
                JOptionPane.showMessageDialog(this, "Account registerd.");
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Zip Code should be Integers.","Warning", JOptionPane.WARNING_MESSAGE);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_registrationBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        db.close();
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioFarmer;
    private javax.swing.JButton registrationBtn;
    private javax.swing.JTextField stateF;
    private javax.swing.JTextField streetF;
    private javax.swing.JTextField username;
    private javax.swing.ButtonGroup youAre;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}
