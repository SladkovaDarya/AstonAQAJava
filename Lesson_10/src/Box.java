import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitBox = new ArrayList<>();

    public List<T> getFruitBox() {
        return fruitBox;
    }

    public void fillFruitBox(T fruit) {
        fruitBox.add(fruit);
    }

    public double getWeight() {
        return fruitBox.stream().map(f -> f.getWEIGHT()).reduce((sum, f) -> sum + f).get();
    }

    public boolean compare(Box boxFruit) { // Можно сравнивать коробки с яблоками и апельсинами по условию
        if (this.getWeight() == boxFruit.getWeight()) return true;
        else return false;
    }

    public void pourFruits(Box<T> someBox) { //пересыпаем фрукты из текущей коробки в другую по условию
        someBox.getFruitBox().addAll(this.getFruitBox());
        this.fruitBox.clear();
    }
}
