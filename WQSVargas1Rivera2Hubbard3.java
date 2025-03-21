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
            // Fixes Menu Formatting for Better Readability
            System.out.println("\nChoose a category to add an item:");
            System.out.println("1. FoodItem\n2. Fruit\n3. Vegetable\n4. ShelfStable");
            System.out.println("5. HouseholdItem\n6. Furniture\n7. CleaningSupply");
            System.out.println("8. ClothingItem\n9. Shirt\n10. Shoe\n11. Outerwear");
            System.out.println("12. ElectronicsItem\n13. Laptop\n14. Phone\n15. TV");
            System.out.println("16. StoreItem\n0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Come back soon!");
                break; // Exits loop properly when user chooses 0
            }

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String foodName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid price. Please enter a number.");
                        scanner.next(); //Consume incorrect input
                        System.out.print("Enter price: ");
                    }
                    double foodPrice = scanner.nextDouble();
                    scanner.nextLine(); //Consume newline

                    System.out.print("Enter quantity: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid quantity. Please enter a whole number.");
                        scanner.next(); //Consume incorrect input
                        System.out.print("Enter quantity: ");
                    }
                    int foodQuantity = scanner.nextInt();
                    scanner.nextLine(); //Consume newline

                    System.out.print("Enter brand: ");
                    String foodBrand = scanner.nextLine();
                    System.out.print("Enter weight: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid weight. Please enter a number.");
                        scanner.next(); //Consume incorrect input
                        System.out.print("Enter weight: ");
                    }
                    double weight = scanner.nextDouble();
                    scanner.nextLine(); //Consume newline

                    System.out.print("Is it organic? (true/false): ");
                    while (!scanner.hasNextBoolean()) {
                        System.out.println("Invalid input. Please enter true or false.");
                        scanner.next(); //Consume incorrect input
                        System.out.print("Is it organic? (true/false): ");
                    }
                    boolean organic = scanner.nextBoolean();
                    scanner.nextLine(); //Consume newline

                    System.out.print("Enter origin: ");
                    String origin = scanner.nextLine();
                    System.out.print("Enter calories: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid calories. Please enter a whole number.");
                        scanner.next(); //Consume incorrect input
                        System.out.print("Enter calories: ");
                    }
                    int calories = scanner.nextInt();
                    scanner.nextLine(); //Consume newline

                    System.out.print("Enter expiration date: ");
                    String expiration = scanner.nextLine();

                    FoodItem newFood = new FoodItem(foodName, foodPrice, foodQuantity, foodBrand, weight, organic, origin, calories, expiration);
                    foodItems.add(newFood);
                    System.out.println("FoodItem added successfully!");
                    break;
                case 2: // Fruit
                    scanner.nextLine();
                    System.out.print("Enter Fruit name: ");
                    String fruitName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double fruitPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int fruitQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String fruitBrand = scanner.nextLine();
                    System.out.print("Enter weight: ");
                    double fruitWeight = scanner.nextDouble();
                    scanner.nextLine();
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
                    String fruitColor = scanner.nextLine();
                    System.out.print("Is it ripe? (true/false): ");
                    boolean fruitRipe = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter harvest date: ");
                    String fruitHarvestDate = scanner.nextLine();

                    fruits.add(new Fruit(fruitName, fruitPrice, fruitQuantity, fruitBrand, fruitWeight, fruitOrganic, fruitOrigin, fruitCalories, fruitExpiration, fruitColor, fruitRipe, fruitHarvestDate));
                    System.out.println("Fruit added.");
                    break;

                case 3: // Vegetable
                    scanner.nextLine();
                    System.out.print("Enter Vegetable name: ");
                    String vegetableName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double vegetablePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int vegetableQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String vegetableBrand = scanner.nextLine();
                    System.out.print("Enter weight: ");
                    double vegetableWeight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Is it organic? (true/false): ");
                    boolean vegetableOrganic = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter origin: ");
                    String vegetableOrigin = scanner.nextLine();
                    System.out.print("Enter calories: ");
                    int vegetableCalories = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter expiration date: ");
                    String vegetableExpiration = scanner.nextLine();
                    System.out.print("Enter color: ");
                    String vegetableColor = scanner.nextLine();
                    System.out.print("Enter harvest date: ");
                    String vegetableHarvestDate = scanner.nextLine();
                    System.out.print("Enter storage type: ");
                    String vegetableStorage = scanner.nextLine();
                    System.out.print("Enter freshness level: ");
                    String vegetableFreshness = scanner.nextLine();

                    vegetables.add(new Vegetable(vegetableName, vegetablePrice, vegetableQuantity, vegetableBrand, vegetableWeight, vegetableOrganic, vegetableOrigin, vegetableCalories, vegetableExpiration, vegetableColor, vegetableHarvestDate, vegetableStorage, vegetableFreshness));
                    System.out.println("Vegetable added.");
                    break;

                case 4: // ShelfStable
                    scanner.nextLine();
                    System.out.print("Enter ShelfStable name: ");
                    String shelfStableName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double shelfStablePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int shelfStableQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String shelfStableBrand = scanner.nextLine();
                    System.out.print("Enter weight: ");
                    double shelfStableWeight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Is it organic? (true/false): ");
                    boolean shelfStableOrganic = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter origin: ");
                    String shelfStableOrigin = scanner.nextLine();
                    System.out.print("Enter calories: ");
                    int shelfStableCalories = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter expiration date: ");
                    String shelfStableExpiration = scanner.nextLine();
                    System.out.print("Enter packaging type: ");
                    String shelfStablePackaging = scanner.nextLine();
                    System.out.print("Enter manufacturing date: ");
                    String shelfStableManufacturingDate = scanner.nextLine();
                    System.out.print("Enter any warnings: ");
                    String shelfStableWarnings = scanner.nextLine();
                    System.out.print("Enter container material: ");
                    String shelfStableContainerMaterial = scanner.nextLine();

                    shelfStables.add(new ShelfStable(shelfStableName, shelfStablePrice, shelfStableQuantity, shelfStableBrand, shelfStableWeight, shelfStableOrganic, shelfStableOrigin, shelfStableCalories, shelfStableExpiration, shelfStablePackaging, shelfStableManufacturingDate, shelfStableWarnings, shelfStableContainerMaterial));
                    System.out.println("ShelfStable item added.");
                    break;

                case 5: // HouseholdItem
                    scanner.nextLine();
                    System.out.print("Enter HouseholdItem name: ");
                    String householdName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double householdPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int householdQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String householdBrand = scanner.nextLine();
                    System.out.print("Enter room type: ");
                    String householdRoomType = scanner.nextLine();
                    System.out.print("Enter dimensions: ");
                    String householdDimensions = scanner.nextLine();
                    System.out.print("Enter material: ");
                    String householdMaterial = scanner.nextLine();
                    System.out.print("Enter weight: ");
                    int householdWeight = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Is it fragile? (true/false): ");
                    boolean householdFragile = scanner.nextBoolean();
                    scanner.nextLine();

                    householdItems.add(new HouseholdItem(householdName, householdPrice, householdQuantity, householdBrand, householdRoomType, householdDimensions, householdMaterial, householdWeight, householdFragile));
                    System.out.println("Household item added.");
                    break;

                case 6: // Furniture
                    scanner.nextLine();
                    System.out.print("Enter Furniture name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Enter room type (e.g., Living Room, Bedroom): ");
                    String roomType = scanner.nextLine();

                    System.out.print("Enter dimensions (e.g., 6x3x2 feet): ");
                    String dimensions = scanner.nextLine();

                    System.out.print("Enter material (e.g., Wood, Metal, Plastic): ");
                    String material = scanner.nextLine();

                    System.out.print("Enter weight (in pounds): ");
                    weight = (int)scanner.nextInt();
                    scanner.nextLine(); //Consume newline

                    System.out.print("Is the furniture fragile? (true/false): ");
                    boolean fragile = scanner.nextBoolean();
                    scanner.nextLine(); //Consume newline

                    System.out.print("Enter furniture type (e.g., Table, Chair, Sofa): ");
                    String furnitureType = scanner.nextLine();

                    System.out.print("Enter style (e.g., Modern, Classic, Rustic): ");
                    String style = scanner.nextLine();

                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();

                    System.out.print("Is the furniture assembled? (true/false): ");
                    boolean assembled = scanner.nextBoolean();
                    scanner.nextLine(); //Consume newline

                    // Create the Furniture object
                    Furniture furniture = new Furniture(name, price, quantity, brand, roomType, dimensions, material, (int)weight, fragile, furnitureType, style, color, assembled);
                    System.out.println("Furniture item added.");
                    break;

                case 7: // CleaningSupply
                    //Prompt the user for input
                    scanner.nextLine();
                    System.out.print("Enter CleaningSupply name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();//Consume newline

                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();//Consume newline

                    System.out.print("Enter brand: ");
                    brand = scanner.nextLine();

                    System.out.print("Enter room type (e.g., Kitchen, Bathroom): ");
                    roomType = scanner.nextLine();

                    System.out.print("Enter dimensions (e.g., 12x5x3 inches): ");
                    dimensions = scanner.nextLine();

                    System.out.print("Enter material (e.g., Plastic, Glass, Metal): ");
                    material = scanner.nextLine();

                    System.out.print("Enter weight (in grams): ");
                    weight = scanner.nextInt();
                    scanner.nextLine();//Consume newline

                    System.out.print("Is the item fragile? (true/false): ");
                    fragile = scanner.nextBoolean();
                    scanner.nextLine();//Consume newline

                    System.out.print("Is it a spray cleaner? (true/false): ");
                    boolean spray = scanner.nextBoolean();
                    scanner.nextLine();//Consume newline

                    System.out.print("Enter cleaning type (e.g., Disinfectant, Stain Remover): ");
                    String cleaningType = scanner.nextLine();

                    System.out.print("Enter scent (e.g., Lemon, Lavender, Unscented): ");
                    String scent = scanner.nextLine();

                    System.out.print("Enter volume (in ounces): ");
                    double volume = scanner.nextDouble();
                    scanner.nextLine();//Consume newline

                    System.out.print("Is the item flammable? (true/false): ");
                    boolean flammable = scanner.nextBoolean();
                    scanner.nextLine();//Consume newline

                    //Create the CleaningSupply object
                    CleaningSupply cleaningSupply = new CleaningSupply(name, price, quantity, brand, roomType, dimensions, material, (int)weight, fragile, spray, cleaningType, scent, volume, flammable);
                    System.out.println("Cleaning supply added.");
                    break;


                case 8://ClothingItem
                    scanner.nextLine();
                    System.out.print("Enter ClothingItem name: ");
                    String clothingName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double clothingPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int clothingQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String clothingBrand = scanner.nextLine();
                    System.out.print("Enter material: ");
                    String clothingMaterial = scanner.nextLine();
                    System.out.print("Enter size: ");
                    String clothingSize = scanner.nextLine();
                    System.out.print("Enter season: ");
                    String clothingSeason = scanner.nextLine();
                    System.out.print("Enter top or bottom (e.g., Top or Bottom): ");
                    String topOrBottom = scanner.nextLine();

                    clothingItems.add(new ClothingItem(clothingName, clothingPrice, clothingQuantity, clothingBrand, clothingMaterial, clothingSize, clothingSeason, topOrBottom));
                    System.out.println("ClothingItem added.");
                    break;

                case 9://Shirt
                    scanner.nextLine();
                    System.out.print("Enter Shirt name: ");
                    String shirtName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double shirtPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int shirtQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String shirtBrand = scanner.nextLine();
                    System.out.print("Enter size: ");
                    String shirtSize = scanner.nextLine();
                    System.out.print("Enter color: ");
                    String shirtColor = scanner.nextLine();
                    System.out.print("Enter occasion: ");
                    String shirtOccasion = scanner.nextLine();
                    System.out.print("Enter material: ");
                    String shirtMaterial = scanner.nextLine();
                    System.out.print("Is there a design? (true/false): ");
                    boolean shirtDesign = scanner.nextBoolean();
                    scanner.nextLine();

                    shirts.add(new Shirt(shirtName, shirtPrice, shirtQuantity, shirtBrand, shirtSize, shirtColor, shirtOccasion, shirtMaterial, shirtDesign));
                    System.out.println("Shirt added.");
                    break;

                case 10://Shoe
                    scanner.nextLine();
                    System.out.print("Enter Shoe name: ");
                    String shoeName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double shoePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int shoeQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String shoeBrand = scanner.nextLine();
                    System.out.print("Enter shoe size (as String): ");
                    String shoeSize = scanner.nextLine();
                    System.out.print("Enter occasion: ");
                    String shoeOccasion = scanner.nextLine();
                    System.out.print("Enter male or female: ");
                    String maleOrFemale = scanner.nextLine();
                    System.out.print("Does it have laces? (true/false): ");
                    boolean laces = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Is it high-top or low-top? ");
                    String highOrLow = scanner.nextLine();

                    shoes.add(new Shoe(shoeName, shoePrice, shoeQuantity, shoeBrand, shoeSize, shoeOccasion, maleOrFemale, laces, highOrLow));
                    System.out.println("Shoe added.");
                    break;

                case 11://Outerwear
                    scanner.nextLine();
                    System.out.print("Enter Outerwear name: ");
                    String outerwearName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double outerwearPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int outerwearQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String outerwearBrand = scanner.nextLine();
                    System.out.print("Enter material: ");
                    String outerwearMaterial = scanner.nextLine();
                    System.out.print("Enter size: ");
                    String outerwearSize = scanner.nextLine();
                    System.out.print("Enter season: ");
                    String outerwearSeason = scanner.nextLine();
                    System.out.print("Enter top or bottom (category): ");
                    String outerwearCategory = scanner.nextLine();
                    System.out.print("Is it waterproof? (true/false): ");
                    boolean isWaterProof = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Is it hooded? (true/false): ");
                    boolean hooded = scanner.nextBoolean();
                    scanner.nextLine();

                    outerwears.add(new Outerwear(outerwearName, outerwearPrice, outerwearQuantity, outerwearBrand, outerwearMaterial, outerwearSize, outerwearSeason, outerwearCategory, isWaterProof, hooded));
                    System.out.println("Outerwear added.");
                    break;

                case 12://ElectronicsItem
                    scanner.nextLine();
                    System.out.print("Enter ElectronicsItem name: ");
                    String electronicsName = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double electronicsPrice = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter quantity: ");
                    int electronicsQuantity = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter brand: ");
                    String electronicsBrand = scanner.nextLine();

                    System.out.print("Enter screen type: ");
                    String screenType = scanner.nextLine();

                    System.out.print("Is it touchscreen? (true/false): ");
                    boolean touchScreen = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.print("Does it have Bluetooth? (true/false): ");
                    boolean bluetooth = scanner.nextBoolean();
                    scanner.nextLine();

                    electronicsItems.add(new ElectronicsItem(electronicsName, electronicsPrice, electronicsQuantity, electronicsBrand, screenType, touchScreen, bluetooth));
                    System.out.println("ElectronicsItem added.");
                    break;

                case 13://Laptop
                    scanner.nextLine();
                    System.out.print("Enter Laptop name: ");
                    String laptopName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double laptopPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int laptopQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String laptopBrand = scanner.nextLine();
                    System.out.print("Enter screen type: ");
                    String laptopScreenType = scanner.nextLine();
                    System.out.print("Is it touchscreen? (true/false): ");
                    boolean laptopTouchScreen = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Does it have Bluetooth? (true/false): ");
                    boolean laptopBluetooth = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter processor: ");
                    String processor = scanner.nextLine();
                    System.out.print("Enter operating system: ");
                    String operatingSystem = scanner.nextLine();
                    System.out.print("Enter RAM size (GB): ");
                    int ramSize = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter battery capacity: ");
                    int batteryCapacity = scanner.nextInt();
                    scanner.nextLine();

                    laptops.add(new Laptop(laptopName, laptopPrice, laptopQuantity, laptopBrand, laptopScreenType, laptopTouchScreen, laptopBluetooth, processor, ramSize, batteryCapacity, operatingSystem));
                    System.out.println("Laptop added.");
                    break;

                case 14://Phone
                    scanner.nextLine();
                    System.out.print("Enter Phone name: ");
                    String phoneName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double phonePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int phoneQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String phoneBrand = scanner.nextLine();
                    System.out.print("Enter screen type: ");
                    String phoneScreenType = scanner.nextLine();
                    System.out.print("Is it touchscreen? (true/false): ");
                    boolean phoneTouchScreen = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Does it have Bluetooth? (true/false): ");
                    boolean phoneBluetooth = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter color: ");
                    String phoneColor = scanner.nextLine();
                    System.out.print("Enter carrier: ");
                    String carrier = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String phoneModel = scanner.nextLine();
                    System.out.print("Enter storage capacity (GB): ");
                    int storageCapacity = scanner.nextInt();
                    scanner.nextLine();

                    phones.add(new Phone(phoneName, phonePrice, phoneQuantity, phoneBrand, phoneScreenType, phoneTouchScreen, phoneBluetooth, phoneColor, carrier, phoneModel, storageCapacity));
                    System.out.println("Phone added.");
                    break;

                case 15://TV
                    scanner.nextLine();
                    System.out.print("Enter TV name: ");
                    String tvName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double tvPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int tvQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String tvBrand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String tvModel = scanner.nextLine();
                    System.out.print("Enter resolution (e.g., 4K, 1080p): ");
                    String resolution = scanner.nextLine();
                    System.out.print("Enter screen size (inches): ");
                    int screenSize = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Is it a smart TV? (true/false): ");
                    boolean smartTV = scanner.nextBoolean();
                    scanner.nextLine();

                    tvs.add(new TV(tvName, tvPrice, tvQuantity, tvBrand, tvModel, resolution, screenSize, smartTV));
                    System.out.println("TV added.");
                    break;


                case 16:
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String storeItemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid price. Please enter a number.");
                        scanner.next();//Consume incorrect input
                        System.out.print("Enter price: ");
                    }
                    double storeItemPrice = scanner.nextDouble();
                    scanner.nextLine();//Consume newline

                    System.out.print("Enter quantity: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid quantity. Please enter a whole number.");
                        scanner.next();//Consume incorrect input
                        System.out.print("Enter quantity: ");
                    }
                    int storeItemQuantity = scanner.nextInt();
                    scanner.nextLine();//Consume newline

                    System.out.print("Enter brand: ");
                    String storeItemBrand = scanner.nextLine();

                    StoreItem newStoreItem = new StoreItem(storeItemName, storeItemPrice, storeItemQuantity, storeItemBrand);
                    storeItems.add(newStoreItem);
                    System.out.println("StoreItem added successfully!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 0-16.");
                    break;
            }
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("The Wilmington Quick Shop. Select category:");
        System.out.println("1. Add an item to the vehicle");
        System.out.println("2. Sell an item to a vehicle");
        System.out.println("3. Exit Shop ");
        System.out.println("Enter your selection: ");
    }

    public void printInventory() {
        System.out.println("\n========= STORE INVENTORY =========");

        printCategory(foodItems, "Food Items");
        printCategory(fruits, "Fruits");
        printCategory(vegetables, "Vegetables");
        printCategory(shelfStables, "Shelf-Stable Items");
        printCategory(householdItems, "Household Items");
        printCategory(furnitureItems, "Furniture");
        printCategory(cleaningSupplies, "Cleaning Supplies");
        printCategory(clothingItems, "Clothing Items");
        printCategory(shirts, "Shirts");
        printCategory(shoes, "Shoes");
        printCategory(outerwears, "Outerwear");
        printCategory(electronicsItems, "Electronics");
        printCategory(laptops, "Laptops");
        printCategory(phones, "Phones");
        printCategory(tvs, "TVs");
        printCategory(storeItems, "Store Items");

        System.out.println("\n========= END OF INVENTORY =========\n");
    }

    private <T> void printCategory(ArrayList<T> list, String categoryName) {
        if (!list.isEmpty()) {
            System.out.println("\n--- " + categoryName + " ---");
            for (T item : list) {
                System.out.println(item.toString());//Calls the `toString()` method of each object
            }
        }
        else {
            System.out.println("\n--- " + categoryName + " --- No items found.");
        }
    }


    public static void main(String[] args) {
        WQSVargas1Rivera2Hubbard3 manager = new WQSVargas1Rivera2Hubbard3();
        manager.addItem();
        manager.printInventory();
    }

}
