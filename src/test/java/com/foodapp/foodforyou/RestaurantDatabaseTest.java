package com.foodapp.foodforyou;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantDatabaseTest {

    @Test
    public void testAddRestaurant() {
        RestaurantDatabase database = new RestaurantDatabase();
        Restaurant restaurant = new Restaurant("Test Restaurant");
        database.addRestaurant(restaurant);

        assertEquals(restaurant, database.getRestaurantByName("Test Restaurant"));
    }

    @Test
    public void testDeleteRestaurant() {
        RestaurantDatabase database = new RestaurantDatabase();
        Restaurant restaurant = new Restaurant("Test Restaurant");
        database.addRestaurant(restaurant);
        database.deleteRestaurant("Test Restaurant");

        assertNull(database.getRestaurantByName("Test Restaurant"));
    }
}
