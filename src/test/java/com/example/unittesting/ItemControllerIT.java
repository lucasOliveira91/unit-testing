package com.example.unittesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@TestPropertySource(locations = {"classpath: test-configuration.properties"})
public class ItemControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
        String forObject = this.restTemplate.getForObject("/all-items-from-database", String.class);
    }
}
