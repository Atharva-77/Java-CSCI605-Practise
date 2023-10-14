
import java.util.Vector;

class MyStack1<T> {
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

class MyStack2<T> extends MyStack1<T>{
}

public class MyStackUsee {

    public static void testMyStack()	{
        MyStack1<MyStack1> aMyStack = new MyStack1<MyStack1>();
        MyStack1  aMyStackObject  = new MyStack1();
        MyStack2 aMyStackObject2 = new MyStack2();

        aMyStack.push(aMyStackObject);
        aMyStack.push(aMyStackObject2);

// 	aMyStack.pop();aMyStack.pop();
//        aMyStackObject2 = aMyStack.pop();

        while ( ! aMyStack.isEmpty() )	{
            System.out.println(aMyStack.pop());
        }

    }
    public static void main(String args[] )	{

        testMyStack();
    }
}


