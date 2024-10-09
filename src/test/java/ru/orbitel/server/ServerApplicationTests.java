package ru.orbitel.server;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.web.servlet.MockMvc;
import ru.orbitel.server.model.ClientContract;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ServerApplicationTests {

    @Autowired
    private TestRestTemplate testRestTemplate;
    @LocalServerPort
    private int localServerPort;

    @Autowired
    private MockMvc mockMvc;

    @Test
	void contextLoads() {
        // TODO document why this method is empty
    }

    @Test
    @DisplayName("tariff")
    void getTariffs() throws Exception {
        mockMvc.perform(get("/orbitel/tariffs"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    @DisplayName("ClienContract")
    void getAllClientContracts() throws Exception {
        ResponseEntity<ClientContract[]> getResponse = testRestTemplate.getForEntity(
                "http://localhost:" + localServerPort + "/orbitel/client-contract",
                ClientContract[].class
        );
        assertEquals(HttpStatus.OK, getResponse.getStatusCode());
    }
}
