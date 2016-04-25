package com.ozkuran.bukoop.model;

import java.io.Serializable;

/**
 * Created by maozkuran on 25/04/16.
 */
public class ProductVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    //Setters and Getters

    @Override
    public String toString() {
        return "ProductVO [id=" + id + ", name=" + name
                + "]";
    }
}
