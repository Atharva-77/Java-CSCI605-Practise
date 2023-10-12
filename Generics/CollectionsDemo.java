import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List <Integer> values= new ArrayList<>(); //dynamic array using collections, arraylist

        values.add(123);
        values.add(56);
        values.add(160);

        values.add(1,15);
        Comparator<Integer> comp=new CustomComparatorClass();

        Collections.sort(values,comp);

        for(int i: values){
            System.out.println(i);
        }
    }
}
