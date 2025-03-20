import java.util.ArrayList;
import java.util.Scanner;

public class WQSVargas1Rivera2Hubbard3 {
    static ArrayList<FoodItem> foodItems = new ArrayList<>();
    static ArrayList<Fruit> fruits = new ArrayList<>();
    static ArrayList<Vegetable> vegetables = new ArrayList<>();
    static ArrayList<ShelfStable> shelfStables = new ArrayList<>();
    static ArrayList<HouseholdItem> householdItems = new ArrayList<>();
    static ArrayList<Furniture> furnitureItems = new ArrayList<>();
    static ArrayList<CleaningSupply> cleaningSupplies = new ArrayList<>();
    static ArrayList<ClothingItem> clothingItems = new ArrayList<>();
    static ArrayList<Shirt> shirts = new ArrayList<>();
    static ArrayList<Shoe> shoes = new ArrayList<>();
    static ArrayList<Outerwear> outerwears = new ArrayList<>();
    static ArrayList<ElectronicsItem> electronicsItems = new ArrayList<>();
    static ArrayList<Laptop> laptops = new ArrayList<>();
    static ArrayList<Phone> phones = new ArrayList<>();
    static ArrayList<TV> tvs = new ArrayList<>();
    static ArrayList<StoreItem> storeItems = new ArrayList<>();


    public void addItem() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // ✅ Fixes Menu Formatting for Better Readability
            System.out.println("\nChoose a category to add an item:");
            System.out.println("1. FoodItem\n2. Fruit\n3. Vegetable\n4. ShelfStable");
            System.out.println("5. HouseholdItem\n6. Furniture\n7. CleaningSupply");
            System.out.println("8. ClothingItem\n9. Shirt\n10. Shoe\n11. Outerwear");
            System.out.println("12. ElectronicsItem\n13. Laptop\n14. Phone\n15. TV");
            System.out.println("16. StoreItem\n0. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 0-16.");
                scanner.next(); // Consume incorrect input
                System.out.print("Enter your choice: ");
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 0) {
                System.out.println("Come back soon!");
                break; // ✅ Exits loop properly when user chooses 0
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String foodName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid price. Please enter a number.");
                        scanner.next(); // Consume incorrect input
                        System.out.print("Enter price: ");
                    }
                    double foodPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter quantity: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid quantity. Please enter a whole number.");
                        scanner.next(); // Consume incorrect input
                        System.out.print("Enter quantity: ");
                    }
                    int foodQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter brand: ");
                    String foodBrand = scanner.nextLine();
                    System.out.print("Enter weight: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid weight. Please enter a number.");
                        scanner.next(); // Consume incorrect input
                        System.out.print("Enter weight: ");
                    }
                    double weight = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Is it organic? (true/false): ");
                    while (!scanner.hasNextBoolean()) {
                        System.out.println("Invalid input. Please enter true or false.");
                        scanner.next(); // Consume incorrect input
                        System.out.print("Is it organic? (true/false): ");
                    }
                    boolean organic = scanner.nextBoolean();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter origin: ");
                    String origin = scanner.nextLine();
                    System.out.print("Enter calories: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid calories. Please enter a whole number.");
                        scanner.next(); // Consume incorrect input
                        System.out.print("Enter calories: ");
                    }
                    int calories = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter expiration date: ");
                    String expiration = scanner.nextLine();

                    FoodItem newFood = new FoodItem(foodName, foodPrice, foodQuantity, foodBrand, weight, organic, origin, calories, expiration);
                    foodItems.add(newFood);
                    System.out.println("✅ FoodItem added successfully!");
                    break;

                case 16:
                    System.out.print("Enter name: ");
                    String storeItemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid price. Please enter a number.");
                        scanner.next(); // Consume incorrect input
                        System.out.print("Enter price: ");
                    }
                    double storeItemPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter quantity: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid quantity. Please enter a whole number.");
                        scanner.next(); // Consume incorrect input
                        System.out.print("Enter quantity: ");
                    }
                    int storeItemQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter brand: ");
                    String storeItemBrand = scanner.nextLine();

                    StoreItem newStoreItem = new StoreItem(storeItemName, storeItemPrice, storeItemQuantity, storeItemBrand);
                    storeItems.add(newStoreItem);
                    System.out.println("✅ StoreItem added successfully!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 0-16.");
                    break;
            }
        }

        scanner.close(); // ✅ Close scanner when done
    }

    public static void displayMenu() {
        System.out.println("The Wilmington Quick Shop. Select category:");
        System.out.println("1. Add an item to the vehicle");
        System.out.println("2. Sell an item to a vehicle");
        System.out.println("3. Exit Shop ");
        System.out.println("Enter your selection: ");
    }


    public static void main(String[] args) {
        WQSVargas1Rivera2Hubbard3 manager = new WQSVargas1Rivera2Hubbard3();
        manager.addItem();
    }

}
