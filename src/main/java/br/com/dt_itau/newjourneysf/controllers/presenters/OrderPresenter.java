package br.com.dt_itau.newjourneysf.controllers.presenters;

import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.entities.enums.OrderStatus;
import br.com.dt_itau.newjourneysf.models.Order;

import java.time.Instant;

public class OrderPresenter {

    private Instant moment;
    private UserEntity client;
    private OrderStatus orderStatus;

    public OrderPresenter(Order order) {
        if (order != null) {
            this.moment = order.getMoment();
            this.client = order.getClient();
            this.orderStatus = order.getOrderStatus();
        }

    }

    public UserEntity getClient() {
        return client;
    }

    public void setClient(UserEntity client) {
        this.client = client;
    }
    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}

