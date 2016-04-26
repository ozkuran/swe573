package com.ozkuran.bukoop.service;


import java.util.List;

import com.ozkuran.bukoop.dao.ProductDAO;
import com.ozkuran.bukoop.model.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by maozkuran on 26/04/16.
 */
@Service
public class ProductManagerImpl implements ProductManager{

    @Autowired
    ProductDAO dao;

    public List<ProductVO> getAllProducts()
    {
        return dao.getAllProducts();
    }
}


