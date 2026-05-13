import java.util.*;
public class FUNCTION {
    public static void MyName(String name){
System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
       MyName(name);
       System.out.println("function call sucessfully");
    }
}
