package threads;

public class BlockedThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::accessResource, "Thread-1");
        Thread t2 = new Thread(resource::accessResource, "Thread-2");

        t1.start();
        t2.start();

        Thread.sleep(1000);

        System.out.println("Thread - 2 state: " + t2.getState());
    }
}
