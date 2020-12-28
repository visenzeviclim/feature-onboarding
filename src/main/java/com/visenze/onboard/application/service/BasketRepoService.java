package com.visenze.onboard.application.service;

import com.visenze.onboard.application.model.Basket;
import com.visenze.onboard.application.model.Item;
import com.visenze.onboard.application.repository.BasketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketRepoService {
    private BasketRepo basketRepo;

    @Autowired
    public BasketRepoService(BasketRepo basketRepo){
        this.basketRepo = basketRepo;
    }

    // Create
    // Read
    public Basket getItemByID(int id){
        return this.basketRepo.findById(id).get();
    }
    public List<Basket> getAllItems(){
        List<Basket> baskets = new ArrayList<>();
        this.basketRepo.findAll().forEach(baskets::add);
        return baskets;
    }
    // Update
    public void saveOrUpdate(Basket basket){
        basketRepo.save(basket);
    }
    // Delete
    public void delete(int id){
        this.basketRepo.deleteById(id);
    }

}
