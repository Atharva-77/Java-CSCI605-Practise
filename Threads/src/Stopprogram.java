import java.util.Scanner;

class Process extends Thread{
    boolean run=true;
    @Override
    public void run() {
        while(run){
            System.out.println("Hello");
            
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                System.out.println("ERR");
            }
        }
    }
    public void shutdown(){
        System.out.println("BEFORE "+run);
        run=false;
        System.out.println("AFTER "+run);
    }
}

public class Stopprogram {
    public static void main(String[] args) {
        Process p1=new Process();
        p1.start();
        p1.shutdown();
        System.out.println("STOP....");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        
//        p1.shutdown();
    }
}
