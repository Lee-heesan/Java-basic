package static2;

public class DecoData {
    
    private int instanceValue;
    private static int staticValue;
    
    public static void staticCall(){
        //instanceValue++;
        //instanceMethod();
        staticValue++; //정적 변수 접근
        staticMethod();//정적메소드 호출
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++; //정적 변수 접근
        staticMethod();//정적메소드 호출
    }
    
    private void instanceMethod(){
        System.out.println("instanceValue= "+ instanceValue);
    }
    
    private static void staticMethod(){
        System.out.println("staticMethod= "+staticValue);
    }
}
