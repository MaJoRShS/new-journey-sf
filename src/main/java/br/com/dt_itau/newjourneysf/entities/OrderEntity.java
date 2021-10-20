package br.com.dt_itau.newjourneysf.entities;

import br.com.dt_itau.newjourneysf.entities.enums.OrderStatus;
import br.com.dt_itau.newjourneysf.models.Order;
import br.com.dt_itau.newjourneysf.models.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "tb_order")
public class OrderEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private UserEntity client;

//    @OneToMany(mappedBy = "id.order")
//    private Set<OrderItem> items = new HashSet<>();
//
//    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
//    private Payment payment;

    public OrderEntity() {
    }

    public OrderEntity(Long id, Instant moment, OrderStatus orderStatus, UserEntity client) {
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }

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

//    public OrderStatus getOrderStatus() {
//        return OrderStatus.valueOf(orderStatus);
//    }
//
//    public void setOrderStatus(OrderStatus orderStatus) {
//        if (orderStatus != null) {
//            this.orderStatus = orderStatus.getCode();
//        }
//    }


    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public UserEntity getClient() {
        return client;
    }

    public void setClient(UserEntity client) {
        this.client = client;
    }

//    public Payment getPayment() {
//        return payment;
//    }
//
//    public void setPayment(Payment payment) {
//        this.payment = payment;
//    }
//
//    public Set<OrderItem> getItems() {
//        return items;
//    }


//    public Double getTotal() {
//        double sum = 0.0;
//        for (OrderItem x : items) {
//            sum += x.getSubTotal();
//        }
//        return sum;
//    }

    public Order toModel() {
        Order order = new Order();
        order.setId(this.id);
        order.setMoment(this.moment);
        order.setOrderStatus(getOrderStatus());
        order.setClient(this.client.toModel());

        return order;
    }
}

