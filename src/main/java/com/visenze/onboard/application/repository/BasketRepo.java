package com.visenze.onboard.application.repository;

import com.visenze.onboard.application.model.Basket;
import org.springframework.data.repository.CrudRepository;

public interface BasketRepo extends CrudRepository<Basket, Integer> {
}
