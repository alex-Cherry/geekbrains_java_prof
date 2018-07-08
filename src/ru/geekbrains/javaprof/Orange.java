package ru.geekbrains.javaprof;

public class Orange extends Fruit {
    public Orange() {}

    // ЭТО НОРМАЛЬНО ВЫЗЫВАТЬ МЕТОДЫ ИЗ КОНСТРУКТОРА??
    public Orange(double weight) {
        setWeight(weight);
    }

    @Override
    public String toString() {
        return String.format("This is Orange. Its weight is %d", getWeight());
    }
}
