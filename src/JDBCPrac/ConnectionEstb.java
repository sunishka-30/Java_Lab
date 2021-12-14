package JDBCPrac;
import java.sql.*;

public class ConnectionEstb {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");

            System.out.println("Connection establish");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Driver not loaded");
        }
        catch(SQLException e)
        {
            System.out.println("Connection not establish");
        }
    }
}
