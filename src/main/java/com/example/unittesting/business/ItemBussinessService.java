package com.example.unittesting.business;


import com.example.unittesting.data.ItemRepository;
import com.example.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemBussinessService {

    @Autowired
    private ItemRepository repository;

    public Item retreiveHardCodedItem() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retreiveAllItems() {
        return repository.findAll();
    }
}
