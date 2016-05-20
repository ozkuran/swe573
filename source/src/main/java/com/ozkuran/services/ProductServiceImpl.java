package com.ozkuran.services;

import com.ozkuran.model.Product;
import com.ozkuran.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/19/2016.
 */
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    private static final int PRODUCT_PAGE_SIZE = 4;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Page<Product> getLatestProducts(){
        PageRequest pageRequest = new PageRequest(0, PRODUCT_PAGE_SIZE, Sort.Direction.DESC, "id");
        return productRepository.findAll(pageRequest);
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.delete(id);
    }
}