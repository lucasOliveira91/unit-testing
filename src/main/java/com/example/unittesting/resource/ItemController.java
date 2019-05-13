package com.example.unittesting.resource;

import com.example.unittesting.business.ItemBussinessService;
import com.example.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemBussinessService bussinessService;

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1, "Ball", 10, 100);
    }

    @GetMapping("/item-from-business-service")
    public Item itemFromBussiness() {
        return bussinessService.retreiveHardCodedItem();
    }

    @GetMapping("/all-items-from-database")
    public List<Item> retrievAllItems() {
        return bussinessService.retreiveAllItems();
    }
}
