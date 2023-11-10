
class Counter{
    int counter=0;
    
    public void increment()
    {
        counter++;
    }
}

class A implements Runnable{
    @Override
    public void run() {
//        super.run();
        Counter c=new Counter();
        System.out.println("1.A");
//        System.out.println("2.A");
        for(int i=0;i<10;i++){
//            c.increment();
//            System.out.println("Hello A "+c.counter);
            System.out.println("Hello A "+i);
        }
        System.out.println("2.A");
    }
}
class B implements Runnable{
    public void run(){
        Counter c=new Counter();
        System.out.println("1.B");
//        System.out.println("2.B");
        
        for(int i=0;i<10;i++){
//            c.increment();
//            System.out.println("\tHello B "+c.counter);
            System.out.println("\tB "+i);
        }
        System.out.println("2.B");
    }
}

public class CountThreads {
        public static void main(String[] args) {
        
        Runnable obj1=new A();
        Thread at1=new Thread(obj1);
       
        Runnable obj2=new B();
        Thread at2= new Thread(obj2);
        
        at1.start();
        at2.start();
        
        Counter c=new Counter();
        
        System.out.println("COUNTER VALUE "+c.counter);
    }
}
