import java.util.*;
public class rev {
    public static void main(String[] args) {
        //declaration of string
      StringBuilder sb=new StringBuilder("hollostar");
        ///
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
           int back=sb.length()-1-i;

           char frontchar=sb.charAt(i);

           char backchar=sb.charAt(back);
           sb.setCharAt(front, backchar);
           sb.setCharAt(back, frontchar);
           
    }
   System.out.println(sb); 
}
}