import java.util.Vector;

public class hp11_26 extends Thread	{

    private String info;
    static  Vector aVector = new Vector();

    public hp11_26(String info, Vector aVector) {
        this.info = info;
        this.aVector = aVector;
    }

    public void run() {
        synchronized ( aVector )	{
            if (  info.equals("second") )	{
                System.out.println(info + " is waking up one");
                        aVector.notifyAll();
                System.out.println(info + " done.");
            } else {
                System.out.println(info + " is waiting");
                try {
                    new hp11_26("second", aVector).start();
                    aVector.wait();
                } catch ( IllegalMonitorStateException  e )	{
                    System.out.println(info +
                            ": IllegalMonitorStateException");
                } catch ( InterruptedException  e )	{
                    System.out.println(info +
                            ": InterruptedException");
                }
                System.out.println(info + " is awake!");
            }
        }
    }
    public static void main (String args []) {
        new hp11_26("first", aVector).start();
    }
}