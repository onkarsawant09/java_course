import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class createdb {
    public static void main(String[] args) throws Exception{
       try{
        String url = "jdbc:mysql://localhost:3306/";
        String databaseName="demmo";
        String userName="root";
        String password="root1234";
        Connection connection =DriverManager.getConnection(url,userName,password);
        String sql ="CREATE DATABASE" +databaseName;
        Statement statement=connection.createStatement();
        statement.execute(sql);
        statement.close();
        JOptionPane.showMessageDialog(null, statement);
       } catch(Exception e){
        e.printStackTrace();
       }
    }
    
}
