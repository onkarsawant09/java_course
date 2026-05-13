package Assignment2.src.assignment2;

import java.sql.*;

public class Ass2SetAQ1 {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/stud",
                    "root",
                    "root1234"
            );

            Statement stmt = con.createStatement();

            String query = "SELECT COUNT(*) FROM Student";

            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of records: " + count);
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}