import java.util.*;
import java.util.stream.Collectors;

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
        List<Integer> integerList = new Random().ints(10, 1, 100)
                .boxed().peek(i -> System.out.print(i + " ")).collect(Collectors.toList());
        long cnt = integerList.stream().filter(a -> a % 2 == 0).count();
        System.out.println("Количество четных чисел : " + cnt);
    }

    public static void highload() {
        List<String> list = Arrays.asList("Highload", "High", "Load", "Highload");
        long count = list.stream().filter(s -> s.equals("High")).count();
        System.out.println("High встречается " + count + " раз");
        String firstElement = list.stream().findFirst().orElse("0");
        System.out.println("Первый элемент коллекции - это " + firstElement);
        String lastElement = list.stream().skip(list.size() - 1).findFirst().orElse("0");
        System.out.println("Последний элемент коллекции - это " + lastElement);
    }

    // В условии сказано задать коллекцию, отсортировать и добавить элементы в массив
    public static void sortAlphabet() {
        List<String> list = Arrays.asList("f10", "a15", "f2", "f4", "f5", "b54", "a16");
        String[] str = list.stream().sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(str));
    }
}