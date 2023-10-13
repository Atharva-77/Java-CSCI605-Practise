import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List  values= new ArrayList(); //dynamic array using collections, arraylist

        values.add(new A());
        values.add(new B());

//        Comparable<Student> comp=new Student();

//        Collections.sort(values);

        for(Object i: values){
            System.out.println(i);
        }
    }
}

class A{

}

class B{

}
class Student implements Comparable{

    int rollNo;
    int marks;

    Student(int rollNo, int marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public String toString(){
        return "Student= "+rollNo+ ", Marks= "+marks;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("Hello");
        return 0;
    }
}
