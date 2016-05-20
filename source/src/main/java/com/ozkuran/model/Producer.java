package com.ozkuran.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by MahmutAli on 5/19/2016.
 */
@Entity
public class Producer {

    @Id
    @GeneratedValue
    private int id;
    private String name;


    @OneToMany(mappedBy = "producer")
    private List<Product> products;


    @NotNull
    @NotEmpty
    private String photoURL;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    @Override
    public String toString() {
        return String.format(
                "Producer[id=%d, Name='%s']",
                id, name);
    }

}