package Compostion;

public class Pc {
    private Case theCase;  // Composition
    private Monitor monitor; // Composition
    private Motherboard theMotherboard;  // Composition

    public Pc(Case theCase, Monitor monitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.theMotherboard = theMotherboard;

    }
    public void powerUp(){
       theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(1250,50, "red");
    }

}
