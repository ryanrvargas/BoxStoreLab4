/**
 * Fruit.java
 * @author Harrison Hubbard
 * Date: 3/12/2025
 * Section: CSC-331-002
 *
 * Purpose: Implementing the fruit class
 */



public class Fruit extends FoodItem {

    // Attributes
    private String color;
    private Boolean ripe;
    private String harvestDate;

    /**
     *
     * Constructs a Fruit object with specified attributes
     *
     * @param name              The name of the fruit
     * @param price             The price of the fruit
     * @param quantity          The amount of fruit
     * @param brand             The brand of fruit
     * @param category          The category of item
     * @param returnPolicy      The return policy of the item
     * @param weight            The weight of fruit
     * @param organic           If the fruit is organic or not
     * @param origin            The country of origin of the fruit
     * @param calories          The number of calories in the fruit
     * @param expirationDate    The expiration date of the fruit
     * @param color             The color of the fruit
     * @param ripe              Whether the fruit is ripe or not
     * @param harvestDate       The harvest Date of the fruit
     */
    public Fruit (String name, double price, int quantity, String brand,
                        String category, String returnPolicy,
                        double weight, Boolean organic, String origin, int calories, String expirationDate,
                         String color, Boolean ripe, String harvestDate) {
        super(name, price, quantity, brand, category,returnPolicy, weight, organic, origin, calories, expirationDate);
        this.color = color;
        this.ripe = ripe;
        this.harvestDate = harvestDate;
    }

    /**
     * Default constructor for Fruit
     * Initializes an object with default values
     */
    public Fruit() {
        super();
        this.color = null;
        this.ripe = null;
        this.harvestDate = null;
    }

    // =================== Setters ===================

    /**
     * Set's the color of the fruit
     * @param color The color of the fruit
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Set's if the fruit is ripe or not
     * @param ripe If the fruit is ripe or not
     */
    public void setRipe(Boolean ripe){
        this.ripe = ripe;
    }

    /**
     * Set's the harvest date of the fruit
     * @param harvestDate the harvest date of the fruit
     */
    public void setHarvestDate(String harvestDate) {
        this.harvestDate = harvestDate;
    }

    // =================== Getters ===================

    /**
     * Retrieves the color of fruit
     * @return the color of the fruit
     */
    public String getColor() {
        return color;
    }

    /**
     * Retrieves the ripeness of the fruit
     * @return if the fruit is ripe or not
     */
    public Boolean getRipe() {
        return ripe;
    }

    /**
     * Retrieves the harvest date of the fruit
     * @return the harvest date of the fruit
     */
    public String getHarvestDate() {
        return harvestDate;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nColor: " + color +
                " | Ripe: " + ripe +
                " | Harvest Date: " + harvestDate;

    }
}
