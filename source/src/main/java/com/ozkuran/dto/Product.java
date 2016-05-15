package com.ozkuran.dto;

import javax.persistence.*;

/**
 * Created by MahmutAli on 5/15/2016.
 */

@Entity
@Table(name = "products", schema = "bukoop", catalog = "")
public class Product {
    private int id;
    private String name;
    private ProductType productType;
    private Integer unit;
    private Integer producer;
    private Integer packageType;


    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "productType", nullable = true)
    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "unit", nullable = true)
    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "producer", nullable = true)
    public Integer getProducer() {
        return producer;
    }

    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    @Basic
    @Column(name = "packageType", nullable = true)
    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (productType != null ? !productType.equals(that.productType) : that.productType != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (producer != null ? !producer.equals(that.producer) : that.producer != null) return false;
        if (packageType != null ? !packageType.equals(that.packageType) : that.packageType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (packageType != null ? packageType.hashCode() : 0);
        return result;
    }

}
