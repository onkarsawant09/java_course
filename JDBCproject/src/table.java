import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
          sum= n*i;
          System.out.println(sum);
          
        }  
    }
}
