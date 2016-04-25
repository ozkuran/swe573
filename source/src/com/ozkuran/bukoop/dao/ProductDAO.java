package com.ozkuran.bukoop.dao;

import com.ozkuran.bukoop.model.ProductVO;

import java.util.List;

/**
 * Created by maozkuran on 25/04/16.
 */
public interface ProductDAO {

    public interface EmployeeDAO
    {
        public List<ProductVO> getAllProducts();
    }
}
