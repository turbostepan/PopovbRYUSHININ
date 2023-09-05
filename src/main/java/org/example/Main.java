package org.example;

import javax.annotation.processing.SupportedSourceVersion;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Test.printThreeWords(); // Задание 1.1
        Test.checkSumSign(1, -3);// Задание 1.2
        Test.printColor(100); // Задание 1.3
        Test.compareNumbers(1, 3); // Задание 1.4

        Test2.Bool(1, 3); // Задание 2.1
        Test2.Number(-1); // Задание 2.2
        Test2.NumberBool(3); // Задание 2.3
        Test2.String("Привет", 5); // Задание 2.4
        Test2.Year(100); // Задание 2.5
        Test2.Mas(); // Задание 2.6

    }
}