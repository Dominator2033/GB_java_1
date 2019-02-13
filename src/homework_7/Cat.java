package homework_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {return name; }

    public void setSatiety(boolean satiety) {this.satiety = satiety;}

    public int getAppetite() {return appetite;}

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {plate.decreaseFood(appetite, this);}
}
