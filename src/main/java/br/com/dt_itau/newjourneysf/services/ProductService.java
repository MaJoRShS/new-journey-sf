package br.com.dt_itau.newjourneysf.services;

import br.com.dt_itau.newjourneysf.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductsAll();
    Product getProductsById(Long id);


}
