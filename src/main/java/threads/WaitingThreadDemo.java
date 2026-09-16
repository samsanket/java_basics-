package threads;

class WaitingThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (Thread.currentThread()) {
                try {
                    System.out.println("Thread is waiting");
                    Thread.currentThread().wait();
                    System.out.println("Thread is resumed!!!");
                } catch (InterruptedException e) {
                    System.out.println("Inside catch block!!!");
                }
            }
        });

        t1.start();
        Thread.sleep(1000);

        System.out.println("Thread state: " + t1.getState());
        Thread.sleep(3000);
        
        synchronized (t1) {
            t1.notify();
        }
    }
}