package br.com.dt_itau.newjourneysf.services.impl;



import br.com.dt_itau.newjourneysf.entities.CategoryEntity;
import br.com.dt_itau.newjourneysf.entities.ProductEntity;
import br.com.dt_itau.newjourneysf.models.Category;
import br.com.dt_itau.newjourneysf.models.Product;
import br.com.dt_itau.newjourneysf.repositories.ProductRepository;
import br.com.dt_itau.newjourneysf.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProductsdAll() {
        return this.productRepository.findAll().stream().map(ProductEntity::toModel).collect(Collectors.toList());
    }

    @Override
    public Product getProductsById(Long id) {
        var productById = productRepository.findById(id);
        productById.get();
        return productById.get().toModel();
    }

}

