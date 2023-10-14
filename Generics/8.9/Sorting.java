import java.util.*;

class MultipleTypes<E, V> {
    List<E>     data = new ArrayList<E>();
    Vector<V> volume = new Vector<V>();

    public V getV() {
        return volume.elementAt(0);
    }
}


public class Sorting<E, V> {
    List<E>     data = new ArrayList<E>();
    Vector<V> volume = new Vector<V>();

    public void add(E element) {
        data.add(element);
    }
    public void addOne(V element) {
        volume.add(element);
    }
    public V getV(int position) {
        return volume.elementAt(position);
    }

    public static void main(String args[])	{
        Sorting<String, Integer> aSortedString = new Sorting<String, Integer>();
        aSortedString.add("hello");
        aSortedString.addOne(Integer.valueOf("1"));
        aSortedString.addOne(Integer.valueOf("22"));

// 		Set <String> keys= aSortedString.keySet();

        for(String keyVal:aSortedString.data){
            System.out.println(keyVal+ " "+aSortedString.volume);
        }

        Sorting<Integer, String> aSortedInteger = new Sorting<Integer, String>();
        aSortedInteger.add(Integer.valueOf("1"));
        aSortedInteger.addOne("hello");
    }
}