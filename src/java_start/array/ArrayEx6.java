package java_start.array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요 : ");
        
        int n = sc.nextInt();
        int []num = new int [n];

        System.out.println(n + " 개의 정수를 입력하세요 : ");
        for(int i =0; i<n ; i++){
            num[i]=sc.nextInt();
        }
        int min=num[0], max=num[0];
        
        for(int i =1 ; i<n ; i++){
            if(min>num[i]){
                min=num[i];
            }
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
