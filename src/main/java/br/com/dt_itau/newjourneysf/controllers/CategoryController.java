package br.com.dt_itau.newjourneysf.controllers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import br.com.dt_itau.newjourneysf.repositories.CategoryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import br.com.dt_itau.newjourneysf.controllers.presenters.CategoryPresenter;
import br.com.dt_itau.newjourneysf.entities.CategoryEntity;
import br.com.dt_itau.newjourneysf.models.Category;
import br.com.dt_itau.newjourneysf.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


//    HELLO WORLD
//    @GetMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

//    IMPLEMENTATION DEFAULT USING ONLY MODEL
//    @GetMapping
//    public ResponseEntity<List<Category>> findAll() {
//        List<Category> list = categoryService.getCategoryAll();
//        return ResponseEntity.ok().body(list);
//    }
//
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Category> findById(@PathVariable Long id) {
//        Category obj = categoryService.getCategoryById(id);
//        return ResponseEntity.ok().body(obj);
//    }


//    IMPLEMENTATION USING Presenter
    @GetMapping
    public ResponseEntity<List<CategoryPresenter>> findAll() {
        var response = this.categoryService.getCategoryAll();
        if (response == null || response.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(response.stream().map(s -> new CategoryPresenter(s))
                .collect(Collectors.toList()), HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryPresenter> findById(@PathVariable Long id) {
        var response = this.categoryService.getCategoryById(id);
        return new ResponseEntity<>(new CategoryPresenter(response), HttpStatus.OK);
    }
}
