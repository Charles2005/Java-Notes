package Composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSLots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int carsSLots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSLots = carsSLots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCarsSLots() {
        return cardSLots;
    }

    public String getBios() {
        return bios;
    }
}

