package sub;

import java.util.ArrayList;

public class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo){
      this.name=name;
      this.rollNo=rollNo;
    }
    @Override
  public String toString(){
        return  name+"..."+rollNo;
  }
    public static void main(String[] args) {
     Student s1= new Student("Durga", 101);
     Student s2= new Student("Paresh",102);
     String s3= new String("Hello");
        System.out.println(s3);
        Integer i= new Integer(10);
        System.out.println(i);
        ArrayList al= new ArrayList();
        al.add(10);
        al.add("Badal");
        System.out.println(al);
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s2.toString());
    }
}
