package animal;

public class Main {
    public static void main(String[] args) {
        printAnimals();
        catsfood();
    }

    public static void printAnimals() {
        Animal dogBobik = new Dog("Бобик");
        dogBobik.run(600);
        dogBobik.swim(11);
        Animal dogSharik = new Dog("Шарик");
        dogSharik.run(150);
        dogSharik.swim(6);
        System.out.println("Собак создано: " + Dog.count);
        Animal catMurzik = new Cat("Мурзик");
        catMurzik.run(300);
        catMurzik.swim(2);
        System.out.println("Кошек создано: " + Cat.count);
        System.out.println("Животных создано: " + Animal.count);
    }

    public static void catsfood() {
        Cat[] cats = {new Cat("Барсик"),
                new Cat("Персик"),
                new Cat("Дымок")};
        Bowl bowl = new Bowl();
        bowl.addFood(40);
        for (Cat cat : cats) {
            bowl.feedTheCat(cat);
        }
    }
}