package homework_2;

import java.util.Arrays;

public class task_3 {
    /*
   3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
   и числа меньшие 6 умножить​​ на ​​2;
   */
    public static void changeArray() {
        int[] arr_task3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println(Arrays.toString(arr_task3));

        for(int i = 0; i < arr_task3.length; i++) {
            if( arr_task3[i] < 6) {
                arr_task3[i] = arr_task3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr_task3));
    }

}
