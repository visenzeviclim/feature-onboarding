package com.visenze.onboard.application.service;

import com.visenze.onboard.application.model.Item;
import com.visenze.onboard.application.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemRepoService {

    private ItemRepo itemRepo;

    @Autowired
    public ItemRepoService(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    // Create
    public Item getItemById(int id){
        return itemRepo.findById(id).get();
    }

    // Update
    public void saveOrUpdate(Item item){
        itemRepo.save(item);
    }
    // Read
    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        this.itemRepo.findAll().forEach(items::add);
        return items;
    }
    // Delete
    public void delete(int id){
        itemRepo.deleteById(id);
    }
}
