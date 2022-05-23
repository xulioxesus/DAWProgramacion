import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TestDB
 */
public class TestDB {

    public static void main(String[] args) {
        String sqlSelectAllPersons = "SELECT count(*) FROM Cliente";
        String connectionUrl = "jdbc:mysql://192.168.204.171:3306/test?serverTimezone=UTC";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("ID");
                String name = rs.getString("FIRST_NAME");
                String lastName = rs.getString("LAST_NAME");

                // do something with the extracted data...
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}