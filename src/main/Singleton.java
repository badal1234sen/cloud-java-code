package main;


import java.io.Serializable;

public final class Singleton extends Thread implements Cloneable, Serializable {
    static volatile Singleton s=null;

    public static void main(String[] args) throws Exception {
        Singleton t2=new Singleton();
        t2.start();
        Singleton t3=new Singleton();
        t3.start();
        Singleton t4=new Singleton();
        t4.start();
    }

    private Singleton() throws Exception{
        System.out.println("private Constructor is called");
    }
//    {
//        //IIB
//        if (s!=null){
//            throw new Exception("Object is already present");
//        }
//    }

    public static Singleton getInstance() throws Exception {
        System.out.println("hi");
        if (s==null){
            synchronized(Singleton.class){
                if (s==null){
                    return s= new Singleton();
                }

            }

        }

      return s;
    }
    Object readResolve(){
        return s;
    }
@Override
    protected Object clone() throws CloneNotSupportedException{
       // return super.clone();
    return s;
}

    @Override
    public void run() {
        try {
            Singleton s5 = Singleton.getInstance();
            System.out.println(s5.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        super.run();
    }
}

