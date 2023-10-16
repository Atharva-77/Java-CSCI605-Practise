class Compare {
    public static <T> boolean compare(Fruit<T> fruit1, Fruit<T> fruit2) {
        return fruit1.getName().equals(fruit2.getName());
    }
}
class Compare2<T> {
    public static void staticMethod()	{ }
    public boolean compare(Fruit<T> fruit1, Fruit<T> fruit2) {
        return fruit1.getName().equals(fruit2.getName());
    }
}

class Fruit<T> {
    private T fruitName;

    public Fruit(T fruitName) {
        this.fruitName = fruitName;
    }
    public void setName(T fruitName) {
        this.fruitName = fruitName;
    }
    public T getName()   {
        return fruitName;
    }
}

public class GenericMethod_2 {
    public static void main(String[] args)	{
        Fruit<String> fruit1 = new Fruit<String>("apple");
        Fruit<String> fruit2 = new Fruit<String>("mango");

        System.out.println( Compare.compare(fruit1, fruit1)); //  false
        System.out.println( Compare.compare(fruit1, fruit2));         //  flase
        System.out.println( new Compare2<String>().compare(fruit1, fruit2)); // flase
    }
}