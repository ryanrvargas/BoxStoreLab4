/**
 * FoodItem.java
 * @author Harrison Hubbard
 * Date: 3/12/2025
 * Section: CSC-331-002
 *
 * Purpose: Implementing the Food item class
 */
import java.util.*;

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
     * @param name
     * @param price
     * @param quantity
     * @param brand
     * @param description
     * @param weight
     * @param organic
     * @param origin
     * @param calories
     * @param expirationDate
     */
    public FoodItem (String name, double price, int quantity, String brand, String description, double weight,Boolean organic, String origin, int calories, String expirationDate){
        super(name,price,quantity,brand,description);
        this.weight = weight;
        this.organic = organic;
        this.origin = origin;
        this.calories = calories;
        this.expirationDate = expirationDate;
    }

    /**
     * No argument Constructor
     * This is equivalent to a default constructor
     */
    public FoodItem(){
        super();
        this.weight = 0;
        this.organic = null;
        this.origin = null;
        this.calories = 0;
        this.expirationDate = null;
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
