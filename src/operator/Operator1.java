package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수
        int a =5;
        int b =2;

        //덧셈
        int sum = a+b;
        System.out.println("a + b = "+sum);

        //뺼셈
        int diff = a-b;
        System.out.println("a - b = "+diff);

        //곱셈
        int multi= a*b;
        System.out.println("a * b = "+multi);

        //나눗셈
        int div=a/b; //5/2 int 형이라 2만 출력
        System.out.println("a / b =" +div);

        //나머지
        int mod = a%b;
        System.out.println("a % b ="+ mod);
    }
}
