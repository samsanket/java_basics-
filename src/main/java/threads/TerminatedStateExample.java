package threads;

public class TerminatedStateExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("Thread is running"));
        t.start();
        t.join(); 
        System.out.println("Thread State: " + t.getState());
    }
}