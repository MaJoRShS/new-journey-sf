package br.com.dt_itau.newjourneysf.models;

import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.entities.enums.OrderStatus;

import java.time.Instant;

public class Order {

    private Long id;
    private Instant moment;
    private UserEntity client;
    private OrderStatus orderStatus;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Instant getMoment() {
        return moment;
    }
    public void setMoment(Instant moment) {
        this.moment = moment;
    }
    public UserEntity getClient() {
        return client;
    }
    public void setClient(UserEntity client) {
        this.client = client;
    }
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

}

