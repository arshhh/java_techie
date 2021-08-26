package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class ArraySegment {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>(10);
//        System.out.println(a);
        a.add(10);
        a.add(5);
        a.add(3);
        a.add(8);
        a.add(7);
        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
//        a.set(3, a.get(3)+1);
//        Collections.sort(a);
        System.out.println(a);


//        int x = 3;
//        int k = 3;
//        System.out.println(iskeyPresent(a,x,k));
//    }
//
//    private static boolean iskeyPresent(ArrayList a, int x, int k) {
//        int z = (a.size()-1) / k;
//        int y = 0;
//        while(z != 0){
//            if(!a.subList(y,y+k).contains(x)){
//                return false;
//            }
//            y=y+k;
//            z--;
//        }
//        if(!a.subList(y,a.size()-1).contains(x)){
//            return false;
//        }
//        return true;
    }

}
