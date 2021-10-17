package br.com.dt_itau.newjourneysf.repositories;

import br.com.dt_itau.newjourneysf.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}