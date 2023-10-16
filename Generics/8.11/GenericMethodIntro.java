class OneOfAkind<T> {

    private T thisIsMe;
    public OneOfAkind(T thisIsMe) {
        this.thisIsMe = thisIsMe;
    }

    public void setMe(T thisIsMe) {
        this.thisIsMe = thisIsMe;
    }
    public T getMe()   {
        return thisIsMe;
    }
}
//class A<T>{
//
//    static T hi;
//    public static <T> T wow(){
//        System.out.println("HIHIHIHI");
//        return hi;
//    }
//}

public class GenericMethodIntro {

    public static <T> boolean compare(OneOfAkind<T> first, OneOfAkind<T> second) {
        return first.getMe() == second.getMe();
    }
    public static void main(String[] args)	{
        OneOfAkind<String> first = new OneOfAkind<>("me");
        OneOfAkind<String> second = new OneOfAkind<>("me");
        boolean same = GenericMethodIntro.<String>compare(first, second);
        // No need to write generics type <String> above
        System.out.println("same = " + same );
    }
}