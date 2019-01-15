package homework_2;

public class task_6 {
    /*
    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true если в массиве есть место,
    в котором сумма левой и правой части массива равны.
    ​Примеры:
    checkBalance ([1, 1, 1, || 2, 1]) → true,
    checkBalance ([2, 1, 1, 2, 1]) → false,
    checkBalance ([10, || 10]) → true,
    граница показана символами ||, эти символы в массив не входят.
     */
    public static boolean getSum(int[] arr) {

        int div = arr.length / 2;
        int div_mod = arr.length % 2;
        int div_result = div + div_mod;

        int sum_first_part = 0;
        int sum_second_part = 0;

        for(int i = 0; i < div_result; i++) {
            sum_first_part += arr[i];
        }

        for(int i = div_result; i < arr.length; i++) {
            sum_second_part += arr[i];
        }

        if(sum_first_part == sum_second_part) return true;
        else return false;
    }
}
