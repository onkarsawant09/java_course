public import java.lang.*;

class Mythread extends Thread{
    String s;
    Mythread(String s1){
        s=s1;
    }
    public void run(){

        System.out.println(s);
    }
    
}
public class hello{
   public static void main(String[] args) {
    Mythread m1 =new Mythread("hello");
    m1.start();
    
   }
}
