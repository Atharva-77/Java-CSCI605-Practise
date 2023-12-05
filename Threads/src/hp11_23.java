
/*
 * is this output	0 1 0 1 0 1 ...
 * the only possible output?
 *
 *
 */
public class hp11_23 extends Thread	{
    private String info;
    static Object o = new Object();

    public hp11_23 (String info) {
        this.info    = info;
    }
    int i=0;
    public void run () {
//        synchronized ( o ) {
            while ( i<2 )	{
                
//                o.notify();
                System.out.println(info+" i="+i);
                try {
                    sleep(5000);
//                    o.wait();
                    
//                    sleep(500);
                } catch ( Exception e ) { }
                i++;
            }
//        }
    }
    public static void main (String args []) {
        new hp11_23("0").start();
        new hp11_23
                ("1").start();
    }
}
