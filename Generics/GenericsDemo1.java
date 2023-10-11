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
        Container<?> obj= new Container<>("20");
        obj.show();
    }
}