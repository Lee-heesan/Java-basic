package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    static List<Integer> list;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        list = new ArrayList<>();
        int n = sc.nextInt();
        while(n!=0){
            list.add(n);
            n=sc.nextInt();
        }

        sb.append("출력").append("\n");
        for (int i = 0; i < list.size(); i++) {
            if(list.size()-1==i){
                sb.append(list.get(i));
                break;
            }
            sb.append(list.get(i)+", ");
        }

        System.out.println(sb.toString());
    }
}
