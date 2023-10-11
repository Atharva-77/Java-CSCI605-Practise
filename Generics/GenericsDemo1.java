class Container<T>
{
    T value;
}


public class GenericsDemo1 {
    public static void main(String[] args) {
        Container <?>obj= new Container<>();
    }
}