package generic.ex1;

public class BoxMain3 {

    public static void main(String [] args){
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        //integerBox.set("100"); //  Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); //Integer 타입 변환(캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("문자 100");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(13.5);
        Double D = doubleBox.get();
        System.out.println("D = " + D);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2  = new GenericBox<>();
    }
}
