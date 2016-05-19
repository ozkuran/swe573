package com.ozkuran.services;

import com.ozkuran.model.PackageType;


/**
 * Created by MahmutAli on 5/19/2016.
 */
public interface PackageTypeService {
    Iterable<PackageType> listAllPackageTypes();

    PackageType getPackageTypeById(Integer id);

    PackageType savePackageType(PackageType packageType);

    void deletePackageType(Integer id);
}
