package com.ozkuran.services;

import com.ozkuran.model.Event;

/**
 * Created by MahmutAli on 5/19/2016.
 */
public interface EventService {

    Iterable<Event> listAllEvents();

    Event getEventById(Integer id);

    Event saveEvent(Event event);

    void deleteEvent(Integer id);
}
