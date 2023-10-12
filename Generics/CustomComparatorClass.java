import java.util.Comparator;

public class CustomComparatorClass implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%10>o2%10){
            return 1;
        }
        return -1;
    }

    // comparable
//    @Override
//    public int compareTo(Integer o1,Integer o2) {
//        if(o1>o2)
//            return 1;
//        return 0;

//    }
}
