import java.util.LinkedList;
import java.util.List;
public class UpperBoundExample<T> {

    T theThing;

    // System.out.println("==="+theThing);
    public UpperBoundExample(T theThing)  {
        this.theThing = theThing;
        System.out.println("==="+theThing.getClass());
    }

    public static void main(String[] args)	{
        // UpperBoundExample<Square> aSquare = new UpperBoundExample<Square>(new Square());
//        UpperBoundExample<Cube>   aCube   = new UpperBoundExample<Cube>(new Cube());
//        UpperBoundExample<Brick>  aBrick  = new UpperBoundExample<Brick>(new Brick());

        // linked list op UpperBoundExample->Brick
        List<UpperBoundExample<Brick>> aList = new LinkedList<UpperBoundExample<Brick>>();
        // linked list op UpperBoundExample->Square
        List<UpperBoundExample<Cube>> bList = new LinkedList<UpperBoundExample<Cube>>();

        // List<UpperBoundExample<? extends Cube>> cList = new LinkedList<UpperBoundExample<? extends Cube>>();

        // aList.add(new UpperBoundExample<Cube>(new Brick()));
        // aList.add(new UpperBoundExample<Brick>(new Cube()));
        // aList.add(new UpperBoundExample<Cube>(new Cube()));
        aList.add(new UpperBoundExample(new Cube()));
        UpperBoundExample<Brick> c = aList.get(0);
        // Brick b = c.theThing;
        // aList.add(new UpperBoundExample(new Brick()));
        // aList.add(new UpperBoundExample<Brick>(new Brick()));
        // UpperBoundExample<Brick> c = aList.get(0);

        // cList.add( new UpperBoundExample<Area>(new Area() ) );
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
class Brick { int i; }
class ExpensiveBrick extends Brick { }
 
 
 
 
 