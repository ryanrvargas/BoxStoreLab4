/**
 * Vegetable.java
 * @author Harrison Hubbard
 * Date: 3/17/2025
 * Section: CSC-331-002
 *
 * Purpose: Implementing the Vegetable class
 */



public class Vegetable extends FoodItem{

    // Attributes
    private String color;
    private String harvestDate;
    private String storageRequirements;
    private String freshness;


    public Vegetable(String name, double price, int quantity, String brand,
                     double weight, Boolean organic, String origin,
                     int calories, String expirationDate, String color,
                     String harvestDate, String storageRequirements, String freshness) {
        super(name, price, quantity, brand, weight, organic, origin, calories,expirationDate);
        this.color = color;
        this.harvestDate = harvestDate;
        this.storageRequirements = storageRequirements;
        this.freshness = freshness;
    }

    /**
     * Default constructor for Vegetable
     * Initializes an object with default values
     */
    public Vegetable() {
        super();
        this.color = null;
        this.harvestDate = null;
        this.storageRequirements = null;
        this.freshness = null;
    }

    // =================== Setters ===================

    /**
     * Sets the color of the vegetable
     * @param color the color of the vegetable
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Set's the harvest date of the vegetable
     * @param harvestDate the harvest date of the vegetable
     */
    public void setHarvestDate(String harvestDate){
        this.harvestDate = harvestDate;
    }

    /**
     * Set's the storage requirements for the vegetable
     * @param storageRequirements of the vegetable
     */
    public void setStorageRequirements(String storageRequirements) {
        this.storageRequirements = storageRequirements;
    }

    /**
     * Set's the freshness of the vegetable
     * @param freshness of a vegetable
     */
    public void setFreshness(String freshness) {
        this.freshness = freshness;
    }

    // =================== Getters ===================

    /**
     * Retrieves the color of the vegetable
     * @return the color of the vegetable
     */
    public String getColor() {
        return color;
    }

    /**
     * Retrieves the harvest date of the vegetable
     * @return the harvest date of the vegetable
     */
    public String getHarvestDate() {
        return harvestDate;
    }

    /**
     * Retrieves the storage requirements of the vegetable
     * @return the storage requirements of the vegetable
     */
    public String getStorageRequirements() {
        return storageRequirements;
    }

    /**
     * Retrieves the freshness of the vegetable
     * @return the freshness of the vegetable
     */
    public String getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nColor: " + color +
                " | Harvest Date: " + harvestDate +
                " | Storage Requirements: " + storageRequirements +
                " | Freshness: " + freshness ;
    }
}
