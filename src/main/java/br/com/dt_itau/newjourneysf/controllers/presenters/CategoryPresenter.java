package br.com.dt_itau.newjourneysf.controllers.presenters;

import br.com.dt_itau.newjourneysf.models.Category;

public class CategoryPresenter {

    private String name;

    public CategoryPresenter(Category category) {
        if (category != null) {
            this.name = category.getName();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
