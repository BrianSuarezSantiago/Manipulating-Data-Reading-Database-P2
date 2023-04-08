package histogram.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
/**
 * Class representing a database. The class has the
 * necessary public methods to obtain all the information
 * needed to create a local database using the JDBC driver
 * provided by SQLite.
 *
 * @author Brian Suárez Santiago
 * @version 2.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html">Package java.sql</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/">Java JDBC API</a>
 */
public class MailListReaderDB {

    /**
     * Establishes a connection to a local database from
     * a specified URL. If the connection establishment
     * fails, it is informed through an error otherwise,
     * it displays a message reporting about it and finally
     * closes the established connection.
     */
    private static Connection connect() {
        String urlDB = "jdbc:sqlite:Kata6.db";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(urlDB);
            System.out.println("A connection has been created!");
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return connection;
    }

    /**
     * Returns all rows and all columns from the EMAILS
     * table obtaining thus, all the data contains in it
     * and finally closes the established connection.
     */
    public static List<String> read(){
        String sql = "SELECT * FROM Emails";
        List<String> mailList = new ArrayList<>();
        Connection connection = MailListReaderDB.connect();

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet resultSet = pstmt.executeQuery();

            while(resultSet.next()) {
                mailList.add(resultSet.getString("Address"));
            }
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection has been closed successfully!");
                } catch(SQLException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
        return mailList;
    }
}