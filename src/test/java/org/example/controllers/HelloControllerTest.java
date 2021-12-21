package org.example.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest
class HelloControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;


    @Test()
    void testHelloMessage(){
        assertThat(testRestTemplate.getForObject("http://localhost:8080/")).contains("Hello");
    }
}
