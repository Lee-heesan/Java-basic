package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명:" + item.getName() + ", 합계:" +
                    item.getTotalPrice());
        }

        System.out.print("전체 가격 합:");
        int total=0;
        for(int i =0; i<items.size();i++){
            total += items.get(i).getTotalPrice();
        }
        System.out.print(total);
    }
}
