package com.tcs.swagger.integration.repository;


import com.tcs.swagger.integration.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemRepository extends JpaRepository<Item, Integer> {

}
