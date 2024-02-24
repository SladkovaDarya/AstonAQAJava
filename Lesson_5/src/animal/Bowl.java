package animal;

public class Bowl {
    private static final int FULLNESS = 20;//порция на одного кота
    private int foodTotalAmount = 0;//количество еды в миске

    public void addFood(int food) {
        if (food > 0) {
            foodTotalAmount += food;
        }
    }

    public void feedTheCat(Cat cat) {
        System.out.println("Количество еды в миске: " + foodTotalAmount);
        if (foodTotalAmount >= FULLNESS) {
            cat.isFed = true;
            System.out.println(cat.name + " покушал из миски. Сытость: " + cat.isFed);
            foodTotalAmount -= FULLNESS;
        } else {
            System.out.println(cat.name + " остался голодным. Сытость: " + cat.isFed);
        }
    }
}
