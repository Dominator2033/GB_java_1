package homework_4;

import java.util.Random;
import java.util.Scanner;

class Main {
    public static char[][] map;
    public static final int SIZE = 4;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    // Основной метод
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if(checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn(DOT_O);
            printMap();
            if(checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена.");
    }

    // Инициализация массива
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // Печать массива в консоль вместе с шапкой
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Ход игрока
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    // Проверка на пустое значение
    private static boolean isCellValid(int x, int y) {
        if(x < 0 || x >=SIZE || y < 0 || y >= SIZE) return false;
        if(map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    // Проверка на наличие доступных ходов
    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    // Проверка на победу
    public static boolean checkWin(char symb) {
        int countX;
        int countY;
        int countDiagonalA = 0;
        int countDiagonalB = 0;

        for (int i = 0; i < SIZE; i++) {
            countX = 0;
            countY = 0;
            //
            for (int j = 0; j < SIZE; j++) {
                // Проверка по горизонтали
                if (map[i][j] == symb) {
                    countX++;
                    if (countX == DOTS_TO_WIN) return true;
                }
                // Проверка по вертикали
                if (map[j][i] == symb) {
                    countY++;
                    if (countY == DOTS_TO_WIN) return true;
                }
            }
            //Проверка первой диагонали
            if (map[i][i] == symb) {
                countDiagonalA++;
                if (countDiagonalA == DOTS_TO_WIN) return true;
            } else countDiagonalA = 0;
            //Проверка второй диагонали
            if (map[i][SIZE - 1 - i] == symb) {
                countDiagonalB++;
                if (countDiagonalB == DOTS_TO_WIN) return true;
            } else countDiagonalB = 0;

        }
        return false;
    }
    // Ход ИИ
    public static void aiTurn(char c){
        int x, y;
        int countH;
        int countV;
        int countHNull;
        int countVNull;
        int countDA = 0;
        int countDANull = 0;
        int countDB = 0;
        int countDBNull = 0;

        for (int i = 0; i < SIZE; i++) {
            countH = 0;
            countHNull = 0;
            countV = 0;
            countVNull = 0;
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_X) countH++;
                else if(map[i][j] == DOT_EMPTY) countHNull++;
                if ((countH == SIZE - 1) && (countHNull == 1)) {
                    for (int k = 0; k < SIZE; k++) {
                        if(map[i][k] == DOT_EMPTY) {
                            map[i][k] = c;
                            return;
                        }
                    }
                }

                if(map[j][i] == DOT_X) countV++;
                else if(map[j][i] == DOT_EMPTY) countVNull++;
                if ((countV == SIZE - 1) && (countVNull == 1)) {
                    for (int k = 0; k < SIZE; k++) {
                        if(map[k][i] == DOT_EMPTY) {
                            map[k][i] = c;
                            return;
                        }
                    }
                }
            }

            if (map[i][i] == DOT_X) countDA++;
            else if(map[i][i] == DOT_EMPTY) countDANull++;
            if((countDA == SIZE - 1) && countDANull == 1) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[j][j] == DOT_EMPTY) {
                        map[j][j] = c;
                        return;
                    }
                }
            }

            if (map[i][SIZE - 1 - i] == DOT_X) countDB++;
            else if(map[i][SIZE - 1 - i] == DOT_EMPTY) countDBNull++;
            if((countDB == SIZE - 1) && countDBNull == 1) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[j][SIZE - 1 - j] == DOT_EMPTY) {
                        map[j][SIZE - 1 - j] = c;
                        return;
                    }
                }
            }
        }


        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }
}
