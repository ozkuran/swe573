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
public class Producer {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(mappedBy = "producer")
    private List<Product> products;

    protected Producer(){}

    public Producer(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Producer[id=%d, Name='%s']",
                id, name);
    }

}
