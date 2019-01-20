package homework_3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /////---<<<< Задание №1
        Scanner scanner = new Scanner(System.in);
        threeAtempts();
        while(true){
            System.out.println("Повторить игру еще раз? 1 - да, 0 - нет");
            int b = scanner.nextInt();
            if (b == 1) {
                threeAtempts();
            }
            else {
                System.out.println("Игра окончена, выбран \"0\"");
                break;
            }
        }
        /////--->>>>
        System.out.println("");
        System.out.println("НАЧАЛО ВЫПОЛНЕНИЯ ЗАДАНИЯ №2");
        System.out.println("");
        /////---<<<< Задание №2
        arrayOfStrings();
        /////--->>>>
    }
    /*
     1 Написать программу, которая загадывает случайное число от 0 до 9,
     и пользователю дается 3 попытки угадать это число.
     При каждой попытке компьютер должен сообщить больше ли указанное пользователем число,
     чем загаданное, или меньше.
     После победы или проигрыша выводится ​з​апрос​​ –​​ «Повторить​​ игру​​ еще​​ раз?​​ 1​​–​​да​/ ​​​0​​–​​нет»
     (1​​–​​повторить,​​0​​–​​нет).
    */
    public static void threeAtempts() {

        Random rand = new Random();
        int x = rand.nextInt(10);

        System.out.println("Загаданное число х = " + x);

        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                int a = sc.nextInt();
                if(a == x) {
                    System.out.println("Вы угадали число x, x = " + a);
                    System.out.println("Игра окончена");
                    break;
                }
                else if (a < x) {
                    System.out.println("Введенное число МЕНЬШЕ загаданного");
                }
                else if(a > x) {
                    System.out.println("Введенное число БОЛЬШЕ загаданного");
                }
                if(i == 2) {
                    System.out.println("Игра окончена");
                }
                else {
                    System.out.println("Введите число снова");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Необходимо ввести число!!!");
        }
    }


    /*
    *​​Создать ​​массив​​ из ​​слов

    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
    "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
    "nut", "olive", "pea", "peanut",​"​pear",​"​pepper",​"​pineapple",​"​pumpkin",​"​potato"};

    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    Если слово​​ не ​​угадано,​ к​омпьютер​​ показывает ​​буквы​ к​оторые​​ стоят​​ на ​​своих ​​местах.
    apple​​–​з​агаданное
    apricot​-​​​ответ ​​игрока
    ap#############​ (​15​​символов,​​чтобы​​ пользователь ​​не​​ мог ​​узнать ​​длину ​​слова)
    Для​​ сравнения ​​двух​​ слов​​ посимвольно, ​​можно ​​пользоваться:
    String ​​str ​= ​"​apple";
    str.charAt(0); ​ -​​​метод, ​​вернет ​​char,​к​оторый ​​стоит ​​в ​​слове ​​str ​​на ​​первои ̆​​позиции
    Играем​​ до т​ех​​ пор,​​ пока​​ игрок​​ не​​ отгадает ​​слово
    Используем​т​олько​​маленькие​​буквы
     */

    public static void arrayOfStrings() {
        String[] words = {  "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };
        System.out.println(Arrays.toString(words));
        System.out.println("");

        //Загадываем рандомное слово из массива строк
        Random rand = new Random();
        int n = rand.nextInt(words.length);
        System.out.println("Загаданное компьютером слово: " + words[n]);
        System.out.println("");


        Scanner sc = new Scanner(System.in);
        String word;
        char[] compWord = words[n].toCharArray();
        char[] symbol = new char[15];

        //Заполнение символьного массива #
        for (int i = 0; i < symbol.length; i++) {
            symbol[i] = '#';
        }
        // System.out.println(Arrays.toString(symbol));

        while (true) {
            System.out.println("Введите слово, которое загадал компьютер: ");
            word = sc.nextLine();
            if (word.equalsIgnoreCase(words[n])) {
                System.out.println("Вы верно угадали слово. Игра окончена");
                break;
            }
            else {
                char[] userWord = word.toCharArray();
                for (int i = 0; i < compWord.length; i++) {
                    if(i >= userWord.length) {
                        break;
                    }
                    if(compWord[i] == userWord[i]) {
                        symbol[i] = compWord[i];
                    }
                }
            }
            for (int i = 0; i < symbol.length; i++) {
                System.out.print(symbol[i]);
            }
            System.out.println("");

        }
    }


}
