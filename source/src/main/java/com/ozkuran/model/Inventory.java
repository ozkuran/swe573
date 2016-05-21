package com.ozkuran.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by MahmutAli on 5/21/2016.
 */

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Product product;

    @NotEmpty
    private Date date;

    @NotNull
    @Min(0)
    private BigDecimal amount;

    @NotNull
    @Min(0)
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
