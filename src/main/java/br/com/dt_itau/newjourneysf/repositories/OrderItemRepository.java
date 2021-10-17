package br.com.dt_itau.newjourneysf.repositories;

import br.com.dt_itau.newjourneysf.entities.OrderItemEntity;
import br.com.dt_itau.newjourneysf.entities.OrderItemPKEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, OrderItemPKEntity> {
}