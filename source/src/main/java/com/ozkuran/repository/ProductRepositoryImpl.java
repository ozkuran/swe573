package com.ozkuran.repository;

import com.ozkuran.dao.ProductDAO;
import com.ozkuran.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MahmutAli on 5/15/2016.
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository{

    @Autowired
    ProductDAO dao;

    public List<Product> getAllProducts()
    {
        return dao.getAllProducts();
    }

}
