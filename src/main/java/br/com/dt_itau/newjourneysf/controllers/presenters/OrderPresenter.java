package br.com.dt_itau.newjourneysf.controllers.presenters;

import br.com.dt_itau.newjourneysf.entities.enums.OrderStatus;
import br.com.dt_itau.newjourneysf.models.Order;

import java.time.Instant;

public class OrderPresenter {

    private Instant moment;
    private UserPresenter client;
    private OrderStatus orderStatus;

    public OrderPresenter(Order order) {
        if (order != null) {
            this.moment = order.getMoment();
            this.client = new UserPresenter(order.getClient());
            this.orderStatus = order.getOrderStatus();
        }

    }

    public UserPresenter getClient() {
        return client;
    }

    public void setClient(UserPresenter client) {
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

