package java_mid_2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E>{
    //기본 capacity
    static final int DEFAULT_INITIAL_CAPACITY=16;
    private LinkedList<E> [] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    public MyHashSetV3(){
        initBuckets();
    }
    public MyHashSetV3(int capacity){
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if(bucket.contains(value)){
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }


    public boolean contains(E searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
//        for(Object object : bucket) {
//            if (object.equals(searchValue)) {
//                return true;
//            }
//        }
        return bucket.contains(searchValue);
    }

    public boolean remove(E value){
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        //주의 !!! 값으로 지우려고 하면 래퍼런스 타입(Integer) 라 변환해야함.
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        }
        else {
            return false;
        }
    }


    private int hashIndex(Object value) {
        //음수가 나올 수 있음
        int hashCode = value.hashCode();
        int hashIndex = Math.abs(hashCode)%capacity;
        return hashIndex;
    }


    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }


}
