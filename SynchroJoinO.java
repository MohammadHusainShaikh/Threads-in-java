class Counter
{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class SynchroJoinO {
         public static void main(String[] args) throws InterruptedException {
            Counter c = new Counter();
        Runnable d = () -> { // Lambda expression using Runnable functional interface, Runnable interface define in java.lang
                for(int i = 1 ; i<=10000; i++){
                    c.increment();
                }
        };
        Runnable e = () -> 
        {
              for(int i = 1; i<= 10000; i++){
                   c.increment();
               }
        };
        
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(e);
    
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println(c.count);
    }
}
        // to see more information see ThreadsDemo.java or notebook or #89 vedio
        //2 What is thread and mutation(changeable), thread safe , 
        //use of join(), suynchronization, Race condition