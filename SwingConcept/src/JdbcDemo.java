import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) {
        String databaseName = "javabatch2";
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306";
        try {
            Connection c = DriverManager.getConnection(username, password, url);
            System.out.println("connection established ");
        } catch (SQLException e) {
            throw new RuntimeException(e + "not connected");
        }
    }
}
