package firstTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> currentList = fillList();
        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(currentList);
        System.out.println(stringSet);
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("name " + name + " : " + Collections.frequency(currentList, name));
        }
    }

    public static List<String> fillList() {
        List<String> list = new ArrayList<>();
        list.add("Vasya");
        list.add("Vasya");
        list.add("Petya");
        list.add("Anya");
        list.add("Luba");
        list.add("Luba");
        list.add("Vera");
        list.add("Nina");
        list.add("Boris");
        list.add("Boris");
        return list;
    }
}