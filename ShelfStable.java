/**
 * ShelfStable.java
 * @author Harrison Hubbard
 * Date: 3/13/2025
 * Section: CSC-331-002
 *
 * Purpose: Implementing the ShelfStable  class
 */


public class ShelfStable extends FoodItem {

    // Attributes
    private String type;
    private String manufacturedDate;
    private String allergyInfo;
    private String packageType;

    // Constructor

    /**
     *
     * @param name                  The name of the ShelfStable item
     * @param price                 The price of the ShelfStable item
     * @param quantity              The quantity of the ShelfStable item
     * @param brand                 The brand of the ShelfStable item
     * @param weight                The weight of the ShelfStable item
     * @param organic               If the ShelfStable item  is Organic or not
     * @param origin                The origin of the ShelfStable item
     * @param calories              The amount of calories in the ShelfStable item
     * @param expirationDate        The expiration date of the ShelfStable item
     * @param type                  The type of ShelfStable item
     * @param manufacturedDate      The manufactured date of the ShelfStable item
     * @param allergyInfo           The allergy info of the ShelfStable item
     * @param packageType           The packaging of the ShelfStable item
     */
    public ShelfStable (String name, double price, int quantity, String brand,
             double weight, Boolean organic, String origin, int calories, String expirationDate,
             String type, String manufacturedDate, String allergyInfo, String packageType)
    {
        super(name, price, quantity, brand, weight, organic, origin, calories, expirationDate);
        this.type = type;
        this.manufacturedDate = manufacturedDate;
        this.allergyInfo = allergyInfo;
        this.packageType = packageType;


    }

    /**
     * Default constructor for ShelfStable.
     * Initializes an object with default values.
     */

    public ShelfStable(){
        super();
        this.type = null;
        this.manufacturedDate = null;
        this.allergyInfo = null;
        this.packageType = null;
    }

    // Setters

    /**
     * Sets the type of the shelf stable item
     *
     * @param type The type of ShelfStable
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets the manufactured date of the shelf stable item
     *
     * @param manufacturedDate  Date the shelf stable item was manufactured
     */
    public void setManufacturedDate(String manufacturedDate){
        this.manufacturedDate = manufacturedDate;
    }

    /**
     * Sets the allergy info of the shelf stable item
     *
     * @param allergyInfo The allergy info of the shelf stable item
     */
    public void setAllergyInfo(String allergyInfo) {
        this.allergyInfo = allergyInfo;
    }

    /**
     * Sets the package type of the shelf stable item
     *
     * @param packageType The packaging type of the shelf stable item
     */
    public void setPackageType(String packageType){
        this.packageType = packageType;
    }

    // Getters

    /**
     * Retrieves the type of shelf stable
     *
     * @return The type of shelf stable
     */
    public String getType() {
        return type;
    }

    /**
     * Retrieves the manufactured date of the shelf stable
     *
     * @return the manufactured date of the shelf stable
     */
    public String getManufacturedDate(){
        return manufacturedDate;
    }

    public String getAllergyInfo() {
        return allergyInfo;
    }

    public String getPackageType() {
        return packageType;
    }

    /**
     * Return a string representation of the ShelfStable object, including item details
     * from parent classes and additional shelf stable specific attributes
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() +
                "\n Type: " + type +
                " | Manufactured Date: " + manufacturedDate +
                " | Allergy Info: " + allergyInfo +
                " | Package Type: " + packageType;
    }
}
