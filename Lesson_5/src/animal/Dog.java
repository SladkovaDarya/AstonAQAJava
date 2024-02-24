package animal;

public class Dog extends Animal {
    public static final int MAX_LENGHT_RUN = 500;
    public static final int MAX_LENGHT_SWIM = 10;
    public static int count = 0;

    public Dog(String name) {
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
        if (lenght < 0 || lenght > MAX_LENGHT_SWIM) {
            System.out.println(name + " не может проплыть больше " + MAX_LENGHT_SWIM +
                    " м. Введите корректное значение");
        } else {
            System.out.println(name + " проплыл(а) " + lenght + " м.");
        }
    }
}
