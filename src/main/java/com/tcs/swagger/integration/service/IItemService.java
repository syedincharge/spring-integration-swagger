package com.tcs.swagger.integration.service;


import com.tcs.swagger.integration.model.Item;

import java.util.List;

public interface IItemService {
    public Item saveItem(Item s);
    public Item getItemById(Integer id);
    public List<Item> getAllItems();
    public void deleteItemById(Integer id);
    public boolean ItemExist(Integer id);
}
