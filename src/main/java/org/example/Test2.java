package org.example;

public class Test2 {

    public static boolean Bool(int a, int b) { // Задание первое
        int Sum = a + b;

        if (Sum >= 10 && Sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void Number(int a) { // Задание второе
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean NumberBool(int a) { // Задание третье
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void String(String a, int b) { // Задание четвертое
        String result = "";
        for (int i = 0; i < b; ++i) {
            result += a;
            String m = a;
            System.out.println(m);
        }
    }

    public static boolean Year(int year) { // Задание пятое
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void Mas() { // Задание шестое
        int[] Array = {0, 1, 0, 1};
        for (int i = 0; i < Array.length; ++i) {
            if (Array[i] == 0) {
                Array[i] = 1;
            } else {
                Array[i] = 0;
            }
        }
        for (int i = 0; i < Array.length; ++i) {
            System.out.println(Array[i]);
        }
    }

    public static void Null() {
        int[] Array = new int[100];
        for (int i = 1;)
    }
}


