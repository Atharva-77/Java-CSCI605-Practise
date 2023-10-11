import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo {
    public static void main(String[] args) {
        Collection <Integer> values= new ArrayList<>(); //dynamic array using collections, arraylist

        values.add(12);
        values.add(50);
        //        values.add("Atharva");
        //        values.add(3.9);

        //        Iterator i= values.iterator();
        //        System.out.println(i.next());
        //        System.out.println(i.next());
        //        System.out.println(i.next());

        //        or

        //        enhanced loop

        for(Object i: values){
            System.out.println(i);
        }
    }
}
