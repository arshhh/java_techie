package codingPractices;

import java.io.*;

public class SerializationDemo implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestDemo t = new TestDemo();
        FileOutputStream fos = new FileOutputStream("out.ser");
        ObjectOutputStream o= new ObjectOutputStream(fos);
        o.writeObject(t);

        FileInputStream fis = new FileInputStream("out.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestDemo td= (TestDemo)ois.readObject();
        System.out.println(td.m1());
        System.out.println(td.i+"  ...  " + td.j);
    }
}

class TestDemo implements Serializable{
    transient int i=10;
    final transient int j=20;
    public String m1(){
        return "hello";
    }
}
