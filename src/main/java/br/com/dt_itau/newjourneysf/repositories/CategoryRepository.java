package br.com.dt_itau.newjourneysf.repositories;

import br.com.dt_itau.newjourneysf.entities.CategoryEntity;
import br.com.dt_itau.newjourneysf.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@EnableJpaRepositories
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
}