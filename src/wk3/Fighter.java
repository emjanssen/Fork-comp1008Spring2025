package wk3;

public class Fighter {

    private String name = "Fighter";
    private int health = 50, power = 5;

    public static int MAX_HEALTH = 100, MIN_HEALTH = 50,
    MAX_POWER = 10, MIN_POWER = 5, MIN_NUM_CHARS = 3;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(power >= MIN_POWER && power <= MAX_POWER)
            this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health >= MIN_HEALTH && health <= MAX_HEALTH)
            this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= MIN_NUM_CHARS)
            this.name = name;
    }
    public void getAttacked(int power){
        if(power >= MIN_POWER && power <=MAX_POWER)
            health -= power;
    }
    public boolean isAlive(){
        return health > 0;
    }
    public Fighter(){}

    public Fighter(String name, int health, int power) {
//        this.name = name;
//        this.health = health;
//        this.power = power;
        setHealth(health);
        setName(name);
        setPower(power);
    }
    public String toString(){
        return String.format("%s's attack power is %d and has a health level of %d",
                name, power, health
                );
    }
}
