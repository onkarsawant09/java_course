import java.util.*;
public class inputarray {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in)   ;
     System.out.println("enter the size of array");
     int size =sc.nextInt();
     int[] number=new int[size];
     for(int i=0;i<size;i++){
        
        number[i]=sc.nextInt();
     }
     for(int i=0;i<size;i++){
        
        System.out.println(number[i]);
     }
    }
}
