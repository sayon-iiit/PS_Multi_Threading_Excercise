// Java program for the above approach

public class PrintOddEven extends Thread{
    int counter = 1;
    static int N=10;
    synchronized public void printOddNumber()
    {
            while (counter < N) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
    }
    synchronized public void printEvenNumber()
    {
            while (counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
    }
    public static void main(String[] args)
    {
        PrintOddEven mt = new PrintOddEven();
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }
}
