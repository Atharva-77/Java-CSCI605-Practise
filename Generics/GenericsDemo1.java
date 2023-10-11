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

    public void demo(ArrayList<? extends T> obj){ // this means, we created a Numbers class type but it accepts Integer

    }
}


public class GenericsDemo1 {
    public static void main(String[] args) {

        Container<Number> obj= new Container<>(20); // integer  extends number
        obj.show();

        obj.demo(new ArrayList<Integer>());

    }
}