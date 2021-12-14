package JDBCPrac;
import java.sql.*;

public class UpdateDb {


        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
            System.out.println("Connection establish");
            String str = "Select * from info";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(str);
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getInt(2));
            }
            con.close();
        }
    }

