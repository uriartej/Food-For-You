import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestaurantDatabase database = new RestaurantDatabase();

        System.out.println("Enter restaurant");
        String RestaurantName = scanner.nextLine();

        Restaurant restaurant = database.getRestaurantByName(RestaurantName);
        if (restaurant != null) {
            System.out.println("Menu for " + restaurant.getName() + ":");
            for (MenuItem item : restaurant.getMenuItems()) {
                System.out.println(item.getName());
                System.out.println(item.getnutritionalInformation());
                System.out.println(item.getDescription());
                System.out.println("$" + item.getPrice());
            }
        } else {
            System.out.println("Restaurant not found.");
        }
    }
}