package br.com.dt_itau.newjourneysf.services.impl;

import br.com.dt_itau.newjourneysf.entities.OrderEntity;
import br.com.dt_itau.newjourneysf.entities.UserEntity;
import br.com.dt_itau.newjourneysf.models.Order;
import br.com.dt_itau.newjourneysf.models.User;
import br.com.dt_itau.newjourneysf.repositories.OrderRepository;
import br.com.dt_itau.newjourneysf.repositories.UserRepository;
import br.com.dt_itau.newjourneysf.services.OrderService;
import br.com.dt_itau.newjourneysf.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrdersAll() {
        return this.orderRepository.findAll().stream().map(OrderEntity::toModel).collect(Collectors.toList());
    }

    @Override
    public Order getOrdersById(Long id) {
        var orderById = orderRepository.findById(id);
        orderById.get();
        return orderById.get().toModel();
    }

}

