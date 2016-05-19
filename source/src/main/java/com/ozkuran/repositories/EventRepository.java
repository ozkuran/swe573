package com.ozkuran.repositories;

import com.ozkuran.model.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by MahmutAli on 5/19/2016.
 */
public interface EventRepository extends CrudRepository<Event, Integer> {
}
