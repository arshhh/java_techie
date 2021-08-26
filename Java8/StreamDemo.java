package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<10;i++){
            myList.add(i);
        }
        Stream<Integer> s = myList.stream().filter(p -> p < 7);
//        s.forEach(p -> System.out.println(p));

        Stream<Integer> s1 = myList.stream();
        Stream<Integer> s2 = myList.parallelStream();

        s1.filter(p -> p < 5).forEach(p -> System.out.println(p));

        myList.stream().filter(p-> p < 5).forEach(p-> System.out.println("hello"));
        myList.stream().forEach(p-> System.out.println("Test"));

    }
}
