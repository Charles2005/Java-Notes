package Composition;

public class Pc {
    private Case theCase;  // Composition
    private Monitor theMonitor; // Composition
    private Motherboard theMotherboard;  // Composition

    public Pc(Case theCase, Monitor monitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = monitor;
        this.theMotherboard = theMotherboard;

    }
    public void powerUp(){
       theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        theMonitor.drawPixelAt(1250,50, "red");
    }

}
