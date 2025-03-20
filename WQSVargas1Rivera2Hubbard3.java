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

        while (true){
            System.out.println("\nChoose a category: ");
            System.out.println("1. FoodItem\n2. Fruit\n3. Vegetable\n4. ShelfStable"
                    + "5. HouseholdItem\n6. Furniture\n7. CleaningSupply"
                    + "8. ClothingItem\n9. Shirt\n10. Shoe\n11. Outerwear"
                    + "12. ElectronicsItem\n13. Laptop\n14. Phone\n15. TV"
                    + "16. StoreItem\n0. Exit"
                    + "Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();//Consume newline

            if (choice == 0){
                System.out.println("Come back soon!");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String foodName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double foodPrice = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int foodQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String foodBrand = scanner.nextLine();
                    System.out.print("Enter weight: ");
                    double weight = scanner.nextDouble();
                    System.out.print("Is it organic? (true/false): ");
                    boolean organic = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter origin: ");
                    String origin = scanner.nextLine();
                    System.out.print("Enter calories: ");
                    int calories = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter expiration date: ");
                    String expiration = scanner.nextLine();

                    FoodItem newFood = new FoodItem(foodName, foodPrice, foodQuantity, foodBrand, weight, organic, origin, calories, expiration);
                    foodItems.add(newFood);
                    System.out.println("FoodItem added to list.");
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String fruitName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double fruitPrice = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int fruitQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String fruitBrand = scanner.nextLine();
                    System.out.print("Enter weight: ");
                    double fruitWeight = scanner.nextDouble();
                    System.out.print("Is it organic? (true/false): ");
                    boolean fruitOrganic = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter origin: ");
                    String fruitOrigin = scanner.nextLine();
                    System.out.print("Enter calories: ");
                    int fruitCalories = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter expiration date: ");
                    String fruitExpiration = scanner.nextLine();
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    System.out.print("Is it ripe? (true/false): ");
                    boolean ripe = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter harvest date: ");
                    String harvestDate = scanner.nextLine();

                    Fruit newFruit = new Fruit(fruitName, fruitPrice, fruitQuantity, fruitBrand, fruitWeight, fruitOrganic, fruitOrigin, fruitCalories, fruitExpiration, color, ripe, harvestDate);
                    fruits.add(newFruit);
                    System.out.println("Fruit added to list.");
                    break;

                case 16:
                    System.out.print("Enter name: ");
                    String storeItemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double storeItemPrice = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int storeItemQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String storeItemBrand = scanner.nextLine();

                    StoreItem newStoreItem = new StoreItem(storeItemName, storeItemPrice, storeItemQuantity, storeItemBrand);
                    storeItems.add(newStoreItem);
                    System.out.println("Store added to list.");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
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
