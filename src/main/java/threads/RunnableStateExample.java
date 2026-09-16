package threads;

public class RunnableStateExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Thread is running"));
        System.out.println(" T Thread State: " + t.getState());

        t.start();
        System.out.println(" T Thread State: " + t.getState());


        MyThread tx = new MyThread();
        System.out.println("Tx Thread State: " + tx.getState());


        tx.start();
        System.out.println("Tx Thread State: " + tx.getState());


    }
}
