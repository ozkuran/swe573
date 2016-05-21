package com.ozkuran.repositories;

import com.ozkuran.model.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MahmutAli on 5/21/2016.
 */

@Repository
public interface BulletinRepository extends JpaRepository<Bulletin, Integer>{

}
