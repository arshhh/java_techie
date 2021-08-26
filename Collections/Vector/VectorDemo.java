package Collections.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        v.addElement(10);
        v.add(20);
        System.out.println(v);
        Enumeration e = v.elements();
        System.out.println(e.nextElement());
        System.out.println(e.nextElement());
        System.out.println(e.hasMoreElements());
    }
}
