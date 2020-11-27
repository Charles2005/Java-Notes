import Compostion.*;
import Inheritance.*;
import ExampleOfClasses. *;

public class Practice {

    public static void main(String[] args){
       Dimension dimension = new Dimension(20,20,5);
       Case theCase = new Case("NXT","ASUS", "550 watts", dimension );

       Monitor theMonitor = new Monitor("32 inch beast", "Acer", 32, new Resolution(2540, 1400));
       Motherboard theMotherboard = new Motherboard("B550", "Asus", 4, 8, "v.5.5");

       Pc pc = new Pc(theCase, theMonitor, theMotherboard);
       pc.powerUp();


    } // End of main method


}
