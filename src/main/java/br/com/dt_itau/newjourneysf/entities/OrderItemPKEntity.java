package br.com.dt_itau.newjourneysf.entities;

import br.com.dt_itau.newjourneysf.models.Order;
import br.com.dt_itau.newjourneysf.models.OrderItem;
import br.com.dt_itau.newjourneysf.models.OrderItemPK;
import br.com.dt_itau.newjourneysf.models.Product;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class OrderItemPKEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
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

    public OrderItemPK toModel(){
        OrderItemPK orderItemPk = new OrderItemPK();
        orderItemPk.setOrder(this.order);
        orderItemPk.setProduct(this.product);

        return orderItemPk;

    }
}