package com.ozkuran.dto;

import javax.persistence.*;

/**
 * Created by MahmutAli on 5/15/2016.
 */

@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne
    private ProductType productType;

    @ManyToOne
    private Packaging packaging;

    @ManyToOne
    private Producer producer;

    public Product(){
    }

    public Product(String name, ProductType productType, Packaging packaging, Producer producer){
        this.name = name;
        this.productType = productType;
        this.packaging = packaging;
        this.producer = producer;
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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, Name='%s']",
                id, name);
    }
}
