package br.com.dt_itau.newjourneysf.controllers.parameters;

import br.com.dt_itau.newjourneysf.models.Category;

import java.io.Serializable;

public class CategoryParameter implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category toModel(){
        Category category = new Category();
        category.setName(this.name);

        return category;
    }
}
