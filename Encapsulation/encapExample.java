package Encapsulation;

public class encapExample {
    /* Using a private modifier to hide the components from the other class */
    private String name;
    private int hp = 100;
    private String weapon;

    public encapExample(String name, int health, String weapon){
        this.name = name;
        if(health > 0 && health <= 100){  // Only accepting the health if it is greater than 0 or less than and equal to 100
            this.hp = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.hp = this.hp - damage;
        if(this.hp <= 0){
            System.out.println("Player is dead!");
        }
    }

    public int getHp() {  // Using a getter method to return the value of protected components
        return hp;
    }
    public String getName(){return name;}

}
