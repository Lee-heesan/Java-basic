package java_start.scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("첫번쨰 숫자를 입력하시오: ");
        int num1 = sc.nextInt();

        System.out.print("두번쨰 숫자를 입력하시오: ");
        int num2 = sc.nextInt();

        int sum =num1 + num2;
        System.out.println("두 숫자의 합은 "+sum);
    }
}
