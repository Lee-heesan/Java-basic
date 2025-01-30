package java_mid_1.exception.basic.unchecked;

import java_mid_1.exception.basic.checked.Service;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        //service.callThrow();
        System.out.println("정상 종료");
    }
}
