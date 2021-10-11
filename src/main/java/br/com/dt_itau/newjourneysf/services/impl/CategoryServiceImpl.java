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
        List<Category> categoryList = this.categoryRepository.findAll().stream().map(r -> r.toModel()).collect(Collectors.toList());
        return categoryList;
    }


    public Category getCategoryById(Long id) {
        var categoryById = categoryRepository.findById(id);
        if (categoryById.get() != null) {
            return categoryById.get().toModel();
        }
         throw new NotFoundXeXe(id);
    }

}
