package exception.basic.unchecked;

import exception.basic.checked.Service;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        //service.callThrow();
        System.out.println("정상 종료");
    }
}
