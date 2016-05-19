package com.ozkuran.services;

import com.ozkuran.model.Producer;

/**
 * Created by MahmutAli on 5/19/2016.
 */
public interface ProducerService {
    Iterable<Producer> listAllProducers();

    Producer getProducerById(Integer id);

    Producer saveProducer(Producer producer);

    void deleteProducer(Integer id);
}
