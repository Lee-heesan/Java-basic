package java_mid_1.exception.basic.unchecked;

import java_mid_1.exception.basic.checked.Service;

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
