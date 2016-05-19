package com.ozkuran.services;

import com.ozkuran.model.ProductType;

/**
 * Created by MahmutAli on 5/19/2016.
 */
public interface ProductTypeService {

    Iterable<ProductType> listAllProductType();

    ProductType getProductTypeById(Integer id);

    ProductType saveProductType(ProductType packageType);

    void deleteProductType(Integer id);
}
