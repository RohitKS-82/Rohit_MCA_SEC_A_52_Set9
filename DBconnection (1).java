import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/gym_locker";
            String user = "root";
            String pass = "ritammajumdar"; 

            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}