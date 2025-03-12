public class Phone extends ElectronicsItem{
    private String color;
    private String carrier;
    private String model;
    private int storage;

    public Phone(String name, double price, int quantity, String brandString, String screenType, boolean touchScreen,
                 boolean bluetooth, String operatingSystem, boolean is5G, int storageCapacity) {
        super(name, price, quantity, brandString, screenType, touchScreen, bluetooth);
    }

    public Phone(){
    }

}
