package racecondition;

public class WorkerThread implements Runnable{
    private static final int MAX = 10000;
    private int sum; // shared data resource

   public int getSum() {
        return sum;
    }

    @Override
    public void run(){
       // add in the check to see if this WorkerThread has been interrupted
        for (int i = 0; i < MAX && !Thread.interrupted(); i++) {
            sum += i;
        }

        System.out.println("Cleaning up now: " + sum);
    }
}
