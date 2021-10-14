package br.com.dt_itau.newjourneysf.services;
import br.com.dt_itau.newjourneysf.models.Product;
import br.com.dt_itau.newjourneysf.models.User;

import java.util.List;

public interface ProductService {

    public List<Product> getProductsdAll();
    public Product getProductsById(Long id);


}
