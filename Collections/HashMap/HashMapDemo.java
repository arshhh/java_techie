package Collections.HashMap;

import java.util.Arrays;

class Entry<K,V>{
    public K key;
    public V value;
    Entry<K,V> next;

    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

}

class MyMap<K,V>{
    private Entry<K,V>[] buckets;
    private final static int INITIAL_CAPACITY = 1 << 4;

    public int getBucketSize() {
        return buckets.length;
    }

    private int size = 1;

    public MyMap() {
        this(INITIAL_CAPACITY);
    }

    public MyMap(int size) {
        this.buckets = new Entry[size];
    }

    public void put(K key, V value){
        Entry<K,V> entry = new Entry<K,V>(key, value, null);
        int bucket = (Integer) key % getBucketSize();

        Entry<K,V> existing= buckets[bucket];
        if(existing == null){
            buckets[bucket] = entry;
            size++;
        }
        else{
            while(existing.next != null){
                if(existing.key.equals(key)){
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }
            if(existing.key.equals(key)){
                existing.value = value;
            }
            else{
                existing.next = entry;
                size++;
            }
        }
    }

    public V get(K key){
        Entry<K,V> bucket = buckets[(Integer)key % getBucketSize()];
        while (bucket!=null){
            if(bucket.key.equals(key)){
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    public void remove(K key){
        Entry<K,V> bucket = buckets[(Integer)key % getBucketSize()];
        while( bucket != null){
            if(bucket.key.equals(key)){
                buckets[(Integer)key % getBucketSize()] = bucket.next;

                size--;
                break;
            }
            bucket = bucket.next;
        }
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
public class HashMapDemo {

    public static void main(String[] args) {
        MyMap<Integer, String> m = new MyMap<>();
        m.put(1,"hello");
        m.put(17,"parallel world");
        m.put(2,"world");
        System.out.println(m.get(1));
        System.out.println(m.get(17));
        System.out.println(m.toString());
        m.remove(1);
        System.out.println(m.toString());
        System.out.println(m.get(1));
        System.out.println(m.get(17));


    }
}
