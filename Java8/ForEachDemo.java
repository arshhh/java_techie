package Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);

        Iterator i = l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        l.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("inside for each:"+integer);
            }
        });

        MyConsumer m = new MyConsumer();
        l.forEach(m);
    }
}

class MyConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println("In other class iterator:"+integer);
    }
}
