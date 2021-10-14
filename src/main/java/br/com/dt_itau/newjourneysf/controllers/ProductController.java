package br.com.dt_itau.newjourneysf.controllers;

import br.com.dt_itau.newjourneysf.controllers.presenters.CategoryPresenter;
import br.com.dt_itau.newjourneysf.controllers.presenters.ProductPresenter;
import br.com.dt_itau.newjourneysf.services.CategoryService;
import br.com.dt_itau.newjourneysf.services.ProductService;
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
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductPresenter>> finddAll() {
        var response = this.productService.getProductsdAll();
        if (response == null || response.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(response.stream().map(ProductPresenter::new).collect(Collectors.toList()), HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductPresenter> findById(@PathVariable Long id) {
        var response = this.productService.getProductsById(id);
        return new ResponseEntity<>(new ProductPresenter(response), HttpStatus.OK);
    }
}
