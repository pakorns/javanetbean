
package App;

import com.mysql.cj.log.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pakorns
 * หลักสูตรวิทยาการคอมพิวเตอร์ 
 * วันที่ 1 มกราคม 2565
 * วิชา การเขียนโปรแกรมเชิงวัตถ
 */
public class NewUser extends javax.swing.JFrame {
private Statement stm=null;
private Connection conn=null;
//private ArrayList<User>user;
    /**
     * Creates new form NewUser
     */
    public NewUser() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        userPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setAlwaysOnTop(true);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pakorns\\Pictures\\ICON-Programming\\java.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 250));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 138, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 133, -1));

        userName.setToolTipText("ชื่อผู้ใช้เป็น อีเมล์หรือตัวอักษรได้");
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 190, -1));

        userPassword.setColumns(16);
        userPassword.setToolTipText(" รหัสผานควรมีอย่างน้อน 8 ตัวอักษรผใากันกันได้");
        jPanel2.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 190, -1));

        jLabel4.setFont(new java.awt.Font("FreesiaUPC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ชื่อผู้ใช้เป็นภาษาอังกฤษและตัวเลข, รหัสผานควรมีอย่างน้อน 8 ตัวอักษรผใากันกันได้");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 390, 50));

        jLabel6.setFont(new java.awt.Font("FreesiaUPC", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ลงทะเบียนผู้ใช้ใหม่");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 50));

        jLabel5.setFont(new java.awt.Font("FreesiaUPC", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ลงทะเบียนผู้ใช้ใหม่");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 430, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // ประกาศตัวแปรสองตัวสำหรับรับค่าจาก textfields
        String newUser = userName.getText().trim();
        String newPasswd = userPassword.getText().trim();
       // ตรวจสอบว่าผู้ใช้ป้อนข้อมูลหรือยัง ถ้า newUser, newPasswd ว่าง ให้แจ้งผู้ใช้ทราบและให้กลับไปกรอกข้อมูลให้ครบ
        if(!newUser.isEmpty() && !newPasswd.isEmpty()){
        //ถ้ากรอกข้อมูลบนฟอร์มแล้วให้เชื่องต่อฐานข้อมูลและบันทึก   
        try {
          
            //เชื่อมฐานข้อมูล
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_example", "root", "pk123456");     
           //สร้างสเตตเมนต์สำหรับคำสั่ง sql 
            String sql = "INSERT INTO users(id,user_name,user_password) "
                    +"VALUES("+0+",'"+newUser+"','"+newPasswd+"')";
             stm = conn.createStatement();      
            stm.execute(sql);
            // เมื่อบันทึกข้อมูลแล้วให้แสดงข้อความแจ้งเตือน  
             JOptionPane.showMessageDialog(rootPane, "บันทึกข้อมูลเรียบร้อย","บันทึก", JOptionPane.INFORMATION_MESSAGE);
            // ปิดฟอร์ม
            dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
              JOptionPane.showMessageDialog(this,"ไม่สามารถบันทึกได้","ข้อผิดพลาด",JOptionPane.ERROR_MESSAGE);       
              crear(); //ล้างฟอร์ม 
        }
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               crear(); 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userPassword;
    // End of variables declaration//GEN-END:variables

    private void crear() {
                userName.setText(null);
               userPassword.setText(null);
               userName.requestFocus();   
    }
}
