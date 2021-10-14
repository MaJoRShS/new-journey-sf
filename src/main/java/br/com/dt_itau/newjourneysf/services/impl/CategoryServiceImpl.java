package br.com.dt_itau.newjourneysf.services.impl;


import br.com.dt_itau.newjourneysf.entities.CategoryEntity;
import br.com.dt_itau.newjourneysf.models.Category;
import br.com.dt_itau.newjourneysf.repositories.CategoryRepository;
import br.com.dt_itau.newjourneysf.services.CategoryService;
import br.com.dt_itau.newjourneysf.services.exceptions.NotFoundXeXe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> getCategoryAll() {
        return this.categoryRepository.findAll().stream().map(CategoryEntity::toModel).collect(Collectors.toList());
    }

    @Override
    public Category getCategoryById(Long id) {
        var categoryById = categoryRepository.findById(id);
        categoryById.get();
        return categoryById.get().toModel();
    }

}
