package homework_2;

import java.util.Arrays;

// ДЗ №2
public class Main {
    public static void main(String[] args) {

        // Проверка задания номер 1.
        task_1.invertArray();

        // Проверка задания номер 2.
        task_2.fillArray();

        // Проверка задания номер 3.
        task_3.changeArray();

        // Проверка задания номер 4.
        task_4.fillDiagonal();

        // Проверка задания номер 5.
        task_5.MinMaxArray();

        // Проверка задания номер 6.
        int[] arr = {1, 1, 1, 2, 1};
        System.out.println(task_6.getSum(arr));
        int[] arr1 = {2, 1, 1, 2, 1};
        System.out.println(task_6.getSum(arr1));
        int[] arr2 = {10, 10};
        System.out.println(task_6.getSum(arr2));

        // Проверка задания номер 7.
        int[] arra = {1, 2, 3, 4};
        int n = -1;
        System.out.println(Arrays.toString(arra));
        task_7.arrayOffset(arra, n);
    }
}


