package homework_2;

import java.util.Arrays;

public class task_7 {

    /*
    7. **** Написать метод, которому на вход подаётся одномерный массив и число n
    (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */

    public static void arrayOffset(int[] arr, int n) {
        if(n > 0) {
            for(int i = 0; i < Math.abs(n); i++) {
                int x = arr[arr.length - 1];
                for(int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = x;
            }
        }
        else {
            for(int i = 0; i < Math.abs(n); i++) {
                int x = arr[0];
                for(int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = x;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

