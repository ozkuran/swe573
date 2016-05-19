package com.ozkuran.services;

import com.ozkuran.model.Announcement;

/**
 * Created by MahmutAli on 5/19/2016.
 */
public interface AnnouncementService {
    Iterable<Announcement> listAllAnnouncements();

    Announcement getAnnouncementById(Integer id);

    Announcement saveAnnouncement(Announcement announcement);

    void deleteAnnouncement(Integer id);
}
