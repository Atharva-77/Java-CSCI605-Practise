import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List  values= new ArrayList(); //dynamic array using collections, arraylist

        values.add(new Student(1,23));
        values.add(new Student(2,89));
        values.add(new Student(3, 75));

        values.add(3, new Student(4,99));
        values.add(2);

//        Comparable<Student> comp=new Student();

//        Collections.sort(values);

        for(Object i: values){
            System.out.println(i);
        }
    }
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