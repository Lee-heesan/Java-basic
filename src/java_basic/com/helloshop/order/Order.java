package java_basic.com.helloshop.order;

import java_basic.com.helloshop.product.Product;
import java_basic.com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
