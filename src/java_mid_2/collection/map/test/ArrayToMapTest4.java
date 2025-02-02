package java_mid_2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest4 {
    public static void main(String[] args) {
        String [][] productArr =  {{"Java", "10000"}, {"Spring", "20000"},{"JPA", "30000"}};
        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, Integer> map = new HashMap<>();
        for(String [] product : productArr){
            String key = product[0];
            String value = product[1];

            map.put(key,Integer.valueOf(value));
        }
        // Map의 모든 데이터 출력  - 코드 작성
        for (String key : map.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + map.get(key));
        }
    }
}
