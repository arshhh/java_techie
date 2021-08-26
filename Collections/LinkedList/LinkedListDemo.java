package Collections.LinkedList;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;

class LinkedlistTest{
    Node head;

    public void add(LinkedlistTest list, int data){
        Node node = new Node(data);
        if(list.head == null){
            list.head = node;
        }
        else{
            Node curr = list.head;
            while( curr.next!=null){
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public void deleteLast(LinkedlistTest list){
        Node curr = list.head;
        if(curr.next == null){
            curr = null;
        }
        else{
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    public void printList(LinkedlistTest list){
        Node curr = list.head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

public class LinkedListDemo {
    public static void main(String[] args){

        LinkedList l = new LinkedList();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        ListIterator li = l.listIterator();
        System.out.println(li.next());
        System.out.println(li.previous());
//        System.out.println(li.hasNext());
        li.remove();
        System.out.println(l);

//        LinkedlistTest list = new LinkedlistTest();
//        list.add(list, 10);
//        list.add(list,20);
//        list.add(list, 30);
//        list.printList(list);
//        list.deleteLast(list);
//        list.printList(list);
    }

}
class Node{
    int data;
    Node next;
    Node(){
        this.next= null;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
