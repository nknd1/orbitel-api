package ru.orbitel.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ServerApplicationTests {

    @Autowired
    private TestRestTemplate testRestTemplate;
    @LocalServerPort
    private int localServerPort;

    @Test
	void contextLoads() {
	}

    @Test
    public void createTariff() throws Exception {
        String tariff = """
                {
                    "tariff_name": "salam aleikum",
                    "price_per_month": 0,
                    "speed": "infiniti brat"
                }""";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        ResponseEntity<String> postResponse = testRestTemplate.exchange(
                "http://localhost:" + localServerPort + "/orbitel/tariffs",
                HttpMethod.POST,
                new HttpEntity<>(tariff, httpHeaders),
                String.class
        );
        assertEquals(HttpStatus.CREATED, postResponse.getStatusCode());
    }
}
