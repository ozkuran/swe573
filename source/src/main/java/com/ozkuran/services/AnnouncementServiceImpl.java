package com.ozkuran.services;

import com.ozkuran.model.Announcement;
import com.ozkuran.repositories.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    private AnnouncementRepository announcementRepository;

    private static final int ANNOUNCEMENT_PAGE_SIZE = 4;


    @Autowired
    public void setProductRepository(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    @Override
    public Page<Announcement> getLatestAnnouncements(){
        PageRequest pageRequest = new PageRequest(0, ANNOUNCEMENT_PAGE_SIZE, Sort.Direction.DESC, "id");
        return announcementRepository.findAll(pageRequest);
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

