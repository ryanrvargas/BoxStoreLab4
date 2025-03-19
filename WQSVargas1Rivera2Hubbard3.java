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

    }

    public static void displayMenu() {
        System.out.println("Wilmington Quick Shop");
        System.out.println("1. Add an item to the vehicle");
        System.out.println("2. Sell an item to a vehicle");
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
    }
}

