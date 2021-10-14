package br.com.dt_itau.newjourneysf.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.dt_itau.newjourneysf.models.Category;
import br.com.dt_itau.newjourneysf.models.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_category")
public class CategoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private final Set<ProductEntity> product = new HashSet<>();

    public CategoryEntity() {
    }

    public CategoryEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Set<ProductEntity> getProducts() {
        return product;
    }

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


    public Category toModel(){
        Category category = new Category();
        category.setId(this.id);
        category.setName(this.name);

        return category;

    }
}

