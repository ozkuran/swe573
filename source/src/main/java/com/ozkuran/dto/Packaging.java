package com.ozkuran.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by MahmutAli on 5/16/2016.
 */

@Entity
public class Packaging {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "packaging")
    private List<Product> products;

    protected Packaging(){}

    public Packaging(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Packaging[id=%d, Name='%s']",
                id, name);
    }
}
