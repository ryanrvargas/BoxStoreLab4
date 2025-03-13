/**
 * Jovani Rivera-Hernandez
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The Outerware class represents outerwear products available in a store.
 * It extends the Store class and includes attributes specific to outerwear,
 * such as material, size, season, top or bottom.
 */


public class Outerwear extends Store{
    /**
     * Private attributes representing outerwear details
     */
    private String material;
    private String size;
    private String season;
    private String TopOrBottom;

    /**
     * constructor to initialize outerwear with given parameters
     * @param material
     * @param size
     * @param season
     * @param TopOrBottom
     */
    public Outerwear (String name, double price, int quantity, String brand, String material, String size, String season, String TopOrBottom){
        super(name, price, quantity, brand);
        this.material = material;
        this.size = size;
        this.season = season;
        this.TopOrBottom = TopOrBottom;
    }

    /**
     * Retrives the material, size, season, top or bottom of the outerwear
     * @return material
     * @return size
     * @return season
     * @return TopOrBottom
     */
    public String getMaterial() {return material;}
    public String getSize() {return size;}
    public String getSeason() {return season;}
    public String getTopOrBottom() {return TopOrBottom;}

    /**
     * Updates the material of outerwear
     * @param material
     */
    public void setMaterial(String material) {this.material = material;}
    /**
     * Updates the material of outerwear
     * @param size
     */
    public void setSize(String size) {this.size = size;}
    /**
     * Updates the material of outerwear
     * @param season
     */
    public void setSeason(String season) {this.season = season;}
    /**
     * Updates the material of outerwear
     * @param topOrBottom
     */
    public void setTopOrBottom(String topOrBottom) {TopOrBottom = topOrBottom;}

    /**
     * Returns a string representation of the ElectronicsItem object, including
     * product details from the parent class and additional electronic-specific attributes.
     *
     * @return A formatted string containing product details.
     */
    @Override
    public String toString() {
        return super.getInfo() + ".\nMaterial is: " + getMaterial() +
                " | Size is: " + getSize() +
                " | Season is: " + getSeason() + " | Top or bottom: " + getTopOrBottom() ;
    }
}
