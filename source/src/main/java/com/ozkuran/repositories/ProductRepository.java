package com.ozkuran.repositories;

import com.ozkuran.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by MahmutAli on 5/19/2016.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}