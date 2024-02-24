package animal;

public class Cat extends Animal {
    public static final int MAX_LENGHT_RUN = 200;
    public static int count = 0;
    public boolean isFed = false;//сытость кота

    public Cat(String name) {
        super(name);
        ++count;
    }

    @Override
    public void run(int lenght) {
        if (lenght < 0 || lenght > MAX_LENGHT_RUN) {
            System.out.println(name + " не может пробежать больше " + MAX_LENGHT_RUN +
                    " м. Введите корректное значение");
        } else {
            System.out.println(name + " пробежал(а) " + lenght + " м.");
        }
    }

    @Override
    public void swim(int lenght) {
        System.out.println(name + " не умеет плавать");
    }
}
