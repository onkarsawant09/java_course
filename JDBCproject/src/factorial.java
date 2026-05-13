import java.util.*;
public class factorial{
public static void factoriall(int n){
    int factorial=1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;
    }
    System.out.println(factorial);
    return;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no to find factoral of the number");
    int n=sc.nextInt();
    System.out.println("the factorial is ");
   factoriall(n); 
   
 }
}

