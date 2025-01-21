package java_start.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("문자열을 입력하시오: ");
        String str =sc.nextLine();
        System.out.println("입력한 문자열은 "+ str);

        System.out.print("정수를 입력하시오 : ");
        int intValue =sc.nextInt();
        System.out.println("입력한 정수는 "+intValue);
    }
}
