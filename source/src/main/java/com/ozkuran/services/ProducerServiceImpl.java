package com.ozkuran.services;

import com.ozkuran.model.Producer;
import com.ozkuran.repositories.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/19/2016.
 */

@Service
public class ProducerServiceImpl implements ProducerService {
    private ProducerRepository producerRepository;

    @Autowired
    public void setProducerRepository(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }

    @Override
    public Iterable<Producer> listAllProducers() {
        return producerRepository.findAll();
    }

    @Override
    public Producer getProducerById(Integer id) {
        return producerRepository.findOne(id);
    }

    @Override
    public Producer saveProducer(Producer producer) {
        return producerRepository.save(producer);
    }

    @Override
    public void deleteProducer(Integer id) {
        producerRepository.delete(id);
    }
}
