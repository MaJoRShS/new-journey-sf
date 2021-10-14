package br.com.dt_itau.newjourneysf.services;
import br.com.dt_itau.newjourneysf.models.Order;
import br.com.dt_itau.newjourneysf.models.User;

import java.util.List;

public interface OrderService {

    public List<Order> getOrdersAll();
    public Order getOrdersById(Long id);


}
