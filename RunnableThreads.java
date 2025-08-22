// class A implements Runnable // we implement Runnable interface to use multi threding at same time
// {
//     public void run(){};
    
// }
// class B implements Runnable// Runnable interface implemented
// {
//     public void run(){};
// }
// no need of this becaous we can instantiate Runnable interface and create inner class

public class RunnableThreads 
{
     public static void main(String[] args) {
        Runnable a = () -> { // Lambda expression using Runnable functional interface, Runnable interface define in java.lang
                for(int i = 0 ; i<=100; i++){
                 System.out.println("hi");
                try {
                Thread.sleep(10);
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
};
        Runnable b = new Runnable() {
                            public void run(){
                    for(int i = 0; i<= 100; i++){
                        System.out.println("Hello");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        };

        
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
    
        t1.start();
        t2.start();
    }
}
// to see more information see ThreadsDemo.java or notebook or #88 vedio
// we did
    //1 Runnable interface, Anonymous inner class, lambda expression
  