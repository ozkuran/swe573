package com.ozkuran.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Entity
public class PackageType {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "packageType")
    private List<Product> products;

    public PackageType(){}

    public PackageType(String name){
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
                "PackageType[id=%d, Name='%s']",
                id, name);
    }
}
