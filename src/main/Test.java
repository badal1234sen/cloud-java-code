package main;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test  {

    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode());

        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.hashCode());

        Singleton instance3 = Singleton.getInstance();
        System.out.println(instance3.hashCode());

        //Use of Reflection Concept
//        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
        //handling breaking of Singleton Design Pattern
//        declaredConstructor.setAccessible(true);
//        Singleton obj=declaredConstructor.newInstance();
//        System.out.println(obj.hashCode());
//Serialization
        FileOutputStream f = new FileOutputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\serialize.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(instance);
//Deserialization
        FileInputStream f1= new FileInputStream("C:\\Users\\Hp\\OneDrive\\Desktop\\serialize.txt");
        ObjectInputStream in = new ObjectInputStream(f1);
        Singleton s5 = (Singleton) in.readObject();
        System.out.println(s5.hashCode());


        //Cloning
        Singleton s6=(Singleton) s5.clone();
        System.out.println(s6.hashCode());
    }

        }


