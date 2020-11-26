package Compostion;

import Compostion.Case;
import Compostion.Monitor;
import Compostion.Motherboard;

public class Pc {
    private Case theCase;  // Composition
    private Monitor monitor; // Composition
    private Motherboard motherboard;  // Composition

    public Pc(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;

    }
    public void powerUp(){
       theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(1250,50, "red");
    }

}
