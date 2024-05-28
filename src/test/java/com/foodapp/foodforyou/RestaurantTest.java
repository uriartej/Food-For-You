package com.foodapp.foodforyou;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RestaurantTest {

    @Test
    public void testAddMenuItem() {
        Restaurant restaurant = new Restaurant("Test Restaurant");
        MenuItem item = new MenuItem("Test Item", 10.0, "Description", "Nutritional Info");
        restaurant.addMenuItem(item);

        assertEquals(1, restaurant.getMenuItems().size());
        assertEquals("Test Item", restaurant.getMenuItems().get(0).getName());
    }

    @Test
    public void testRemoveMenuItem() {
        Restaurant restaurant = new Restaurant("Test Restaurant");
        MenuItem item = new MenuItem("Test Item", 10.0, "Description", "Nutritional Info");
        restaurant.addMenuItem(item);
        restaurant.removeMenuItem(item);

        assertEquals(0, restaurant.getMenuItems().size());
    }
}
