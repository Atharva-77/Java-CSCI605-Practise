import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List <Integer> values= new ArrayList<>(); //dynamic array using collections, arraylist

        values.add(12);
        values.add(50);
        values.add(60);

        values.add(1,99);
        Collections.sort(values);

        for(int i: values){
            System.out.println(i);
        }
    }
}
