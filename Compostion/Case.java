package Compostion;

public class Case {
    private String model;
    private String manufacturer;
    private String powersupply;
    private Dimension theDimension; // Composition

    public Case(String model, String manufacturer, String powersupply, Dimension theDimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
        this.theDimension = theDimension;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed, it is booting!");

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimension getDimension() {
        return theDimension;
    }
}
