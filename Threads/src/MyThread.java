public class MyThread extends Thread {
    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (int i=0; i<2;i++ ) {
                System.out.println(i+" "+name);
                Thread.sleep(1000);
                System.out.println("\n"+i+" "+name+"----\n");
            }
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread("First Thread");
        Thread t2 = new MyThread("Second Thread");
        t1.start();
        t2.start();
    }
}