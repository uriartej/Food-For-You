package com.foodapp.foodforyou;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class RestaurantControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private RestaurantDatabase database;

    @BeforeEach
    public void setup() {
        Restaurant restaurant = new Restaurant("Test Restaurant");
        database.addRestaurant(restaurant);
    }

    @Test
    public void getRestaurantByName_ShouldReturnOk() throws Exception {
        mockMvc.perform(get("/restaurants/Test Restaurant"))
                .andExpect(status().isOk());
    }

    @Test
    public void getRestaurantByName_ShouldReturnNotFound() throws Exception {
        mockMvc.perform(get("/restaurants/Nonexistent Restaurant"))
                .andExpect(status().isNotFound());
    }
}
