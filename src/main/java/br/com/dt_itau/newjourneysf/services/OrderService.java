package br.com.dt_itau.newjourneysf.services;
import br.com.dt_itau.newjourneysf.models.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrdersAll();
    Order getOrdersById(Long id);


}
