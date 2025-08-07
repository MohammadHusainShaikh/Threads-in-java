class Hi extends Thread // Thread class extended
{
    public void run(){
        for(int i = 0 ; i<=100; i++){
            System.out.println("hi");
            // we have print one after one so we tell this to wait 10 second and in this time another 
            // thread will execute but this is will not print perfectly but littil bit one after becouse
            // as a program we only suggest schedular to that not force(control)
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Hello extends Thread // we extned thread class to use multi threding at same time
{
    public void run(){
        for(int i = 0; i<= 100; i++){
            System.out.println("Hello");
            // we have print one after one so we tell this to wait 10 second and in this time another 
            // thread will execute but this is will not print perfectly but littil bit one after becouse
            // as program we only suggest schedular to that not force(control)
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadsDemo
 {
    public static void main(String[] args) {
        Hi h = new Hi();
        h.start();

            // priority is given by to every thared hare we get and chage to set new priority.
            // System.out.println("this is bydefault priority "+h.getPriority());// this is will print bydefault priority
            // h.setPriority(9);// to set new priosrity
            // System.out.println("this is new priority that we changed "+h.getPriority());
            
        
        Hello he = new Hello();
        he.start();
        
            // we can use constant priority provided by Thread class
            // System.out.println("this is default priority of Hello class object "+he.getPriority());
            //he.setPriority(Thread.MAX_PRIORITY);// this will give max priority to this thread(hello class object he)
            //he.setPriority(Thread.MAX_PRIORITY);// this will give min priority to this thread(hello class object he)
        }
}
// main method folow sequence to perform exttion first it will create onject
// then call show (converted into start()) metohod 
// them main will complete execution of that method 
//after that it will execute remaining code which is createin object and calling it(converte into show())
// we want multitasking in same method(main()) that will also call and exceute class Hi method 
// and also call and execute class Hello method to do that we have to extend Thread class in both class
// and in main method to call that use start() method 
// and in both class name method as run()
// run() method should be peresent in every thread, to start a start() method
// run() method is used to do an acttion for thread
// start() method is declare and define inside thread class

// if you print small time it will call it sequencey becouse speed of machine but in background it work as multithread
// if you want time hsaring(multimple thread) then try to print atleast 100 times
