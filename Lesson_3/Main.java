package Lesson_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(amountLimits(5, 7));
        someNumber(-1);
        System.out.println(isPositiveNumber(2));
        printLine("Hi", 3);
        System.out.println(isLeapYear(2020));
        arrayInt();
        arrHundredValues();
        multiplyNumbersLessSix();
        fillTwoDimensionalArray();
        System.out.println(Arrays.toString(createIntArr(6, 10)));
    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false. */
    public static boolean amountLimits(int first, int second) {
        if ((first + second) >= 10 && (first + second) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /* 2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом. */
    public static void someNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    /* 3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное. */
    public static boolean isPositiveNumber(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /* 4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз */
    public static void printLine(String someLine, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(someLine);
        }
    }

    /* 5. Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный. */
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {  //каждый 400-й год-високосный
            return true;
        } else if (year % 100 == 0) { // каждый 100-й год - обычный
            return false;
        } else if (year % 4 == 0) { // все остальные при делении без остатка явл-ся високосными
            return true;
        } else {     // те, что делятся с остатком - обычными
            return false;
        }
    }

    /* 6. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0; */
    public static void arrayInt() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    /* 7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 ... 100; */
    public static void arrHundredValues() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; //заполняем с единицы до ста
        }
        System.out.println(Arrays.toString(arr));
    }

    /* 8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2; */
    public static void multiplyNumbersLessSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /* 9. Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
    диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n]; */
    public static void fillTwoDimensionalArray() {
        int length = 5;
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) { //первая диагональ
            arr[i][i] = 1;
        }
        int diagonal = length;
        for (int i = 0; i < length; i++) { //вторая диагональ
            arr[i][diagonal - 1] = 1;
            diagonal--;
        }
        for (int[] array : arr) { //выводим массив на экран
            System.out.println(Arrays.toString(array));
        }
    }

    /* 10. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue. */
    public static int[] createIntArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
