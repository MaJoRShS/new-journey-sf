package br.com.dt_itau.newjourneysf.controllers.presenters;

import br.com.dt_itau.newjourneysf.models.Category;
import br.com.dt_itau.newjourneysf.models.Product;

public class ProductPresenter {

    private String name;
    private String description;
    private Double price;
    private String imgUrl;
    private Category categories;

    public ProductPresenter(Product product) {
        if (product != null) {
            this.name = product.getName();
            this.description = product.getDescription();
            this.price = product.getPrice();
            this.imgUrl = product.getImgUrl();
            this.categories = product.getCategories();

        }
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

}
