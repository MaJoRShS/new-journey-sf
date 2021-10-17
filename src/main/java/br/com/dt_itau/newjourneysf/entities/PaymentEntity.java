package br.com.dt_itau.newjourneysf.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.dt_itau.newjourneysf.models.Order;
import br.com.dt_itau.newjourneysf.models.Payment;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "tb_payment")
public class PaymentEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @OneToOne
    @MapsId
    @JsonIgnore
    private Order order;


    public PaymentEntity(Long id, Instant moment, Order order) {
        this.id = id;
        this.moment = moment;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment toModel() {
        Payment payment = new Payment();
        payment.setId(this.id);
        payment.setOrder(getOrder());
        payment.setMoment(this.moment);

        return payment;
    }
}
