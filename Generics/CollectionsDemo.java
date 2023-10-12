import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List <Student> values= new ArrayList<>(); //dynamic array using collections, arraylist

        values.add(new Student(1,23));
        values.add(new Student(2,89));
        values.add(new Student(3, 75));

        values.add(3, new Student(4,99));
        Comparator<Student> comp=new CustomComparatorStudentClass();

        Collections.sort(values,comp);

        for(Student i: values){
            System.out.println(i);
        }
    }
}

class CustomComparatorStudentClass implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.marks>o2.marks)
            return -1;
        return 1;
    }
}
class Student{

    int rollNo;
    int marks;

    Student(int rollNo, int marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public String toString(){
        return "Student= "+rollNo+ ", Marks= "+marks;
    }
}