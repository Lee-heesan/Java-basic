package java_mid_2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    //기본 capacity
    static final int DEFAULT_INITIAL_CAPACITY=16;
    private LinkedList<Object> [] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    public MyHashSetV2(){
        initBuckets();
    }
    public MyHashSetV2(int capacity){
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if(bucket.contains(value)){
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }


    public boolean contains(Object searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
//        for(Object object : bucket) {
//            if (object.equals(searchValue)) {
//                return true;
//            }
//        }
        return bucket.contains(searchValue);
    }

    public boolean remove(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
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
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }


}
