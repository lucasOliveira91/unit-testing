package com.example.unittesting;

import com.example.unittesting.data.ItemRepository;
import com.example.unittesting.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository;

    @Test
    public void shouldRetornAll() {
        List<Item> all = repository.findAll();

        assertEquals(3, all.size());
    }
}
