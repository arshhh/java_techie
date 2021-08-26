package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args){
        List l= new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        Iterator i = l.iterator();
        System.out.println();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.hasNext());
    }
}
