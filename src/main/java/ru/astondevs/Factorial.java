package ru.astondevs;

import java.math.BigInteger;
import java.util.Scanner;

//Введем ограничения на вычисление факториала, т.к. слишком большие числа.
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вычисление факториала. " +
                "\nВведите число от 1 до 99.\n" +
                "Для выхода введите 'еnd'");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int value = Integer.parseInt(input);
            if (isSuitableNumber(value) == true) {
                BigInteger result = factorialResult(value);
                System.out.println("Факториал числа " + value + " равен " + result);
            }
       }
    }

    public static boolean isSuitableNumber(int value) {
        if (value < 1 || value > 99) {
            System.out.println("Число должно быть в диапазоне от 1 до 99!");
            return false;
        }
        return true;
    }

    public static BigInteger factorialResult(int value) {
        BigInteger factorial = BigInteger.valueOf(value);
        BigInteger result = BigInteger.valueOf(1);
        for (long i = 1; i <= factorial.longValue(); i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
