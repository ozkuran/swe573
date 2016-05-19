package com.ozkuran.services;

import com.ozkuran.model.Announcement;
import com.ozkuran.repositories.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    private AnnouncementRepository announcementRepository;

    @Autowired
    public void setProductRepository(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    @Override
    public Iterable<Announcement> listAllAnnouncements() {
        return announcementRepository.findAll();
    }

    @Override
    public Announcement getAnnouncementById(Integer id) {
        return announcementRepository.findOne(id);
    }

    @Override
    public Announcement saveAnnouncement(Announcement announcement) {
        return announcementRepository.save(announcement);
    }

    @Override
    public void deleteAnnouncement(Integer id) {
        announcementRepository.delete(id);
    }
}

