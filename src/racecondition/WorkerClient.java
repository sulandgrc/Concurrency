package racecondition;

public class WorkerClient {

    public static void main(String[] args) throws InterruptedException {
        // Construct a WorkerThread that is in the New state
        WorkerThread worker = new WorkerThread();
        Thread t = new Thread(worker);

        // make the thread runnable
        t.start();

        // main method goes to sleep for one second
        // main thread is in timed waiting state
        //Thread.sleep(500);

        // Use join method so main waits until
        // worker t thread is finished
        //t.join(); // main thread is in waiting state

        // main thread prints out the sum
        System.out.println(worker.getSum());

        // main thread asks the worker thread to stop
        // main thread wants to interrupt the worker thread
        t.interrupt();


        // main thread prints out the sum
        System.out.println(worker.getSum());

    }
}
