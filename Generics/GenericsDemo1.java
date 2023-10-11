class Container<T extends Number> // Only those class used that extends Number.Bounding.
{
    T value;
    Container(T value){
        this.value=value;
    }

    public void show(){
        System.out.println("Value= "+value+" "+value.getClass().getName());
    }
}


public class GenericsDemo1 {
    public static void main(String[] args) {

        Container<Integer> obj= new Container<>(20); // integer  extends number
        obj.show();

        Container<Double> obj1= new Container<>(20.5); // Double extends number
        obj1.show();

        Container<String> obj2= new Container<>("20.5"); // String does not extends number
        obj2.show();
    }
}