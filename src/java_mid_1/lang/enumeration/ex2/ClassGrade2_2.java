package java_mid_1.lang.enumeration.ex2;

public class ClassGrade2_2 {
    public static void main(String[] args) {
        int price =10000;
        DiscountService discountService = new DiscountService();
        ClassGrade newClassGrade = new ClassGrade();
        int result = discountService.discount(newClassGrade,price);
        System.out.println("result = " + result);
    }
}
