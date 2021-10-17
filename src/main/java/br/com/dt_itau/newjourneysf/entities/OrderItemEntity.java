package br.com.dt_itau.newjourneysf.entities;

import br.com.dt_itau.newjourneysf.models.Order;
import br.com.dt_itau.newjourneysf.models.OrderItem;
import br.com.dt_itau.newjourneysf.models.OrderItemPK;
import br.com.dt_itau.newjourneysf.models.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_order_item")
public class OrderItemEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private final OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private Double price;

    public OrderItemEntity(Order order, Product products, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(products);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void SetProduct(Product product) {
        id.setProduct(product);
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

    public Double getSubTotal() {
        return price * quantity;
    }
    public OrderItem toModel(){
        OrderItem orderItem = new OrderItem();
        id.setOrder(id.getOrder());
        id.setProduct(id.getProduct());
        orderItem.setQuantity(this.quantity);
        orderItem.setPrice(this.price);


        return orderItem;
    }

}