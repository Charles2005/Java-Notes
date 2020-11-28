package Polymorphism;

public class IndependenceDay extends Moviee{
    public IndependenceDay(){
        super("Independence Day");
    }
    @Override
    public String plot(){  // Polymorph Method
        return "Alien attempts to take over planet earth";
    }
}
