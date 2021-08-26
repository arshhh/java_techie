package codingPractices;

class Generics<T> {
    T a;

    public Generics(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }
}
public class GenericsTest {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<>(10);
        Generics<String> g2 = new Generics<>("hello");

    }
}
