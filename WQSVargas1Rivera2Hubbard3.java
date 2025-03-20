import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WQSVargas1Rivera2Hubbard3 {

    public static List<StoreItem> inventory = new ArrayList< >();


    public static Scanner scanner = new Scanner(System.in);

    public static void populateInventory() {
        inventory.add(new StoreItem("Apple",2.50,1,"HoneyCrisps" ));
        inventory.add(new StoreItem("Broccoli", 3.50, 1, "Smiths"));
    }



    public static void addingItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of item is it?\nFood, Electronics, Clothing, or Household");
        String type = scanner.nextLine();


    }

    public static void sellingItem() {
        System.out.println("What Category would you like to shop for?");
        System.out.println("1. Food Item");
        System.out.println("2. Electronic Item");
        System.out.println("3. Clothing Item");
        System.out.println("4. Household Item");
        System.out.println("Enter your selection");
        int selection = scanner.nextInt();

        System.out.printf("%-20s %-10s %-10s %-6s",
                "Category", "Name", "Quantity", "Brand");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (StoreItem v : storeitem) {
            System.out.printf("%-20s %-10d %-10d %-6s",
                    v.getName(), v.getPrice(), v.getQuantity(), v.getBrand());
        }


    }

    public static void displayMenu() {
        System.out.println("Wilmington Quick Shop");
        System.out.println("1. Add an item to the inventory");
        System.out.println("2. Selling an item from inventory");
        System.out.println("3. Exit Shop ");
        System.out.println("Enter your selection: ");
    }


    public static void main(String[] args) {
        populateInventory();
        System.out.println("Welcome to Wilmington's Quick Shop");

        int selection = 0;

        do {
            displayMenu();
            try {
                selection = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // clear invalid input
                continue;
            }
            scanner.nextLine(); // clear buffer
            switch (selection) {
                case 1:
                    addingItem();
                    break;
                case 2:
                    sellingItem();
                    break;
                case 3:
                    System.out.println("Exiting the QuickShop. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        } while (selection != 3);

        scanner.close();
    }
}

