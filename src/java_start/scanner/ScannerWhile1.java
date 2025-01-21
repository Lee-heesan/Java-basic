package java_start.scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        while(true){
            System.out.print("문자열을 입력하시오(exit 종료): ");
            String str = sc.nextLine();

            if(str.equals("exit")){
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println("입력한 문자열 :" + str);
        }
    }
}
