package com.visenze.onboard.application.controller;

import com.visenze.onboard.application.model.Basket;
import com.visenze.onboard.application.model.Item;
import com.visenze.onboard.application.service.BasketRepoService;
import com.visenze.onboard.application.service.ItemRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HusbandController {

    private BasketRepoService basketRepoService;

    @Autowired
    public HusbandController(BasketRepoService basketRepoService){
        this.basketRepoService = basketRepoService;
    }

    @GetMapping("/basketItems")
    private List<Basket> getAllItems(){
        return basketRepoService.getAllItems();
    }

    @GetMapping("/basketItems/{id}")
    private Basket getItem(@PathVariable("id") int id){
        return basketRepoService.getItemByID(id);
    }

    @DeleteMapping("/basketItems/{id}")
    private void deleteItem(@PathVariable("id") int id){
        basketRepoService.delete(id);
    }

    @PostMapping("/basketItems")
    private int saveItem(@RequestBody Basket basket){
        basketRepoService.saveOrUpdate(basket);
        return basket.getId();
    }
}
