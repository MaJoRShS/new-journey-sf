package br.com.dt_itau.newjourneysf.controllers;

import br.com.dt_itau.newjourneysf.controllers.presenters.OrderPresenter;
import br.com.dt_itau.newjourneysf.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderPresenter>> findAll() {
        var response = this.orderService.getOrdersAll();
        if (response == null || response.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(response.stream().map(OrderPresenter::new)
                .collect(Collectors.toList()), HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderPresenter> findById(@PathVariable Long id) {
        var response = this.orderService.getOrdersById(id);
        return new ResponseEntity<>(new OrderPresenter(response), HttpStatus.OK);
    }
}
