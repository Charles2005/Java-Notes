package Polymorphism;

public class Jaws extends Moviee {
    public Jaws(){
        super("Jaws");
    }
    @Override
    public String plot(){  // Polymorph Method
        return "Shark eating people";
    }
}
