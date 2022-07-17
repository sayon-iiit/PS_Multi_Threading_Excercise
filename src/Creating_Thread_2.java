import java.io.*;
import java.util.*;
public class Creating_Thread_2 implements  Runnable{

    public void run()
    {

        System.out.println("Thread Running...");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
        }
        System.out.println("Thread Running 2");
    }
    public static  void  main(String[] args)
    {
        Creating_Thread_2 a=new Creating_Thread_2();
        Thread t1=new Thread(a);
        t1.start();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
        }
        System.out.println("Hello");
    }
}
