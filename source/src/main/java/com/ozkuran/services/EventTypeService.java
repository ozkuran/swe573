package com.ozkuran.services;

import com.ozkuran.model.EventType;

/**
 * Created by MahmutAli on 5/22/2016.
 */
public interface EventTypeService {

    Iterable<EventType> listAllEventTypes();

    EventType getEventTypeById(Integer id);

    EventType saveEventType(EventType eventType);

    void deleteEventType(Integer id);

}
