package com.ozkuran.services;

import com.ozkuran.model.PackageType;
import com.ozkuran.repositories.PackageTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Service
public class PackageTypeServiceImpl implements PackageTypeService {

    private PackageTypeRepository packageTypeRepository;

    @Autowired
    public void setPackageTypeRepository(PackageTypeRepository packagetypeRepository) {
        this.packageTypeRepository = packagetypeRepository;
    }

    @Override
    public Iterable<PackageType> listAllPackageTypes() {
        return packageTypeRepository.findAll();
    }

    @Override
    public PackageType getPackageTypeById(Integer id) {
        return packageTypeRepository.findOne(id);
    }

    @Override
    public PackageType savePackageType(PackageType packageType) {
        return packageTypeRepository.save(packageType);
    }

    @Override
    public void deletePackageType(Integer id) {
        packageTypeRepository.delete(id);
    }
}
