package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수가 0이면 종료, 첫번쨰 두번쨰 숫자 입력시 더함");

        while(true){
            System.out.print("첫번쨰 숫자를 입력하시오");
            int A =sc.nextInt();
            System.out.print("두번쨰 숫자를 입력하시오");
            int B= sc.nextInt();

            if(A==0 && B==0){
                break;
            }

            int sum = A+B;
            System.out.println("숫자합은"+ sum);
        }
    }
}
