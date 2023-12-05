
class Aq extends Thread{
    @Override
    public void run() {
        System.out.println("AA");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2.AA");
    }
}

class Bq extends Thread{
//    @Override
    public void run() {
//        System.out.println("BB");
        super.run();
    }
    
}


public class Chat {

    public static void main(String[] args) {
//        Aq a=new Aq();
        Bq b=new Bq();
        
//        a.run();
        b.start();
    }
}
