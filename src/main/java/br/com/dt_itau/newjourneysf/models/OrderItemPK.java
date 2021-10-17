package br.com.dt_itau.newjourneysf.models;

import br.com.dt_itau.newjourneysf.entities.enums.OrderStatus;

import java.time.Instant;

public class OrderItemPK {

    private Order order;
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}