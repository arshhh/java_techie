package Collections.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        Iterator e = s.iterator();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
