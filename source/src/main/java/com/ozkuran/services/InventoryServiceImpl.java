package com.ozkuran.services;

import com.ozkuran.model.Inventory;
import com.ozkuran.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/21/2016.
 */

@Service
public class InventoryServiceImpl implements InventoryService{

    private InventoryRepository inventoryRepository;

    @Autowired
    public void setInventoryRepository(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public Iterable<Inventory> listAllInventoryItems() {
        return inventoryRepository.findAll();
    }

    @Override
    public Inventory getInventoryItemById(Integer id) {
        return inventoryRepository.findOne(id);
    }

    @Override
    public Inventory saveInventoryItem(Inventory inventoryItem) {
        return inventoryRepository.save(inventoryItem);
    }

    @Override
    public void deleteInventoryItem(Integer id) {
        inventoryRepository.delete(id);
    }
}
