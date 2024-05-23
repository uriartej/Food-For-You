package com.foodapp.foodforyou;

public class MenuItem {
    private final String name;
    private final double price;
    private final String description;
    private final String nutritionalInformation;

    public MenuItem(String name, double price, String description, String nutritionalInformation) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.nutritionalInformation = nutritionalInformation;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return String.format("%.2f", price);
    }

    public String getDescription() {
        return description;
    }

    public String getnutritionalInformation() {
        return nutritionalInformation;
    }
}