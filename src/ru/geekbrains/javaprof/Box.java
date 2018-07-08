package ru.geekbrains.javaprof;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

public class Box<T extends Fruit> implements Iterable<T> {

    private List<T> fruits = new ArrayList<>();

    public Box() {
    }

    // adds fruit in this box
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // method returns weight of this box
    public double getWeight() {
        Function<T, Double> functionGetWeight =  p -> p.getWeight();
        return fruits.stream()
                .map(functionGetWeight)
                .reduce(0.0, Double::sum);
    }

    // returns "True" if weights are equal,
    // otherwise false
    public boolean compare(Box<? extends Fruit> box) {
        return (getWeight() == box.getWeight());
    }


    public void addFromOtherBox(Box<T> box) {
        // don't execute method
        // if a box doesn't contain fruits
        if (box.countOfFruits() == 0) {
            return;
        }

        // move fruits from a box
        // to this box
        for (T fruit : box){
            addFruit(fruit);
        }
        // clear a box
        box.clearBox();
    }

    // method returns count of fruits in this box
    public int countOfFruits() {
        return fruits.size();
    }

    // methods removes all fruits from this box
    public void clearBox() {
        fruits.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return fruits.iterator();
    }

//    @Override
//    public String toString() {
//        if (Class.)
//    }
}
