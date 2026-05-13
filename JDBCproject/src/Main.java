class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("thresd 1");

        }

    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i=6;i<=6;i++){
            System.out.println("thread 2");
        }
    }
}

public class Main {
    
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();
        
    }
}
