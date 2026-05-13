import java.util.*;
import java.io.*;
public class natural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int sum=0,i; 
        
        
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.err.println(sum);
    }
}
