package com.ozkuran.services;

import com.ozkuran.model.Bulletin;
import com.ozkuran.repositories.BulletinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/21/2016.
 */

@Service
public class BulletinServiceImpl implements BulletinService {
    private BulletinRepository bulletinRepository;

    @Autowired
    public void setProductRepository(BulletinRepository bulletinRepository) {
        this.bulletinRepository = bulletinRepository;
    }

    @Override
    public Iterable<Bulletin> listAllBulletins() {
        return bulletinRepository.findAll();
    }

    @Override
    public Bulletin getBulletinById(Integer id) {
        return bulletinRepository.findOne(id);
    }

    @Override
    public Bulletin saveBulletin(Bulletin bulletin) {
        return bulletinRepository.save(bulletin);
    }

    @Override
    public void deleteBulletin(Integer id) {
        bulletinRepository.delete(id);
    }
}
