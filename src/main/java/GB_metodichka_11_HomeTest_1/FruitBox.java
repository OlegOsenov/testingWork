package GB_metodichka_11_HomeTest_1;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FruitBox<F extends Fruit> {

    List<F> fruits;

    public FruitBox(F... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    // Метод добавления
    public void add(F fruit) {
        this.fruits.add(fruit);
    }

    // Получение веса
    public double getWeight() {
        double weight = 0.0;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean equalsByWeight(FruitBox<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    // Пересыпать фрукты в другую коробку
    public void tranceferAll(FruitBox<? super F> another){
        if (this == another) return;
        another.getFruits().addAll(fruits);
        fruits.clear();
    }

    public List<F> getFruits() {
        return fruits;
    }
}
