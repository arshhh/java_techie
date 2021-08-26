package OOPS;

class PolyTest{
    public static void testMethod(){
        System.out.println("Parent Method");
    }
}
class PolyClass extends PolyTest{

    public static void testMethod() {
        System.out.println("Method over-riding");
    }
    public void testMethod(String s1){
        System.out.println("Method over-loading");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        PolyClass t = new PolyClass();
        PolyTest parent = new PolyClass();
        t.testMethod();
        t.testMethod("hello");
        System.out.println("------");
        parent.testMethod();
    }
}
