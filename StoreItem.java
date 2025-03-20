/**
 * Ryan Vargas
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The Store class represents a general product available for sale.
 * It contains attributes such as name, price, quantity, and brand.
 * This class serves as a parent class for more specific product types.
 */
import java.util.*;

public class StoreItem {
    private String name;
    private double price;
    private int quantity;
    private String brand;
    private String category;
    private String returnPolicy;


    /**
     * Constructs a Store object with specified attributes.
     *
     * @param name     The name of the product.
     * @param price    The price of the product.
     * @param quantity The available stock quantity.
     * @param brand    The brand of the product. Defaults to "Generic" if null.
     */
    public StoreItem(String name, double price, int quantity, String brand, String category, String returnPolicy) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = (brand != null) ? brand : "Generic";
        this.category = category;
        this.returnPolicy =  (returnPolicy != null) ? returnPolicy : "None" ;
    }

    /**
     * Default constructor for Store.
     * Initializes an object without setting any attributes.
     */
    public StoreItem() {
        this.name = "Unknown";
        this.price = 0;
        this.quantity = 0;
        this.brand = "Generic";
        this.category = "Unknown";
        this.returnPolicy = "None";
    }

    /**
     * Retrieves product information in a formatted string.
     *
     * @return A string representation of the product, including name, brand, price, and stock quantity.
     */
    public String toString() {
        return name + " by " + brand + " - $" + String.format("%.2f", price) + " (Stock: " + quantity + ")"  + "(Category: " + category + ")" + "(Return Policy: " + returnPolicy +")";
    }

    // =================== Getters ===================

    /**
     * Retrieves the name of the product.
     *
     * @return The product name.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return The product price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retrieves the available stock quantity.
     *
     * @return The quantity of the product in stock.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Retrieves the brand of the product.
     *
     * @return The product brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Retrieves the category of the product.
     * @return the category of item
     */
    public String getCategory() {return category;}

    /**
     * Retrieves return policy of the item
     * @return the return policy of the item
     */
    public String getReturnPolicy(){return returnPolicy;}

    // =================== Setters ===================

    /**
     * Sets the name of the product.
     *
     * @param name The new name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the price of the product.
     *
     * @param price The new price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the stock quantity of the product.
     *
     * @param quantity The new stock quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets the brand of the product.
     *
     * @param brand The new brand of the product.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Set's the category of the item
     *
     * @param category the category of the item
     */
    public void setCategory(String category){this.category = category;}

    /**
     * Set's the return policy of the item
     *
     * @param returnPolicy the return policy of the item
     */
    public void setReturnPolicy(String returnPolicy){this.returnPolicy = returnPolicy;}

}