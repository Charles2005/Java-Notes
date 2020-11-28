package OOPSimpleProject;

import java.util.Scanner;

public class Creature {
    private String name;
    private int hunger;
    private int boredom;
    private int tiredness;
    private int dirtiness;
    private int food;
    private boolean is_sleeping;
    private boolean is_alive;

    public Creature(String name) {
        this.name = name;
        this.hunger = 0;
        this.boredom = 0;
        this.tiredness = 0;
        this.dirtiness = 0;
        this.food = 2;
        this.is_sleeping = false;
        this.is_alive = true;
    }
    public void eat(){
        int randomNumber = (int) (Math.random() * 5) + 1;

        if(this.food != 0){
            this.food -= 1;
            this.hunger -= randomNumber;
            System.out.println(this.name + " had a great meal!");
        } else {
            System.out.println(this.name + " has no food");
        }
        if(this.hunger < 0){
            this.hunger = 0;
        }
    }
    public void play(){
        int randomNumber = (int) (Math.random() * 3);
        Scanner scanner = new Scanner(System.in);

        System.out.println(this.name + " wants to play!");
        System.out.println(this.name + " thinking of a number 0-2");
        System.out.print("\nGuess the number: ");
        int guess = scanner.nextInt();

        if(guess == randomNumber){
            System.out.println("You are correct");
            this.boredom -= 3;
        }else {
            System.out.println("You are incorrect");
            this.boredom -= 1;
        }
        if(this.boredom < 0){
            this.boredom = 0;
        }
    }
    public void sleep(){
        this.is_sleeping = true;
        this.tiredness -= 3;
        this.boredom -= 2;

        System.out.println(this.name + " is sleeping");

        if(this.tiredness < 0){
            this.tiredness = 0;
        }
        if(this.boredom < 0){
            this.boredom = 0;
        }
    }
    public void awake(){
        int randomNumber = (int) (Math.random() * 3);

        if(randomNumber == 0){
            System.out.println(this.name + " just woke up.");
            this.is_sleeping = false;
            this.boredom = 0;
        } else {
            System.out.println(this.name + " won't wake up!");
            sleep();
        }

    }
    public String clean(){
        this.dirtiness = 0;
        return this.name + " took a bath";
    }
}
