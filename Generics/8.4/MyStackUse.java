//8.4 example
import java.util.Vector;

class MyStack<T> {
    Vector<T> myStack = new Vector<T>();

    public void push( T anElement ) {
        myStack.add(anElement);
    }
    public T pop() {

        if ( ! myStack.isEmpty() )	{
            T anElement = myStack.lastElement();
            myStack.remove(myStack.size() - 1) ;
            return anElement;
        } else  {
            return null;
        }
    }
    public boolean isEmpty()	{
        return myStack.isEmpty();
    }
}

public class MyStackUse {

    public static void testString()	{
        MyStack<String> aMyStack = new MyStack<String>();
        aMyStack.push("a");
        aMyStack.push("b");
        while ( ! aMyStack.isEmpty() )	{
            System.out.println(aMyStack.pop());
        }
    }
    public static void testInteger()	{
        MyStack<Integer> aMyStack = new MyStack<Integer>();
        aMyStack.push(1);
        aMyStack.push(2);
        while ( ! aMyStack.isEmpty() )	{
            System.out.println(aMyStack.pop());
        }
    }
    public static void testMyStack()	{
        MyStack<MyStack> aMyStack = new MyStack<MyStack>();
        MyStack<MyStack<Integer>> bMyStack = new MyStack<MyStack<Integer>>();
        aMyStack.push(new MyStack<Integer>());
        aMyStack.push(new MyStack<Integer>());
        aMyStack.push(new MyStack<String>());
// 	bMyStack.push(new MyStack<Integer>());
/*
MyStackUsee.java:27: error: incompatible types: MyStack<String> cannot be converted to MyStack<Integer>
	bMyStack.push(new MyStack<String>());
*/
        aMyStack.push(new MyStack() ); // wil not compile

        while ( ! aMyStack.isEmpty() )	{
            System.out.println(aMyStack.pop());
        }
        while ( ! bMyStack.isEmpty() )	{
            System.out.println(bMyStack.pop());
        }
    }
    public static void main(String args[] )	{
//         testString();
        // testInteger();
        testMyStack();
    }
}


