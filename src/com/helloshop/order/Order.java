package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) { //생성자 public이 붙어야 다른 패키지에서 Order를 불러올 수 있음
        this.user = user;
        this.product = product;
    }
}
