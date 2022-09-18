package com.tcs.swagger.integration.service.impl;





import java.util.List;

import com.tcs.swagger.integration.model.Item;
import com.tcs.swagger.integration.repository.IItemRepository;
import com.tcs.swagger.integration.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;



@Service
@EnableTransactionManagement
public class ItemServiceImpl implements IItemService {
    @Autowired
    private IItemRepository repo;

    @Override
    @Transactional
    public Item saveItem(Item i) {

        Item item=repo.save(i);
        return item;
    }

    @Override
    @Transactional(readOnly=true)
    public Item getItemById(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    @Transactional(readOnly=true)
    public List<Item> getAllItems() {

        List<Item> items=repo.findAll();
        if(items!=null && !items.isEmpty()) {
            return items;
        }else {
            return null;
        }
    }

    @Override
    @Transactional
    public void deleteItemById(Integer id) {
        repo.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public boolean ItemExist(Integer id) {
        return repo.existsById(id);
    }

}