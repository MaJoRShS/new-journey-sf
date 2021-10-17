package br.com.dt_itau.newjourneysf.models;

import br.com.dt_itau.newjourneysf.entities.CategoryEntity;

import java.io.Serializable;

public class Category implements Serializable {

    private Long id;
    private String name;

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

}
