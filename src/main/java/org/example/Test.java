package org.example;

public class Test {
    public static void printThreeWords() { // Задание первое
        System.out.println("Orange\nBanana\nApple\n");
    }
    public static void checkSumSign(int a, int b) { // Задание второе
        int Sum = a + b;

        if (Sum >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }
    }

    public static void printColor(int value) { // Задание третье
        if (value <= 0) {
            System.out.println("Красный\n");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый\n");
        } else {
            System.out.println("Зеленый\n");
        }
    }

    public static void compareNumbers(int a, int b) { // Задание четвертое
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
