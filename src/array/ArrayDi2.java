package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        //2x3 2차원
        int [][] arr = new int [2][3];

        arr[0][0] =1;
        arr[0][1] =2;
        arr[0][2] =3;
        arr[1][0] =4;
        arr[1][1] =5;
        arr[1][2] =6;

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
