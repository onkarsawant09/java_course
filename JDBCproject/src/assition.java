import java.util.*;
public class assition {
    public static int Addition(int a, int b) {
        System.out.println("the addition is");
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();

         int sum= Addition(a,b);
         System.out.println("addition is"+sum);
       

        
   
    
    }
}
