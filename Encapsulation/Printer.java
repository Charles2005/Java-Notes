package Encapsulation;

public class Printer {
    // Setting up the private component
    private double tonerLevel = 0;
    private int numPages;
    private boolean duplexPrinter;

    public Printer(double tonerLevel, int numPages, boolean duplexPrinter) {
        if( tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numPages = numPages;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int amount){
        if(amount > 100){
            this.tonerLevel = 100;
        }else{
            this.tonerLevel += amount;
        }
        System.out.println("Your toner level is now at " + this.tonerLevel + "%");

    }
    public void printing(int pages) {
        if (duplexPrinter) {
            for (int i = 1; i < pages; i++) {
                System.out.println("Printing your paper");
                this.numPages += i;
                System.out.println(this.numPages);
            }
            System.out.println("Current paper pages have " + this.numPages);
        } else {
            for (int i = 1; i <= pages; i++) {
                System.out.println("Printing your paper");
                this.numPages += 1;
                System.out.println(this.numPages);
            }
            System.out.println("Current paper pages have " + this.numPages);
        }
    }
    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }
}
