package java_mid_2.collection.set.test;

import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>();

        for(Integer s : inputArr){
            set.add(s);
        }

        for(Integer s : set){
            System.out.println(s);
        }
    }
}
