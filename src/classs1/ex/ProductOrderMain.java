package classs1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder []productOrder = new ProductOrder[2];

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName="상품1";
        productOrder1.price=9900;
        productOrder1.quantity=3;
        productOrder[0]=productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName="상품2";
        productOrder2.price=19900;
        productOrder2.quantity=4;
        productOrder[1]=productOrder2;

        int totalPrice =0 ;
        for(ProductOrder i :productOrder){
            System.out.println(i.productName +"의 가격은 " + i.price + " 갯수는" + i.quantity);
            totalPrice +=(i.price*i.quantity);
        }
        System.out.println("총합 가격은 "+ totalPrice);
    }
}
