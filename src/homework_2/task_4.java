package homework_2;

public class task_4 {
    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    ​​и​​ с​​ помощью​​ цикла(-ов)​ з​аполнить ​​его ​​диагональные ​​элементы​​ единицами;
    */
    public static void fillDiagonal() {
        int length = 4;
        int[][] arr = new int[length][length];
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
