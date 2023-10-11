class Container<T>
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
        Container<?> obj= new Container<>("20"); // can put any value
        obj.show();

        Container<Integer> obj1= new Container<>(20); // only integer allowed...type safety
        obj1.show();
    }
}