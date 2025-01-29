package java_mid_2.collection.set.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
//        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));
        Set<Integer> set = new LinkedHashSet<>();

        for(Integer s : inputArr){
            set.add(s);
        }

        for(Integer s : set){
            System.out.println(s);
        }
    }
}
