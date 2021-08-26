package Collections.ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){
        ArrayList<String> al= new ArrayList<String>(15);
        al.add("hello");
        al.add(0,"one");
        System.out.println(al.get(0));
    }
}
