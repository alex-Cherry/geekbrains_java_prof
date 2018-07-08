package ru.geekbrains.javaprof;

public class Apple extends Fruit {
    public Apple() {}

    // ЭТО НОРМАЛЬНО ВЫЗЫВАТЬ МЕТОДЫ ИЗ КОНСТРУКТОРА??
    public Apple(double weight) {
        setWeight(weight);
    }

    @Override
    public String toString() {
        return String.format("This is Apple. Its weight is %d", getWeight());
    }
}
