package Collections.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        Employee e1 = new Employee("arsh", new StringBuffer("110"));
        Employee e2 = new Employee("arsh",new StringBuffer("101"));
        Employee e3 = new Employee("arsh",new StringBuffer("109"));
        Employee e4 = new Employee("arsh",new StringBuffer("102"));
        TreeSet<Employee> ts = new TreeSet();
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        System.out.println(ts);

    }
}
class Employee implements Comparable{
    StringBuffer id;
    String name;
    Employee(String name,StringBuffer id){
        this.name=name;
        this.id= id;
    }

    public String toString(){
        return ("name:"+this.name+" id:" + this.id);
    }

    @Override
    public int compareTo(Object o) {
        String id1 = this.id.toString();
        String id2 = ((Employee)o).id.toString();
        return id1.compareTo(id2);

    }
}

class Employee2 implements Comparator{

    StringBuffer id;
    StringBuffer name;
    Employee2(StringBuffer name,StringBuffer id){
        this.name=name;
        this.id= id;
    }

    public String toString(){
        return ("name:"+this.name+" id:" + this.id);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
