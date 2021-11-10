package examples;

public class CounterThread extends Thread {
    private int low; // instance fields - not class
    private int high;// no static not a class field

    public CounterThread(int low, int high){
        this.low = low;
        this.high = high;
    }
    @Override
    public void run()   { // main method for the thread
        try {
            for (int i = low; i <= high; i++) {
                System.out.println(this.getName() + ": " + i);
                Thread.sleep(10); // Time Waiting State
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    } // end of run method - thread is terminated
 // main method exists in it's own thread called main
    public static void main(String[] args) throws InterruptedException{
        Thread[] threads = { new CounterThread(1,10), // new state
                             new CounterThread(11,20),
                             new CounterThread(21,30),
                             new CounterThread(31,40)


                            };
        for (int i = 0; i < threads.length ; i++) {
            threads[i].start(); // thread goes to runnable state
        }
        // put main method to sleep 1 second (1000 milliseconds) before it begins counting
        Thread.sleep(1000); // main method is in timed waiting state
        
        for (int i = 41; i <= 50 ; i++) {
            System.out.println(Thread.currentThread().getName()
                    +" :"+ i);
        }
    } // end of main method - main thread is terminated
}
