package java_start.array;

public class ArrayDi0 {
    public static void main(String[] args) {
        //2x3 2차원
        int [][] arr = new int [2][3];

        arr[0][0] =1;
        arr[0][1] =2;
        arr[0][2] =3;
        arr[1][0] =4;
        arr[1][1] =5;
        arr[1][2] =6;

        for(int i=0; i<3; i++){
            System.out.print(arr[0][i]+" ");
        }
        System.out.println();
        for(int i=0; i<3; i++){
            System.out.print(arr[1][i]+" ");
        }
    }
}
