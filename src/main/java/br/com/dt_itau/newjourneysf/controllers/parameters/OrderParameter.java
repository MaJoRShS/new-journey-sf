package br.com.dt_itau.newjourneysf.controllers.parameters;

import br.com.dt_itau.newjourneysf.entities.enums.OrderStatus;
import br.com.dt_itau.newjourneysf.models.Order;

import java.time.Instant;

public class OrderParameter {

    private Instant moment;
    private OrderStatus orderStatus;

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

    public Order toModel(){
        Order order = new Order();
        order.setMoment(this.moment);
        setOrderStatus(this.getOrderStatus());

        return order;
    }
}
