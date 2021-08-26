package Collections.Utils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayDemo{
    public static void main(String[] s){
        int[] a = {10,1,8,3,6,4,5};
        System.out.println(a);
        Arrays.sort(a);
        List l = Arrays.asList(a);
        System.out.println(l);
        Iterator i = l.iterator();
        System.out.println(i.next());


    }
}
