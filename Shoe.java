/**
 * Jovani Rivera-Hernandez
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The Outerware class represents outerwear products available in a store.
 * It extends the Store class and includes attributes specific to outerwear,
 * such as material, size, season, top or bottom.
 */


public class Shoe extends StoreItem {
    /**
     * private attributes representing shoe details
     */
    private String size;
    private String occasion;
    private String maleOrFemale;
    private boolean laces;
    private String hightopOrLowtop;

    /**
     * constructor to initialize shoe with given parameters
     * @param name
     * @param price
     * @param quantity
     * @param brand
     * @param size
     * @param occasion
     * @param maleOrFemale
     * @param laces
     * @param hightopOrLowtop
     */
    public Shoe (String name, double price, int quantity, String brand, String size, String occasion, String maleOrFemale, boolean laces, String hightopOrLowtop){
        super(name, price, quantity, brand);
        this.size = size;
        this.occasion = occasion;
        this.maleOrFemale = maleOrFemale;
        this.laces = laces;
        this.hightopOrLowtop = hightopOrLowtop;
    }

    /**
     * retrives size, occasion, male or female, laces, hightop or lowtop of a shoe
     * @return size
     * @return occasion
     * @return male or female
     * @return laces
     * @return hightop or lowtop
     */
    public String getSize() {return  size;}
    public String getOccasion() {return occasion;}
    public String getMaleOrFemale() {return maleOrFemale;}
    public boolean isLaces() {return laces;}
    public String getHightopOrLowtop() {return hightopOrLowtop;}

    /**
     * updates the size of the shoe
     * @param size
     */
    public void setSize(String size) {this.size = size;}

    /**
     * updates the occasion of the shoe
     * @param occasion
     */
    public void setOccasion(String occasion) {this.occasion = occasion;}

    /**
     * updates if shoe is a male or female shoe
     * @param maleOrFemale
     */
    public void setMaleOrFemale(String maleOrFemale) {this.maleOrFemale = maleOrFemale;}

    /**
     * updates if shoe has laces or not
     * @param laces
     */
    public void setLaces(boolean laces) {this.laces = laces;}

    /**
     * updates if shoe is a hightop or lowtop
     * @param hightopOrLowtop
     */
    public void setHightopOrLowtop(String hightopOrLowtop) {this.hightopOrLowtop = hightopOrLowtop;}


    /**
     * Returns a string representation of the ElectronicsItem object, including
     * product details from the parent class and additional electronic-specific attributes.
     *
     * @return A formatted string containing product details.
     */
    @Override
    public String toString() {
        return super.toString() + ".\nShoe size is: " + getSize() +
                " | Occasion is: " + getOccasion() +
                " | Male or Female shoe: " + getMaleOrFemale() + " | Has laces: " + isLaces() + " | Is shoe a hightop or lowtop: " + getHightopOrLowtop() ;
    }

}
