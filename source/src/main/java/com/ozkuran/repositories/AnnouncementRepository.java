package com.ozkuran.repositories;

import com.ozkuran.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {
}
