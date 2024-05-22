package com.foodapp.foodforyou;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
        private final String name;
        private final List<MenuItem> menuItems;

        public Restaurant(String name) {
            this.name = name;
            this.menuItems = new ArrayList<>();
        }

        public void addMenuItem(MenuItem item) {
            menuItems.add(item);
        }

        public void removeMenuItem(MenuItem item) {
            menuItems.remove(item);
        }

        public List<MenuItem> getMenuItems() {
            return menuItems;
        }

        public String getName() {
            return name;
        }

}
