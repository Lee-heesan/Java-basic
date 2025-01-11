package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        payService.processPay("kakao",5000);
        payService.processPay("naver",10000);
        payService.processPay("bad",15000);
        payService.processPay("new",20000);
    }
}
