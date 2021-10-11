package br.com.dt_itau.newjourneysf.services;

import br.com.dt_itau.newjourneysf.entities.CategoryEntity;
import br.com.dt_itau.newjourneysf.models.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> getCategoryAll();
    public Category getCategoryById(Long id);

}
