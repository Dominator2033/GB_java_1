package homework_7;

import java.util.Random;

public class Main {
    static Cat[] cats = new Cat[2];
    static Plate plate = new Plate(10);

    public static void main(String[] args) {

        Random rand = new Random();
        int a = rand.nextInt(10);

        // Массив котов
        // Создание котов и помещение их в массив
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("cat #" + i, a);
        }

        // Вывод котов в консоль
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Имя кота " + cats[i].getName() + " аппетит кота " + cats[i].getAppetite() + " сытость " + cats[i].isSatiety());
        }

        System.out.println();

        // Вывод информации о котах в массиве
        for (int i = 0; i < cats.length; i++) {
            plate.info(cats[i]);
        }

        eatFromPlate();

        System.out.println();

        // вывод информации о сытости котов
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " сытость " + cats[i].isSatiety());
        }

        System.out.println("Все коты накормлены!!!");

    }

    public static void eatFromPlate() {
        // Кормление котов из тарелки
        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats.length; j++) {
                if (cats[j].isSatiety() == true)
                    break;
            }
            if (cats[i].isSatiety() != true)
                cats[i].eat(plate);
        }
    }
}
