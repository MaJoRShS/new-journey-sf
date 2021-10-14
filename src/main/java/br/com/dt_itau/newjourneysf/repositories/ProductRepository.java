package br.com.dt_itau.newjourneysf.repositories;

import br.com.dt_itau.newjourneysf.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}