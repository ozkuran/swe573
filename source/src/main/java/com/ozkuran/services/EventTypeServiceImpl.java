package com.ozkuran.services;

import com.ozkuran.model.EventType;
import com.ozkuran.repositories.EventTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/22/2016.
 */

@Service
public class EventTypeServiceImpl implements EventTypeService{
    private EventTypeRepository eventTypeRepository;

    @Autowired
    public void setProductRepository(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
    }

    @Override
    public Iterable<EventType> listAllEventTypes() {
        return eventTypeRepository.findAll();
    }

    @Override
    public EventType getEventTypeById(Integer id) {
        return eventTypeRepository.findOne(id);
    }

    @Override
    public EventType saveEventType(EventType eventType) {
        return eventTypeRepository.save(eventType);
    }

    @Override
    public void deleteEventType(Integer id) {
        eventTypeRepository.delete(id);
    }
}
