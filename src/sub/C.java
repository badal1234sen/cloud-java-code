package sub;

public class C implements Runnable{
    @Override
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        Runnable r=new C();
        Thread t1=new Thread(r);
        t1.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
