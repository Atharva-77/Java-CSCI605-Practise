public class Hw11 extends Thread {

    private String info;
    static Object o = new Object();

    public Hw11(String info) {
        this.info = info;
    }

    public void run() {
        synchronized (o) {
            try {
                o.notify(); // Notify before wait
                System.out.println(info);
                Thread.sleep(200); // Sleep to allow another thread to execute
//                o = new Object(); // Changing the reference of the monitor object
                o.wait(); // IllegalMonitorStateException will occur here
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        new Hw11("0").start();
        new Hw11("1").start();
    }
}
