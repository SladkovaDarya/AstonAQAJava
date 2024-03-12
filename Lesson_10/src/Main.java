public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.fillFruitBox(new Orange("Morocco"));
        orangeBox.fillFruitBox(new Orange("Egypt"));
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight()); //апельсины по 1.5f весят за шт
        Box<Apple> appleBox = new Box<>();
        appleBox.fillFruitBox(new Apple("Семеринка"));
        appleBox.fillFruitBox(new Apple("Мичуринские"));
        appleBox.fillFruitBox(new Apple("Гренни Смит"));
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight()); // яблоки по 1.0f за шт
        System.out.println("Равны ли коробки по весу? " + orangeBox.compare(appleBox));
        Box<Apple> anotherAppleBox = new Box<>();
        anotherAppleBox.fillFruitBox(new Apple("Новый урожай"));
        appleBox.pourFruits(anotherAppleBox);
        System.out.println("В новой коробке с яблоками: " + anotherAppleBox.getFruitBox());
        System.out.println("В старой коробке: " + appleBox.getFruitBox());
    }
}