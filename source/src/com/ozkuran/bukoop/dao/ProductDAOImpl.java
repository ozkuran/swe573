package com.ozkuran.bukoop.dao;

import com.ozkuran.bukoop.model.ProductVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maozkuran on 25/04/16.
 */
@Repository
public class ProductDAOImpl implements ProductDAO {


    public List<ProductVO> getAllProducts()
    {
        List<ProductVO> products = new ArrayList<ProductVO>();

// Create Loader From Database

        return products;
    }
}
