package com.ozkuran.repository;

import com.ozkuran.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MahmutAli on 5/15/2016.
 */

@Repository
public interface ProductRepository {

    List<Product> getAllProducts();
}
