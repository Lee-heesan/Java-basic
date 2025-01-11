package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int sum =0;
        while(true){
            System.out.print("숫자를 입력하시오(입력하신 숫자를 다 더함)");
            int A = sc.nextInt();
            sum +=A;
            if(A==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
