package br.com.dt_itau.newjourneysf.controllers.parameters;

import br.com.dt_itau.newjourneysf.models.Category;
import br.com.dt_itau.newjourneysf.models.Product;

import java.io.Serializable;

public class ProductParameter implements Serializable {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
    private Category categories;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Category getCategories() {
        return categories;
    }

    public void setCategories(Category categories) {
        this.categories = categories;
    }

    public Product toModel(){
    Product product = new Product();
    product.setName(this.name);
    product.setDescription(this.description);
    product.setPrice(this.price);
    product.setImgUrl(this.imgUrl);
    setCategories(this.getCategories());

    return product;
    }
}
