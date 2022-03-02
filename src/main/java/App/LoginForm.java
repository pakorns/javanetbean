
package App;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pakorns 
 * หลักสูตรวิทยาการคอมพิวเตอร์ 
 * วันที่ 1 มกราคม 2565
 * วิชา การเขียนโปรแกรมเชิงวัตถุ
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }

    /**
     * ห้ามลบเมธอดต่อไปนี้เด็ดขาด
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLogin = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jUserName = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pakorns\\Pictures\\ICON-Programming\\java.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 280));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("User Name  :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setText("Password :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        jPanel2.add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jReset.setText("Reset");
        jPanel2.add(jReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));
        jPanel2.add(jUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, -1));
        jPanel2.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, -1));

        jLabel4.setBackground(new java.awt.Color(255, 204, 0));
        jLabel4.setFont(new java.awt.Font("TH Chakra Petch", 1, 48)); // NOI18N
        jLabel4.setText("Login form");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 10, 290, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(jButton1.getFont().deriveFont((float)15));
        jButton1.setText("Registor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 350, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// เมธอดที่ผู้ใช้สร้างขึ้นเองสามารถแก้ไขได้
    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        //ประกาศตัวแปรสำหรับรับค่าจากฟอร์ม
            String userName = this.jUserName.getText();
            String userPwd = this.jPassword.getText();
            if(userName.isBlank() && userPwd.isBlank()){
                JOptionPane.showMessageDialog(this,"กรุณาพิมพ์ชื่อผู้ใช้และรหัสผ่านด้วย");
                jUserName.setText(null);
                jPassword.setText(null);
                jUserName.requestFocus();
            }else{
            try {
            //เชื่อมฐานข้อมูล
            String URL = "jdbc:mysql://localhost:3306/db_example";
            String USER= "root";
            String PASSWORD = "pk123456";
            Connection conn = DriverManager.getConnection(URL,USER ,PASSWORD);     
           //สร้างสเตตเมนต์สำหรับคำสั่ง sql 
            String sql = "Select * from users where user_name ='"
                    +userName+"' and user_password='"+userPwd+"'";
            Statement stm = conn.createStatement();      
            ResultSet rs = stm.executeQuery(sql);
            if(rs.next()){    
           
               //แสดงหน้าจอหลัก 
               MainFrame mf = new MainFrame();
               mf.show();
                this.dispose(); //ปิดหน้าล็อกอิน
                }else {          
                JOptionPane.showMessageDialog(this,
                        "กรุณาพิมพ์ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
                jUserName.setText(null);
                jPassword.setText(null);
                jUserName.requestFocus();
            }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,
                       "ไม่สามารถเปิดฐานข้อมูลได้","แจ้งเตือน", 
                       JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       NewUser nf=new NewUser();
       nf.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                
                                new LoginForm().setVisible(true);
                            }
                        });      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jReset;
    private javax.swing.JTextField jUserName;
    // End of variables declaration//GEN-END:variables
}
