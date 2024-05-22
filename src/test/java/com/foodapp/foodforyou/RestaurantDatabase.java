package com.foodapp.foodforyou;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDatabase {

    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantDatabase() {
        Restaurant PizzaHut = new Restaurant("Pizza Hut");

        PizzaHut.addMenuItem(new MenuItem("Medium Peperoni Pizza", 17.38, "One medium pizza" +
                "containing pepperoni. High calories, protein.", "Calories: 1740, Total Fat: 70g, " +
                "Cholesterol: 3370mg, Sugar: 12g, Protein: 76g"));

        PizzaHut.addMenuItem(new MenuItem("12 Piece Traditional Wings", 21.99, "Crispy bone-in " +
                "wings with a choice of Honey BBQ or Lemmon Pepper. High calories, protein.", "Calories:"
                + " 960, Total Fat: 56g, Cholesterol: 540mg, Sugar: 1g, Protein: 109g"));

        restaurants.add(PizzaHut);

        Restaurant McDonalds = new Restaurant("McDonalds");

        McDonalds.addMenuItem(new MenuItem("Big Mac", 8.79, "100% beef burger with cheese, lettuce "
                + "and pickles. High calories, weight gain.", "Calories: 590, Total Fat: 34g, Cholesterol:"
                + " 85mg, Sugar: 7g, Protein: 25g"));

        McDonalds.addMenuItem(new MenuItem("10 pc. Chicken McNuggets", 8.79, "Made with white meat" +
                " chicken and no artifical colors, flavors, or preservatives. Protein.", "Calories: 410," +
                " Total Fat: 24g, Cholesterol: 65mg, Sugar: 0g, Protein: 23g"));

        restaurants.add(McDonalds);

        Restaurant InNOut = new Restaurant("InNOut");

        InNOut.addMenuItem(new MenuItem("Hamburger w/ Onion", 3.4, "100% american beef with lettuce," +
                " tomatoe, and onions. Healthy, protein.", "Calories: 360, Total Fat: 16g, Cholesterol: 35, Sugar: " +
                "8g, Protein: 16g"));

        InNOut.addMenuItem(new MenuItem("Cheeseburger", 3.85, "100% american beef with cheese, " +
                "lettuce, tomatoe, and onions. Healthy, protein.", "Calories: 430, Total Fat: 21g, Cholesterol:" +
                " 55mg, Sugar: 8g, Protein: 20g"));

        restaurants.add(InNOut);

        Restaurant Wendys = new Restaurant("Wendys");

        Wendys.addMenuItem(new MenuItem("Classic Chicken Sandwich", 8.19, "A lightly breaded " +
                "crispy chicken breast with lettuce, mayo, pickles, and tomato. Healthy, low fat, protein.",
                "Calories: 490, Total Fat: 21g, Cholesterol: 75mg, Sugar: 5g, Protein: 28g"));

        Wendys.addMenuItem(new MenuItem("Dave's Single", 7.99, "A quater pound of beef with " +
                "cheese, lettuce, tomato, pickles, ketchup and onions. High calories, weight gain.",
                "Calories: 590, Total Fat: 37g, Cholesterol: 80mg, Sugar: 8g, Protein: 29g"));

        restaurants.add(Wendys);

        Restaurant CarlsJr = new Restaurant("CarlsJr");

        CarlsJr.addMenuItem(new MenuItem("California Classic Double Cheeseburger", 3.29, "Two " +
                "beef patties with cheese, onions, lettuce and tomato. High calories, weight gain.",
                "Calories: 590, Total Fat: 41g, Cholesterol: 85mg, Sugar: 9g, Protein: 23g"));

        CarlsJr.addMenuItem(new MenuItem("Famous Star with Cheese", 5.89, "Beef patty with cheese," +
                " lettuce, tomato, onions, pickles. High calories, weight gain.", "Calories: 269, " +
                "Total Fat: 38g, Cholesterol: 75mg, Sugar: 12g, Protein: 28g"));

        restaurants.add(CarlsJr);

        Restaurant BurgerKing = new Restaurant("Burger King");

        BurgerKing.addMenuItem(new MenuItem("Whopper", 7.99, "Flame grilled beef with tomatos, " +
                "lettuce, pickles, and onions known as America's favorite burger. High calories, weight gain.",
                "Calories: 670, Total Fat: 39g, Cholesterol: 85mg, Sugar: 13g, Protein: 31g"));

        BurgerKing.addMenuItem(new MenuItem("Royal Crispy Chicken", 6.29, "Crisy white meat breast " +
                "topped with sauce, tomatos, lettuce and mayo. Healthy, protein.", "Calories: 600, Total Fat:" +
                " 31g, Cholesterol: 80mg, Sugar: 9g, Protein: 31g"));

        restaurants.add(BurgerKing);

        Restaurant DelTaco = new Restaurant("Del Taco");

        DelTaco.addMenuItem(new MenuItem("Epic Crispy Chicken & Guac Burrito", 6.79, "Loaded with" +
                "three crispy chicken strips with guac, lettuce, tomatoes, and a oversize flour tortilla. Protein, " +
                "weight gain.", "Calories: 770, Total Fat: 44g, Cholesterol: 70mg, Sugar: 5g, Protein:" +
                " 26g"));

        DelTaco.addMenuItem(new MenuItem("Two Crispy Jumbo Shrimp Tacos", 6.00, "Jumbo shirmp" +
                "with secret sauce, shredded cabbage, wrapped with a flour tortilla. Weight gain, high calories, Low fat.",
                "Calories: 310, Total Fat: 18g, Cholesterol: 41mg, Sugar: 2g, Protein: 8g"));

        restaurants.add(DelTaco);

        Restaurant TacoBell = new Restaurant("Taco Bell");

        TacoBell.addMenuItem(new MenuItem("Cantina Chicken Burrito", 5.99, "Made with slow roasted" +
                "chicken, ranch, lettuce, cheese and a flour tortilla. Weight gain, protein.", "Calories:" +
                " 540, Total Fat: 30g, Cholesterol: 85mg, Sugar: 4g, Protein: 25g"));

        TacoBell.addMenuItem(new MenuItem("Burrito Supreme", 5.49, "Seasoned beef, beans, red sauce" +
                " lettuce, with cheese is the most recognizable burrito. Protein, low fat.",
                "Calories: 400, Total Fat: 14g, Cholesterol: 30mg, Sugar: 4g, Protein: 16g"));

        restaurants.add(TacoBell);

        Restaurant Dominos = new Restaurant("Dominos");

        Dominos.addMenuItem(new MenuItem("Medium Hand Tossed Pepperoni Pizza", 15.99, "Medium pizza" +
                " containing pepperoni and seasoned with a special sauce. Protein, weight gain, high calories, protein.",
                "Calories: 1540, Total Fat: 50g, Cholesterol: 3170mg, Sugar: 15g, Protein: 96g"));

        Dominos.addMenuItem(new MenuItem("16 Piece Plain Wings", 23.99, "Choice of Hot Buffalo, " +
                "Honey BBQ, or Sweet Habanero. High calories, weight gain, protein.", "Calories: 1000, Total " +
                "Fat: 80g, Cholesterol: 440mg, Sugar: 0g, Protein: 56g"));

        restaurants.add(Dominos);

        Restaurant JimmyJohns = new Restaurant("Jimmy Johns");

        JimmyJohns.addMenuItem(new MenuItem("Big John '8'", 9.39, "Roast Beef, Lettuce, Tomato " +
                "& Mayo. Protein, low fat.", "Calories: 500, Total Fat: 21g, Cholesterol: 60mg, Sugar: 2g, " +
                "Protein: 26g"));

        JimmyJohns.addMenuItem(new MenuItem("The Pepe '8'", 9.39, "Classic Ham & Cheese Sandwich." +
                " Protein, low fat.", "Calories: 600, Total Fat: 29g, Cholesterol: 70mg, Sugar: 4g, Protein: 29g"));

        restaurants.add(JimmyJohns);
    }

    public Restaurant getRestaurantByName(String name) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                return restaurant;
            }
        }
        return null;
    }
}
