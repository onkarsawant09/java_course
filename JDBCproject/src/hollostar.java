import java.util.Scanner;

public class hollostar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=rows;i++){
             for(int j=1;j<=col;j++){
if (j==1 || j==col || i==1 || i==rows) {
    System.out.print("*");
       } else {
    System.out.print(" ");
}
        }
        System.out.println();
        }
    }
}
