package OOPS;

class test{
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        System.out.println("test1");
    }
}

class ChildTest extends test{
    public void test3(){
        System.out.println("test3");
    }

    public void test4(){
        System.out.println("test4");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        ChildTest t = new ChildTest();
        t.test1();
        t.test2();
        t.test3();
        t.test4();
    }
}
