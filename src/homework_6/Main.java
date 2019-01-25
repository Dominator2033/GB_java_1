package homework_6;

import java.util.ArrayList;

///////// Хотелось бы услышать какие-то комментарии по Д/З
///////// 1) Оформление кода? Какие моменты учесть и что изменить в оформлении
///////// 2) Правильно ли я понял и сделал пункт под звездочкой?  * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
///////// 3) Всю ли домашку выполнил правильно? Нужно под каждого животного заводить класс?(как реализовано у меня)
/////////    Или же нужно было создать какие-то условия в классах Cat и Dog, а потом создавать просто их объекты?
///////// 4) Какие будут рекомендации?


public class Main {
    public static void main(String[] args) {
        int length_run = 400;
        double height_jump = 0.6;
        int length_swim = 10;
        // Массивы животных
       // Dog[] list = new Dog[3];
        ArrayList<Dog> list = new ArrayList<Dog>();
        Cat[] cats_list = new Cat[3];

        // Создание собак
        Dog dog1 = new Dog();
        //list[0] = dog1;
        list.add(dog1);
        dog1.setName("Spike");

        DogDoberman sheepDog = new DogDoberman();
        //list[1] = sheepDog;
        list.add(sheepDog);
        sheepDog.setName("Bethoven");

        DogBoxer boxer = new DogBoxer();
        //list[2] = boxer;
        list.add(boxer);
        boxer.setName("Juchka");

        // Создание кошек
        Cat cat1 = new Cat();
        cats_list[0] = cat1;
        cat1.setName("Barsik");

        CatRagdoll ragdoll = new CatRagdoll();
        cats_list[1] = ragdoll;
        ragdoll.setName("Ragdoll");

        CatBirman birman = new CatBirman();
        cats_list[2] = birman;
        birman.setName("Birman");


        for (int i = 0; i < cats_list.length; i++) {
            System.out.println("Кот " + cats_list[i].getName() + " бежит дистанцию на " + length_run + "м - " + cats_list[i].run(length_run));
            System.out.println("Кот " + cats_list[i].getName() + " плывет дистанцию на " + length_swim + "м - " + cats_list[i].swim(length_swim));
            System.out.println("Кот " + cats_list[i].getName() + " прыгает на высоту " + height_jump + "м - " + cats_list[i].jump(height_jump));
            System.out.println();
        }
// Собаки в массиве
//        for (int i = 0; i < list.length; i++) {
//            System.out.println("Собака " + list[i].getName() + " бежит дистанцию на " + length_run + "м - " + list[i].run(length_run));
//            System.out.println("Собака " + list[i].getName() + " плывет дистанцию на " + length_swim + "м - " + list[i].swim(length_swim));
//            System.out.println("Собака " + list[i].getName() + " прыгает на высоту " + height_jump + "м - " + list[i].jump(height_jump));
//            System.out.println();
//        }
// Собаки в коллекции
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Собака " + list.get(i).getName() + " бежит дистанцию на " + length_run + "м - " + list.get(i).run(length_run));
            System.out.println("Собака " + list.get(i).getName() + " плывет дистанцию на " + length_swim + "м - " + list.get(i).swim(length_swim));
            System.out.println("Собака " + list.get(i).getName() + " прыгает на высоту " + height_jump + "м - " + list.get(i).jump(height_jump));
            System.out.println();
        }
    }
}
