package org.example.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;


    @Test()
    void testHelloMessage(){
        assertThat(testRestTemplate.getForObject("http://localhost:" + port, String.class)).contains("Hello");
//        assertThat(testRestTemplate.getForObject("http://localhost:" + port, String.class)).contains("Goodbye");

    }
}
