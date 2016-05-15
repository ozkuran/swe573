package com.ozkuran.dao;

import com.ozkuran.dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MahmutAli on 5/15/2016.
 */
@Service
public class ProductDAOImpl implements  ProductDAO {


    public List<Product> getAllProducts()
    {
        List<Product> products = new ArrayList<Product>();

        // Create Loader From Database

        return products;
    }
}