package br.com.dt_itau.newjourneysf.models;

import br.com.dt_itau.newjourneysf.entities.OrderItemPKEntity;
import br.com.dt_itau.newjourneysf.entities.enums.OrderStatus;

import java.time.Instant;

public class OrderItem {
    private OrderItemPK orderItemPK;
    private Integer quantity;
    private Double price;


    public OrderItemPK getOrderItemPK() {
        return orderItemPK;
    }

    public void setOrderItemPK(OrderItemPK orderItemPK) {
        this.orderItemPK = orderItemPK;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}