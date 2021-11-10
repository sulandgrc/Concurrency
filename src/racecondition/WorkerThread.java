package racecondition;

public class WorkerThread implements Runnable{
    private static final int MAX = 10000;
    private int sum; // shared data resource

   public int getSum() {
        return sum;
    }

    @Override
    public void run(){
        for (int i = 0; i < MAX ; i++) {
            sum += i;
        }
    }
}
