package java_mid_2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);

        int total = 0;
        for(int i :list){
            total += i;
        }

        double avg = (double) total/list.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}
