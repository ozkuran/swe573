package com.ozkuran.services;

import com.ozkuran.model.Inventory;

/**
 * Created by MahmutAli on 5/21/2016.
 */
public interface InventoryService {

    Iterable<Inventory> listAllInventoryItems();

    Inventory getInventoryItemById(Integer id);

    Inventory saveInventoryItem(Inventory inventoryItem);

    void deleteInventoryItem(Integer id);
}
