package com.foodapp.foodforyou;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantDatabase database;

    public RestaurantController(RestaurantDatabase database) {
        this.database = database;
    }

    @GetMapping
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        List<Restaurant> restaurants = database.getAllRestaurants();
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Restaurant> getRestaurantByName(@PathVariable String name) {
        Restaurant restaurant = database.getRestaurantByName(name);
        if (restaurant != null) {
            return new ResponseEntity<>(restaurant, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> addRestaurant(@RequestBody Restaurant restaurant) {
        database.addRestaurant(restaurant);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{name}")
    public ResponseEntity<Void> updateRestaurant(@PathVariable String name, @RequestBody Restaurant updatedRestaurant) {
        database.updateRestaurant(name, updatedRestaurant);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable String name) {
        database.deleteRestaurant(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/{restaurantName}/menu")
    public ResponseEntity<Void> addMenuItem(@PathVariable String restaurantName, @RequestBody MenuItem menuItem) {
        database.addMenuItemToRestaurant(restaurantName, menuItem);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{restaurantName}/menu")
    public ResponseEntity<Void> removeMenuItem(@PathVariable String restaurantName, @RequestBody MenuItem menuItem) {
        database.removeMenuItemFromRestaurant(restaurantName, menuItem);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
