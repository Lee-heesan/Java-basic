package java_start.operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a= 1;
        int b= 0;

        b= ++a;
        System.out.print("a = " + a);
        System.out.println(" b = " + b);

        a= 1;
        b= 0;

        b= a++;
        System.out.print("a = " + a);
        System.out.println(" b = " + b);
    }
}
