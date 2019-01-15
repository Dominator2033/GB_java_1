package homework_2;

import java.util.Arrays;

public class task_5 {
    /*
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи ​​интернета);
 */
    public static void MinMaxArray() {
        int[] arr = { 5, 1, 3, 4, 2 };
        int max = 0;
        int min = 0;
        int a;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;
            }
        }

        for (int anArr : arr) {
            max = arr[0];
            min = anArr;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }

}
