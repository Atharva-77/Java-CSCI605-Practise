class A1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
//            if(CountingNumber.counter==9998)
//                System.out.println("\ta1 BEFORE "+CountingNumber.counter);
            CountingNumber.counter++;
            if (CountingNumber.counter==9999)
                System.out.println("A1 "+i+" "+CountingNumber.counter);
        }
    }
}

class B1 implements Runnable{
    public void run(){
        for(int i=0;i<10000;i++){
           
//            if(CountingNumber.counter==9998)
//                System.out.println("\t\tb1 BEFORE "+CountingNumber.counter);
            CountingNumber.counter++;
            if (CountingNumber.counter==9999)
                System.out.println("\tB1 "+i+" "+CountingNumber.counter);
        }
    }
}

public class CountingNumber {
    static int counter=0;
    public static void main(String[] args) throws InterruptedException {

        Runnable obj1=new A1();
        Thread at1=new Thread(obj1);

        Runnable obj2=new B1();
        Thread at2= new Thread(obj2);

        at1.start();
        at2.start();

        at1.join();
        at2.join();
        System.out.println("COUNTER VALUE "+CountingNumber.counter);
    }
}
