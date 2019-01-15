package homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 1. Создать ​​пустой ​​проект ​​в ​I​ntelliJ​I​DEA ​​и​​прописать ​​метод ​​main();

    public static void main(String[] args) throws IOException {

        // 2. Создать ​​переменные ​​всех ​​пройденных ​т​ипов ​​данных, ​​и​​инициализировать ​​их​ з​начения;

        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        char c = 'A';
        float f = 0.0f;
        double d = 0.0;
        boolean boo = false;

        // Проверка задания номер 3.
        System.out.println(getResult(2,5,12,4));

        // Проверка задания номер 4.
        System.out.println(getNumber(10, 5));

        // Проверка задания номер 5.
        setNumber(5);

        // Проверка задания номер 6.
        System.out.println(getBooleanResult(5));

        // Проверка задания номер 7.
        setName("Кирилл");

        // Проверка задания номер 8.
        LeapYear();
    }
    /*
     3. Написать ​​метод ​​вычисляющий ​​выражение ​​a​*​​(​b​​+​(​c​/​​​d)) ​​и ​​возвращающий ​​результат,
     где ​​a,​​b,​​c,​​d​​–​​входные ​​параметры ​​этого ​​метода;
    */

    private static int getResult(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return result;
    }

    /*
     4. Написать метод, принимающий на вход два числа,
     и проверяющий что их сумма лежит впределах ​​от ​​10 ​​до ​​20(включительно),
     ​​если ​​да ​​– ​​вернуть ​t​rue, ​​в​​ противном ​​случае ​​– ​f​alse;
    */

    private static boolean getNumber(int a, int b) {
        boolean boo = false;
        int sum = a + b;
        if(sum >= 10 && sum <= 20) return true;
        else return false;
    }

    /*
     5. Написать метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль положительное ли число передали, или отрицательное; ​
     Замечание: ноль​​ считаем​​ положительным ​​числом.
     */

    private static void setNumber(int number) {
        if(number >= 0) System.out.println("Переданное число - положительное");
        else System.out.println("Переданное число - отрицательное");
    }

    /*
     6. Написать метод, которому в качестве параметра передается целое число,
     метод должен вернуть​ t​rue,​​ если​​ число​​ отрицательное;
     */

    private static boolean getBooleanResult(int a) {
        if(a >= 0) return true;
        else return false;
    }

    /*
     7. Написать метод, которому в качестве параметра передается строка,
     обозначающая имя, метод​​ должен​​ вывести ​​в​ к​онсоль​​ сообщение​​ «Привет,​​указанное_имя!»;
     */

    private static void setName(String name) {
        System.out.println("Привет, " + name);
    }

    /*
     8. *Написать метод, который определяет является ли год високосным,
     и выводит сообщение в консоль. Каждый 4-й год является високосным,
     кроме каждого 100-го, при этом каждый 400-й –високосный.
     */
    private static void LeapYear() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите год: ");
        int year = Integer.parseInt(reader.readLine());

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным ");
        }
        else System.out.println("Обычный " + year + " год");
    }

}

