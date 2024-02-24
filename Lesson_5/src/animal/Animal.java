package animal;

public abstract class Animal {
    public static final int MAX_LENGHT_RUN = 0;
    public static final int MAX_LENGHT_SWIM = 0;
    public String name;
    public static int count = 0;

    public Animal(String name) {
        this.name = name;
        ++count;
    }

    public abstract void run(int lenght);

    public abstract void swim(int lenght);
}
