import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestaurantDatabase database = new RestaurantDatabase();

        System.out.println("Enter restaurant");
        String RestaurantName = scanner.nextLine();

        Restaurant restaurant = database.getRestaurantByName(RestaurantName);
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