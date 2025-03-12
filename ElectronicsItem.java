public class ElectronicsItem extends Store {
    private Boolean touchScreen;
    private String screenType;
    private Boolean bluetooth;

    public ElectronicsItem(String name, double price, int quantity, String brand, String screenType, Boolean touchScreen, Boolean bluetooth) {
        super(name, price, quantity, brand);
        this.touchScreen = touchScreen;
        this.screenType = screenType;
        this.bluetooth = bluetooth;
    }
    public ElectronicsItem(){
        
    }

    public void setTouchScreen(Boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    //Getters
    public Boolean getTouchScreen() {
        return touchScreen;
    }
    public String getScreenType() {
        return screenType;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }
    @Override
    public String toString() {
        return super.getInfo() + ".\nIs touch Screen: " + getTouchScreen() + " Screen Type: " + getScreenType() + " Is Bluetooth: " + getBluetooth();
    }


}
