package com.ozkuran.services;

import com.ozkuran.model.Bulletin;

/**
 * Created by MahmutAli on 5/21/2016.
 */
public interface BulletinService {
    Iterable<Bulletin> listAllBulletins();

    Bulletin getBulletinById(Integer id);

    Bulletin saveBulletin(Bulletin event);

    void deleteBulletin(Integer id);
}
