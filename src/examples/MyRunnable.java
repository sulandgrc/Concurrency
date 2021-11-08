package examples;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
