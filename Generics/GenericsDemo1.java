import java.util.ArrayList;

class Container<T extends Number> // Only those class used that extends Number.Bounding.
{
    T value;
    Container(T value){
        this.value=value;
    }

    public void show(){
        System.out.println("Value= "+value+" "+value.getClass().getName());
    }

    public void demo(ArrayList<? super T> obj){ // this means, all super class of T work. eg here, Number is super class of Integer.
                                                // Sub-classes of integer don't work( we dont have any but still...)
                        // Number super Integer
    }
}


public class GenericsDemo1 {
    public static void main(String[] args) {

        Container<Integer> obj= new Container<>(20); // integer created
        obj.show();

        obj.demo(new ArrayList<Number>()); //Number passed

    }
}