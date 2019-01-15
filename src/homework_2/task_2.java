package homework_2;

import java.util.Arrays;

public class task_2 {
    /*
    2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями​​ 0​​ 3 ​​6 ​​9 ​​12 ​​15 ​​18 ​​21;
    */
    public static void fillArray() {
        int[] arr = new int[8];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count = count + 3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
