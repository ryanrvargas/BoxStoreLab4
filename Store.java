public class Store {
    private String name;
    private double price;
    private int quantity;
    private String brand;

    // Constructor
    public Store(String name, double price, int quantity, String brand) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = (brand != null) ? brand : "Generic";
    }

    public Store(){

    }

    // Get product information
    public String getInfo() {
        return name + " by " + brand + " - $" + String.format("%.2f", price) + " (Stock: " + quantity + ")";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}


