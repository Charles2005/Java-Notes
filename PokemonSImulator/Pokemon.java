package PokemonSImulator;

import java.util.Scanner;

public class Pokemon {
    private String name;
    private String element;
    private int currentHealth;
    private int maxHealth;
    private int speed;
    private boolean isAlive = true;

    public Pokemon(String name, String element, int currentHealth, int maxHealth, int speed){
        this.name = name;
        this.element = element;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.speed = speed;
    }
    public void lightAttack(Pokemon enemy){
        int damage = (int) (Math.random() * 25) + 15;

        System.out.println(this.name + " used " + this.moves[0] + "." );

        System.out.println("It dealt " + damage + " damage.");

        enemy.currentHealth -= damage;
    }
    public void heavy_attack(Pokemon enemy){
        int damage = (int) (Math.random() * 50);

        System.out.println(this.name + " used " + this.moves[1] + ".");

        if(damage < 10){
            System.out.println("Attack missed");
        }

        System.out.println("It dealt " + damage + " damage.");
        enemy.currentHealth -= damage;

    }
    public void restore(){
        int heal = (int) (Math.random() * 25) + 15;

        System.out.println(this.name + " used " + this.moves[2] + ".");

        System.out.println(this.name +  "  health is restored by " + heal + " health points.");
        this.currentHealth += heal;

        if(this.currentHealth > this.maxHealth){
            this.currentHealth = this.maxHealth;
        }
    }
    public void faint(){
        Scanner scanner = new Scanner(System.in)
        if(this.currentHealth == 0){
            this.isAlive = false;

            System.out.println(this.name + " has fainted");

            System.out.println("Press Enter to Continue");

            scanner.nextLine();
        }
    }
    public void showStats(){
        System.out.println("Name: " + this.name);
        System.out.println("Element: " + this.element);
        System.out.println("Health: " + this.currentHealth + "/" + this.maxHealth);
        System.out.println("Speed: " + this.speed);
    }
}
