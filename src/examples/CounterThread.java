package examples;

public class CounterThread extends Thread {
    private int low; // instance fields - not class
    private int high;// no static not a class field

    public CounterThread(int low, int high){
        this.low = low;
        this.high = high;
    }
    @Override
    public void run(){
        for (int i = low; i <= high; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        Thread[] threads = { new CounterThread(1,10),
                             new CounterThread(11,20),
                             new CounterThread(21,30),
                             new CounterThread(31,40)


                            };
        for (int i = 0; i < threads.length ; i++) {
            threads[i].start();
        }

        for (int i = 41; i <= 50 ; i++) {
            System.out.println(Thread.currentThread().getName()
                    +" :"+ i);
        }
    }
}
