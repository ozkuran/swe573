package com.ozkuran.repository;

import com.ozkuran.dto.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by MahmutAli on 5/15/2016.
 */

@Repository
public interface ProductRepository extends BaseRepository<Product, Long>
{

}
