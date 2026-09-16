package threads;

class SharedResource {
    synchronized void accessResource() {
        System.out.println(Thread.currentThread().getName() + " is accessing!!!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Inside catch block!!!");
        }
    }
}
