package br.com.dt_itau.newjourneysf.services;

import br.com.dt_itau.newjourneysf.models.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategoryAll();
    Category getCategoryById(Long id);

}
