package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번쨰 정수를 입력하시오");
        int intValue1= sc.nextInt();

        System.out.print("두번쨰 정수를 입력하시오");
        int intValue2 =sc.nextInt();

        if(intValue1>intValue2){
            System.out.println(intValue1);
        }else if(intValue1==intValue2){
            System.out.println("같음");
        }else{
            System.out.println(intValue2);
        }
    }
}
