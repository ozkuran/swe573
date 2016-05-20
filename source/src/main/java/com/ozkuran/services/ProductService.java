package com.ozkuran.services;

import com.ozkuran.model.Product;
import org.springframework.data.domain.Page;

/**
 * Created by MahmutAli on 5/19/2016.
 */

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

    Page<Product> getLatestProducts();
}