package com.ozkuran.dto;

import javax.persistence.*;
import java.util.List;

/**
 * Created by maozkuran on 23/04/16.
 */
@Entity
public class ProductType {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "productType")
    private List<Product> products;

    public ProductType(){
    }

    public ProductType(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "ProductType[id=%d, Name='%s']",
                id, name);
    }
}
