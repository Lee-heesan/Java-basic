package java_mid_2.collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String [] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //배열의 첫번째 위치에 추가
        //기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newvalue = 3;
        addFirst(arr,newvalue);
        System.out.println(Arrays.toString(arr));


        //index 위치에 추가
        //기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));


        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static void addFirst(int [] arr, int value){
        for (int i = arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0]=value;
    }


    public static void addAtIndex(int [] arr, int index, int value){
        for(int i = arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }

    public static void addLast(int [] arr, int value){
        arr[arr.length-1]=value;
    }

}
