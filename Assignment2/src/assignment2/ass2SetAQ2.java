package Assignment2.src.assignment2;
import java.sql.*;
public class ass2SetAQ2 {
    
    public static void main(String[] args) {

        try {

    
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Company",
                    "root",
                    "root1234"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT Ename FROM Emp");

            System.out.println("Employee Names:");

            while (rs.next()) {
                System.out.println(rs.getString("Ename"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}