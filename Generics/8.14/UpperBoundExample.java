import java.util.LinkedList;
import java.util.List;
public class UpperBoundExample<T> {

    T theThing;

    public UpperBoundExample(T theThing)  {
        this.theThing = theThing;
    }

    public static void main(String[] args)	{
        // UpperBoundExample<Square> aSquare = new UpperBoundExample<Square>(new Square());
        UpperBoundExample<Cube>   aCube   = new UpperBoundExample<Cube>(new Cube());
        UpperBoundExample<Brick>  aBrick  = new UpperBoundExample<Brick>(new Brick());

        // linked list op UpperBoundExample->Brick
        List<UpperBoundExample<Brick>> aList = new LinkedList<UpperBoundExample<Brick>>();
        // linked list op UpperBoundExample->Square
        List<UpperBoundExample<Cube>> bList = new LinkedList<UpperBoundExample<Cube>>();

        List<UpperBoundExample<? super Cube>> cList = new LinkedList<UpperBoundExample<? super Cube>>();
        List<UpperBoundExample<? extends Cube>> dList = new LinkedList<UpperBoundExample<? extends Cube>>();


        aList.add( new UpperBoundExample<Brick>(new Brick() ) );
        aList.add( new UpperBoundExample(new Cube() ) );
        aList.add( new UpperBoundExample(new Square() ) );


        bList.add( new UpperBoundExample<Cube>(new Cube() ) );
        // cList.add( new UpperBoundExample<Square>(new Square() ) );
        // cList.add( new UpperBoundExample<Brick>(new Brick() ) );
        cList.add( new UpperBoundExample(new Cube() ) );
        cList.add( new UpperBoundExample(new Brick() ) );
        cList.add( new UpperBoundExample(new Square() ) );

        dList.add( new UpperBoundExample(new Cube() ) );
        dList.add( new UpperBoundExample(new Brick() ) );
        dList.add( new UpperBoundExample(new Square() ) );

        for(UpperBoundExample i: cList){
            System.out.println(i);
        }
        // UpperBoundExample<Square>  qSquare  = new UpperBoundExample<Square>(new Square());
	    
/*
	    cList.add( new UpperBoundExample<Square>(new Suare() ) );
UpperBoundExample.java:26: error: incompatible types: UpperBoundExample<Square> cannot be converted to UpperBoundExample<? extends Cube>
	    cList.add( new UpperBoundExample<Square>(new Suare() ) );
	               ^
*/

    }
}

class Area { }
class Square extends Area { }
class Cube extends Square { }
class Brick extends Cube { }
class ExpensiveBrick extends Brick { }
 
 
 
 
 