package Assignment2.src.assignment2;
import java.sql.*;
public class Ass2SetAQ3 {
    
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root1234"
            );

            Statement stmt = con.createStatement();

            String query = "CREATE TABLE Student1 (Rno INT PRIMARY KEY, Sname VARCHAR(50), Per FLOAT)";

            stmt.executeUpdate(query);

            System.out.println("Student table created successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}