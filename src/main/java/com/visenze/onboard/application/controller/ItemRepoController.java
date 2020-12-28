package com.visenze.onboard.application.controller;

import com.visenze.onboard.application.model.Item;
import com.visenze.onboard.application.service.ItemRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemRepoController {

    private ItemRepoService itemRepoService;

    @Autowired
    public ItemRepoController(ItemRepoService itemRepoService){
        this.itemRepoService = itemRepoService;
    }

    @GetMapping("/items")
    private List<Item> getAllItems(){
        return itemRepoService.getAllItems();
    }

    @GetMapping("/items/{id}")
    private Item getItem(@PathVariable("id") int id){
        return itemRepoService.getItemById(id);
    }

    @DeleteMapping("/items/{id}")
    private void deleteItem(@PathVariable("id") int id){
        itemRepoService.delete(id);
    }

    @PostMapping("/items")
    private int saveItem(@RequestBody Item item){
        itemRepoService.saveOrUpdate(item);
        return item.getId();
    }
}