package com.ozkuran.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Entity
public class ProductType {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "productType")
    private List<Product> products;

    public ProductType(){}

    public ProductType(String name){
        this.name = name;
    }

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


    @Override
    public String toString() {
        return String.format(
                "ProductType[id=%d, Name='%s']",
                id, name);
    }
}
