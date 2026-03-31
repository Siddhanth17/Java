import java.sql.*;

public class CreateDB {

    static String url = "jdbc:mysql://localhost:3306/LIBRARYDBBBS";
    static String user = "root";
    static String password = "Siddhanth1350$";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to MySQL Database!");

            insertData(con);
            displayData(con);

            updateData(con);
            deleteData(con);

            System.out.println("\nAfter Update & Delete:");
            displayData(con);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void insertData(Connection con) throws SQLException {
        String query = "INSERT INTO SIULIBRARY VALUES (2, 'City Library', 'Mumbai', 3)";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Data Inserted!");
    }


    public static void displayData(Connection con) throws SQLException {
        String query = "SELECT * FROM SIULIBRARY";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("\nLibrary Data:");

        while (rs.next()) {
            System.out.println(
                rs.getInt("SLID") + " " +
                rs.getString("LNAME") + " " +
                rs.getString("LOCATION") + " " +
                rs.getInt("NOOFBRANCHES")
            );
        }
    }

    public static void updateData(Connection con) throws SQLException {
        String query = "UPDATE SIULIBRARY SET LOCATION='Delhi' WHERE SLID=2";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Data Updated!");
    }

    
    public static void deleteData(Connection con) throws SQLException {
        String query = "DELETE FROM SIULIBRARY WHERE SLID=2";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Data Deleted!");
    }
}