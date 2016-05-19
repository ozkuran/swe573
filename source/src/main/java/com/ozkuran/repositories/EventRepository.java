package com.ozkuran.repositories;

import com.ozkuran.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
