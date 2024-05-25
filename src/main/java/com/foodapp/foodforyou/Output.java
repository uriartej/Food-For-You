package com.foodapp.foodforyou;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestaurantDatabase database = new RestaurantDatabase();

        while (true) {
            System.out.println("Food Choices For You");
            System.out.println("Please choose an option:");
            System.out.println("1. View Restaurant");
            System.out.println("2. Add Restaurant");
            System.out.println("3. Update Restaurant");
            System.out.println("4. Delete Restaurant");
            System.out.println("5. Add Menu Item to Restaurant");
            System.out.println("6. Remove Menu Item from Restaurant");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> viewRestaurantMenu(scanner, database);
                case 2 -> addRestaurant(scanner, database);
                case 3 -> updateRestaurant(scanner, database);
                case 4 -> deleteRestaurant(scanner, database);
                case 5 -> addMenuItem(scanner, database);
                case 6 -> removeMenuItem(scanner, database);
                case 7 -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Invalid option. Choose a option from 1 to 7");
            }
        }
    }

    private static void viewRestaurantMenu(Scanner scanner, RestaurantDatabase database) {
        System.out.println("Enter restaurant");
        String restaurantName = scanner.nextLine();

        Restaurant restaurant = database.getRestaurantByName(restaurantName);
        if (restaurant != null) {
            System.out.println("Choose your ideal menu: (1) Healthy, (2) Weight Gain, (3) Protein");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Menu for " + restaurant.getName() + ":");
            boolean hasItems = false;
            for (MenuItem item : restaurant.getMenuItems()) {
                if (isItemMatchingChoice(item, choice)) {
                    System.out.println(item.getName());
                    System.out.println(item.getnutritionalInformation());
                    System.out.println(item.getDescription());
                    System.out.println("$" + item.getPrice());
                    System.out.println();
                    hasItems = true;
                }
            }

            if (!hasItems) {
                switch (choice) {
                    case 1, 2, 3 -> System.out.println("No menu items found.");
                    default -> System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    private static void addRestaurant(Scanner scanner, RestaurantDatabase database) {
        System.out.println("Enter new restaurant name:");
        String restaurantName = scanner.nextLine();
        Restaurant newRestaurant = new Restaurant(restaurantName);
        database.addRestaurant(newRestaurant);
        System.out.println("Restaurant added.");
    }

    private static void updateRestaurant(Scanner scanner, RestaurantDatabase database) {
        System.out.println("Enter the name of the restaurant to update:");
        String restaurantName = scanner.nextLine();
        Restaurant existingRestaurant = database.getRestaurantByName(restaurantName);
        if(existingRestaurant != null) {
            System.out.println("Enter the new name for the restaurant.");
            String newName = scanner.nextLine();
            Restaurant updatedRestaurant = new Restaurant(newName);
            database.updateRestaurant(restaurantName, updatedRestaurant);
            System.out.println("Restaurant updated.");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    private static void deleteRestaurant(Scanner scanner, RestaurantDatabase database) {
        System.out.println("Enter the name of the restaurant to delete:");
        String restaurantName = scanner.nextLine();
        database.deleteRestaurant(restaurantName);
        System.out.println("Restaurant deleted.");
    }

    private static void addMenuItem(Scanner scanner, RestaurantDatabase database) {
        System.out.println("Enter the name of the restaurant you want to add a item for:");
        String restaurantName = scanner.nextLine();
        Restaurant restaurant = database.getRestaurantByName(restaurantName);
        if (restaurant != null) {
            System.out.println("Enter item name:");
            String itemName = scanner.nextLine();
            System.out.println("Enter item price:");
            double itemPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter item discription (must contain a keyword such as healthy, low fat, protein " +
                    ",weight gain, or high calories):");
            String discription = scanner.nextLine();
            System.out.println("Enter item nutritional information:");
            String nutritionalInfo = scanner.nextLine();
            MenuItem newItem = new MenuItem(itemName, itemPrice, discription, nutritionalInfo);
            database.addMenuItemToRestaurant(restaurantName, newItem);
            System.out.println("Menu item added.");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    private static void removeMenuItem(Scanner scanner, RestaurantDatabase database) {
        System.out.println("Enter the name of the restaurant to remove item:");
        String restaurantName = scanner.nextLine();
        Restaurant restaurant = database.getRestaurantByName(restaurantName);
        if (restaurant != null) {
            System.out.println("Enter menu item to remove:");
            String itemName = scanner.nextLine();
            MenuItem itemToRemove = null;
            for (MenuItem item : restaurant.getMenuItems()) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    itemToRemove = item;
                    break;
                }
            }
            if (itemToRemove != null) {
                database.removeMenuItemFromRestaurant(restaurantName, itemToRemove);
                System.out.println("Menu item removed.");
            } else {
                System.out.println("Menu item not found.");
            }
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    private static boolean isItemMatchingChoice(MenuItem item, int choice) {
        String description = item.getDescription().toLowerCase();
        return switch (choice) {
            case 1 -> description.contains("healthy") || description.contains("low fat");
            case 2 -> description.contains("weight gain") || description.contains("high calories");
            case 3 -> description.contains("protein");
            default -> false;
        };
    }
}