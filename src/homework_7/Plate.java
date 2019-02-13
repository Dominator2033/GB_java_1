package homework_7;

import java.util.Scanner;

public class Plate {
    private int food;

    Scanner sc = new Scanner(System.in);
    public Plate(int food) { this.food = food;}

    public void info(Cat cat) {
        System.out.println("Еды в тарелке " + food + " сытость " + cat.isSatiety() + " имя кота " + cat.getName());
    }

    // вычитание еды
    public void decreaseFood(int appetite, Cat cat) {
        if(food < appetite) {
            while (true) {
                addFood();
                if (food >= appetite) {
                    food -= appetite;
                    cat.setSatiety(true);
                    break;
                }
            }
        }
        else if (food >= 0 && food >= appetite){
            food -= appetite;
            cat.setSatiety(true);
        }
    }

    // Метод добавления еды
    public void addFood() {
        System.out.println("Добавьте еще еды");
        int add = sc.nextInt();
        this.food += add;
    }
}
