package Assignment2.src.assignment2;

import java.sql.*;
import java.util.Scanner;
public class Ass2SetAQ5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root1234"
            );

            System.out.print("Enter Teacher Number to delete: ");
            int tno = sc.nextInt();

            Statement stmt = con.createStatement();

            String query = "DELETE FROM Teacher WHERE Tno=" + tno;

            int result = stmt.executeUpdate(query);

            if(result > 0)
                System.out.println("Teacher record deleted successfully");
            else
                System.out.println("Teacher not found");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}