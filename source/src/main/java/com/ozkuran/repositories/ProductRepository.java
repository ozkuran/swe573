package com.ozkuran.repositories;

import com.ozkuran.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}