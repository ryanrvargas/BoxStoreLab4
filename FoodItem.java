/**
 * FoodItem.java
 * @author Harrison Hubbard
 * Date: 3/12/2025
 * Section: CSC-331-002
 *
 * Purpose: Implementing the Food item class
 */


public class FoodItem extends StoreItem {

    // Attributes
    private double weight;
    private Boolean organic;
    private String origin;
    private int calories;
    private String expirationDate;

    // Constructor

    /**
     * Constructor with all 6 attributes as parameters
     * @param name              The name of the food item
     * @param price             The price of the food item
     * @param quantity          The quantity of the food item
     * @param brand             The brand of the food item
     * @param category          The category of item (Food)
     * @param returnPolicy      The return policy of the item (Default = None)
     * @param weight            The weight of the item
     * @param organic           If the food item is organic or not
     * @param origin            The origin of the food item
     * @param calories          The calories of the food item
     * @param expirationDate    The expiration date of the food item
     */
    public FoodItem (String name, double price, int quantity, String brand,String category, String returnPolicy, double weight,Boolean organic, String origin, int calories, String expirationDate){
        super(name,price,quantity,brand,category,returnPolicy);
    }

    /**
     * No argument Constructor
     * This is equivalent to a default constructor
     */
    public FoodItem(){

    }

    // Gettors
    public double getWeight() {
        return weight;
    }
    public Boolean getOrganic(){
        return organic;
    }
    public String getOrigin(){
        return origin;
    }
    public int getCalories(){
        return calories;
    }
    public String getExpirationDate(){
        return expirationDate;
    }

    // Setters

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setOrganic(Boolean organic){
        this.organic = organic;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString(){
        return super.toString() + ".\nWeight: " + getWeight() + "Is Organic: " + getOrganic() + "Origin: " + getOrigin() + "Calorie Amount: " + getCalories() + "Expiration Date: " + getExpirationDate();
    }
}
