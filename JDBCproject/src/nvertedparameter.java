import java.util.Scanner;
public class nvertedparameter {
   public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the value of paramid");
    int n=Sc.nextInt();
    for(int i=n;i>=1;i--){
        
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
   } 
}
