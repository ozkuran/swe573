package com.ozkuran.services;

import com.ozkuran.model.ProductType;
import com.ozkuran.repositories.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/19/2016.
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    private ProductTypeRepository packageTypeRepository;

    @Autowired
    public void setProductRepository(ProductTypeRepository packageTypeRepository) {
        this.packageTypeRepository = packageTypeRepository;
    }

    @Override
    public Iterable<ProductType> listAllProductType() {
        return packageTypeRepository.findAll();
    }

    @Override
    public ProductType getProductTypeById(Integer id) {
        return packageTypeRepository.findOne(id);
    }

    @Override
    public ProductType saveProductType(ProductType packageType) {
        return packageTypeRepository.save(packageType);
    }

    @Override
    public void deleteProductType(Integer id) {
        packageTypeRepository.delete(id);
    }
}
