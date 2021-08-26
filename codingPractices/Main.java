package codingPractices;

import java.util.Scanner;

class Test{
    public int a;

    public Test() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

//        Scanner b = new Scanner(System.in);
//        int x = b.nextInt();
//        System.out.println(System.getProperties());
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test[] test = new Test[]{t1,t2,t3};
        test[0].setA(1);
        test[1].setA(2);
        test[2].setA(3);
        t1 = null;
        t2 = null;
        System.out.println(t1 == t2);
        System.out.println(test.toString());
    }
} 
