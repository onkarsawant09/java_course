package Assignment2.src.assignment2;
import java.sql.*;
public class Ass2SetAQ4 {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root1234"
            );

            Statement stmt = con.createStatement();

            String query = "ALTER TABLE Emp DROP COLUMN Salary";

            stmt.executeUpdate(query);

            System.out.println("Salary column deleted successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}