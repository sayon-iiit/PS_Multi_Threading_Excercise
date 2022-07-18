public class Driver{
    public static void main(String[] args)
    {
        PrintOddEven obj = new PrintOddEven();
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                obj.printEvenNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                obj.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }

}
