package interrupting;

public class PersonThread {

    public static void main(String[] args) {
        // Construct an Alarm Thread (pass a reference to the main thread
        // in the AlarmThread Constructor)
        AlarmThread alarm = new AlarmThread(Thread.currentThread());
        Thread alarmThread = new Thread(alarm);// new state

        // start up the alarm thread
        // alarm thread will send an interrupt to main
        alarmThread.start();

        // put main thread to sleep Thread.sleep() for 10 seconds
        try {
            Thread.sleep(10000);// main thread in waiting state
        }catch(InterruptedException e){
            System.out.println("Main thread is interrupted now-awake");
        }




    }
}
