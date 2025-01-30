package java_mid_1.lang.enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price){
        return price* grade.getDiscountPercent() /100;
    }
}
