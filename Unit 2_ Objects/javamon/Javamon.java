package javamon;

public class Javamon {
    private String name;
    private int health = 100;
    private int strength = 20; 
    private double accuracy = 0.8;

    public Javamon(String name){
        this.name = name;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setHealth (int health){
        this.health = health;
    }
    public int getHealth() {
        if (health <= 0){
            health = 0;
        }
        else {
            return health;
        }
        return health;
    }

    public void setStrength (int strength){
        this.strength = strength;
    }
    public int getStrength (){
        if (strength <= 0) {
            strength = 1;
        }
        else {
            return strength;
        }
        return strength;
    }


    public void setAccuracy (double accuracy){
        this.accuracy = accuracy;
    }
    
    public double getAccuracy(){
        if ((accuracy >= 0.01) && (accuracy <= 1.0)) {
            return accuracy;
        }
        else if (accuracy <= 0.01) {
            accuracy = 0.01;
        }
        else {
            accuracy = 1.0;
        }
        return accuracy;
    }

    public String toString() {
        return getName() + " [" + getHealth() + "]";
    }

    public int takeDamage(int damage){
        if ((getHealth() - damage) > 0){
            return health = (getHealth() - damage);
        }
        else {
            return health = 0;
        }
    }

    public boolean isDefeated() {
        if (getHealth() <= 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void attack(Javamon enemy) {
        if (Math.random() < getAccuracy()){
            int x = (int)(Math.random() * getStrength());
            if (x > 0){
                System.out.println(toString() + " attacks " + enemy.getName() + " [" + enemy.takeDamage(x) + "] and deals " + x + " damage."  ); 
            }
            else {
                System.out.println(toString() + " attacks " + enemy.toString() + " - but the attack misses!"); 
            }
        }
        else {
            System.out.println(toString() + " attacks " + enemy.toString() + " - but the attack misses!");
        }
    }
}