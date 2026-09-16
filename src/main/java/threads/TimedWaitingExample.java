package threads;

class TimedWaitingExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                System.out.println("Inside catch block!!!");
            }
        });

        t1.start();
        Thread.sleep(1000); 
        System.out.println("Thread State: " + t1.getState());
    }
}