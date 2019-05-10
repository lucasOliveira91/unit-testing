package com.example.unittesting;

import com.example.unittesting.business.ItemBussinessService;
import com.example.unittesting.model.Item;
import com.example.unittesting.resource.HelloWordController;
import com.example.unittesting.resource.ItemController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemBussinessService bussinessService;

    @Test
    public void dummy_basic() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/dummy-item").accept(MediaType.APPLICATION_JSON);
        MvcResult mvcResult = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andReturn();
        JSONAssert.assertEquals("{id: 1, name: Ball, price: 10, quantity: 100}", mvcResult.getResponse().getContentAsString(),true);
    }

    @Test
    public void itemFromBussinnesService() throws Exception {
        when(bussinessService.retreiveHardCodedItem()).thenReturn(new Item(1, "Ball", 10, 100));
        RequestBuilder request = MockMvcRequestBuilders.get("/item-from-business-service").accept(MediaType.APPLICATION_JSON);
        MvcResult mvcResult = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andReturn();
        JSONAssert.assertEquals("{id: 1, name: Ball, price: 10, quantity: 100}", mvcResult.getResponse().getContentAsString(),true);
    }
}
