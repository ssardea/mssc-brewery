package sam.springframework.msscbrewery.web.controller;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import sam.springframework.msscbrewery.services.BeerService;
import sam.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(BeerController.class)
class BeerControllerTest {
    @MockBean
    BeerService beerService;

    @Autowired
    MockMvc mockMvc;

    BeerDto validBeer;

    @Before
    public void setUp(){
        validBeer= BeerDto.builder().id(UUID.randomUUID())
                .beerName("Beer 1")
                .beerStyle("PALE_ALE")
                .build();
    }

    @Test
    void getBeer() throws Exception {
        //given()
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/beer/" + validBeer.getId().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void createBeer() {
    }

    @Test
    void updateBeer() {
    }

    @Test
    void deleteBeer() {
    }
}