package java_start.scope;

public class Scope1 {
    public static void main(String[] args) {
        int m =10;
        if(true){
            int x= 20;
            System.out.println("m = " + m);
            System.out.println("x = " + x);
        }
        System.out.println("m = " + m);
//        System.out.println("x = " + x);
    }
}
