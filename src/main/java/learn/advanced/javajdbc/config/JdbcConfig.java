package learn.advanced.javajdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {

    /**
     * @return return connection database
     */
    public static Connection connection() {
        String url = "jdbc:mysql://localhost:3306/identity";
        String username = "root";
        String password = "test123!";

        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
