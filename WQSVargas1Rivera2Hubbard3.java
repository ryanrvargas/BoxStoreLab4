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
        System.out.println("1. Food");
        System.out.println("2. Electronics");
        System.out.println("3. Clothing");
        System.out.println("4. Household");
        System.out.println("Enter your selection: ");

        int selection = -1;
        try {
            selection = scanner.nextInt();
            scanner.nextLine(); // clear buffer
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
            scanner.next(); // clear invalid input
            return;
        }

        String category = "";
        switch (selection) {
            case 1: category = "Food"; break;
            case 2: category = "Electronics"; break;
            case 3: category = "Clothing"; break;
            case 4: category = "Household"; break;
            default:
                System.out.println("Invalid selection. Please enter a number between 1 and 4.");
                return;
        }

        System.out.println("\nAvailable " + category + " Items:");
        System.out.printf("%-15s %-10s %-10s %-15s %-20s\n", "Name", "Price", "Quantity", "Brand", "Return Policy");
        System.out.println("----------------------------------------------------------------------------");

        boolean found = false;
        for (StoreItem item : inventory) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                found = true;
                System.out.printf("%-15s $%-9.2f %-10d %-15s %-20s\n",
                        item.getName(), item.getPrice(), item.getQuantity(), item.getBrand(), item.getReturnPolicy());
            }
        }

        if (!found) {
            System.out.println("No items available in this category.");
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

