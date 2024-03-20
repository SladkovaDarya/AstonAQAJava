package src;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        evenNumbers();
        highload();
        sortAlphabet();
        Education education = new Education();
        education.education();
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.fillLogins();
    }

    public static void evenNumbers() {
       /* Даша, посмотри плиз на подсказки идеи (если ты ее используешь),
         в частности в записи collect(Collectors.toList()); - упрости ее.*/
        IntStream il = new Random()
                .ints(10, 1, 100)
                .peek(i -> System.out.print(i + " "));
        long cnt = il.filter(a -> a % 2 == 0).count();
        System.out.println("Количество четных чисел : " + cnt);
    }

    public static void highload() {
        List<String> highloadList = Arrays.asList("Highload", "High", "Load", "Highload");
        long count = highloadList.stream().filter(s -> s.contains("High")).count(); //изменила
        System.out.println("High встречается " + count + " раз(a)");
        /* IllegalArgumentException вылетала, потому что не было проверки
        на пустой массив (не поняла задание)
        - skip() работал некорректно - исправила.
         */
        List<String> emptyList = new ArrayList<>();
        getZeroOrElement(highloadList);
        getZeroOrElement(emptyList);
    }

    public static void getZeroOrElement(List<String> list) {
        String firstElement = list.stream()
                .findFirst().orElse("0");
        System.out.println("Первый элемент коллекции - это " + firstElement);
        int size = !list.isEmpty() ? list.size() - 1 : 0;
        String lastElement = list.stream()
                .skip(size).findFirst().orElse("0");
        System.out.println("Последний элемент коллекции - это " + lastElement);
    }

    // В условии сказано задать коллекцию, отсортировать и добавить элементы в массив
    public static void sortAlphabet() {
        List<String> list = Arrays.asList("f10", "a15", "f2", "f4", "f5", "b54", "a16");
        String[] str = list.stream().sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(str));
    }
}