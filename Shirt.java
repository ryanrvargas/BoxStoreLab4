/**
 * Jovani Rivera-Hernandez
 * Date: March 16, 2025
 * Section: 331 002
 *
 * The Shirt class represents shirt products available in a store.
 * It extends the Store class and includes attributes specific to shirts,
 * such as size, color, occasion, material, design.
 */

public class Shirt extends StoreItem {
    /**
     * private attributes representing shirt details
     */
    private String size;
    private String color;
    private String occasion;
    private String material;
    private boolean design;

    /**
     * constructor to initialize shirt with given parameters
     * @param name              The name of the shirt
     * @param price             The price of the shirt
     * @param quantity          The quantity of the shirt
     * @param brand             The brand of the shirt
     * @param category          The category of the item
     * @param returnPolicy      The return policy of the item
     * @param size              The size of the shirt
     * @param color             The color of the shirt
     * @param occasion          The occasion of the shirt
     * @param material          The material of the shirt
     * @param design            The design of the shirt
     */
    public Shirt (String name, double price, int quantity,String category, String returnPolicy, String brand, String size, String color, String occasion, String material, boolean design){
        super(name, price, quantity, brand,category,returnPolicy);
        this.size = size;
        this.color = color;
        this.occasion = occasion;
        this.material = material;
        this.design = design;
    }

    /**
     * Retrieves size, color, occasion, material, design of a shirt
     * @return size             The size of the shirt
     * @return color            The color of the shirt
     * @return occasion         The occasion you wear the shirt
     * @return material         The material of the shirt
     * @return design           The design of the shirt
     */
    public String getSize() {return size;}
    public String getColor() {return color;}
    public String getOccasion() {return occasion;}
    public String getMaterial() {return material;}
    public boolean isDesign() {return design;}

    /**
     * updates the size of the shirt
     * @param size
     */
    public void setSize(String size) {this.size = size;}

    /**
     * updates the color of the shirt
     * @param color
     */
    public void setColor(String color) {this.color = color;}

    /**
     * updates the occasion of the shirt
     * @param occasion
     */
    public void setOccasion(String occasion) {this.occasion = occasion;}

    /**
     * updates the material of the shirt
     * @param material
     */
    public void setMaterial(String material) {this.material = material;}

    /**
     * updates if shirt has a design or not
     * @param design
     */
    public void setDesign(boolean design) {this.design = design;}

    /**
     * Returns a string representation of the ClothingItem object, including
     * product details from the parent class and additional shirt specified attributes
     * @return a formatted string containing product details.
     */
    @Override
    public String toString() {
        return super.toString() + ".\nShirt size is: " + getSize() +
                " | Shirt color is: " + getColor() +
                " | Occasion of shirt: " + getOccasion() + " | Shirt is made of: " + getMaterial() +
                " | Does shirt have a design: " + isDesign();
    }

}
