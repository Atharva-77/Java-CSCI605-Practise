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

        List<UpperBoundExample<? extends Cube>> cList = new LinkedList<UpperBoundExample<? extends Cube>>();

        // aList.add(new UpperBoundExample<Cube>(new Cube()));
        // aList.add(new UpperBoundExample<Brick>(new Cube()));
        // aList.add(new UpperBoundExample(new Cube()));
        aList.add(new UpperBoundExample(new Brick()));



        // cList.add( new UpperBoundExample(new Cube() ) );
        // cList.add( new UpperBoundExample(new Brick() ) );
        // cList.add( new UpperBoundExample(new Square() ) );


        for(UpperBoundExample i: aList){
            System.out.println(i);
        }

    }
}

class Area { }
class Square extends Area { }
class Cube extends Square { }
class Brick extends Cube { }
class ExpensiveBrick extends Brick { }
 
 
 
 
 