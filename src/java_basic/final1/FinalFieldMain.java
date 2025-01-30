package java_basic.final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 =new ConstructInit(10);
        ConstructInit constructInit2 =new ConstructInit(20);

        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        System.out.println(fieldInit1.value);

        System.out.println(fieldInit1.CONST_VALUE);
    }
}
