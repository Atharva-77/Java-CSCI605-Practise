
class Counter1 {
    int counter = 0;

    public void increment() {
        counter++;
    }
}

public class CountThreadLambda {

    public static void main(String[] args) throws InterruptedException {
        Counter1 c = new Counter1();

        Runnable obj1 = () -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
                System.out.println("A1 "+c.counter);
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
                System.out.println("\tB1 "+c.counter);
            }
        };
        
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        
        t1.start();
//        t1.join();
        t2.start();
//        t2.join();
        
        t1.join();
        t2.join();
        

        System.out.println("*******************CountingNumber value "+c.counter);

    }
}
