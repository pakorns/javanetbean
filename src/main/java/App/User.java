
package App;

/**
 *
 * @author pakorns
 * หลักสูตรวิทยาการคอมพิวเตอร์ 
 * วันที่ 1 มกราคม 2565
 * วิชา การเขียนโปรแกรมเชิงวัตถ
 */
public class User {
    String userName;
    String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
}
