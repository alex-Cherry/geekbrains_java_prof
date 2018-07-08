package ru.geekbrains.javaprof;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // TASK 1.
        String[] arrayFruits = {"apple", "apricot", "banana", "orange", "pineapple", "grapes", "pear", "peach", "kiwi", "tangerine"};
        // show the array before replace
        System.out.println("Array before replace");
        GenericsUtility.printArray(arrayFruits);
        // replace elements in the array
        GenericsUtility.replaceElementsInArray(arrayFruits, 0, 9);
        // show the array after replace
        System.out.println("Array after replace");
        GenericsUtility.printArray(arrayFruits);

        System.out.println("\n\n");

        // TASK 2.
        // create and initialize the array
        Integer[] plainIntArray = new Integer[10];
        for (int index = 0; index < plainIntArray.length; index++) {
            plainIntArray[index] = index * 10;
        }
        // get the ArrayList from the array
        List<Integer> intListArray = GenericsUtility.convertArrayToArrayList(plainIntArray);
        System.out.println("We got " + intListArray.getClass().getName() + " from " + plainIntArray.getClass().getName());

        System.out.println("\n\n");

        // TASK 3.
        Box<Apple> boxWithApples1 = new Box<>();
        boxWithApples1.addFruit(new Apple(3.1));
        boxWithApples1.addFruit(new Apple(3.2));
        boxWithApples1.addFruit(new Apple(3.3));
        System.out.printf("Box1 with apples contains %d apple(-s) and weights %.2f%n", boxWithApples1.countOfFruits(), boxWithApples1.getWeight());

        Box<Apple> boxWithApples2 = new Box<>();
        boxWithApples2.addFruit(new Apple(4.1));
        boxWithApples2.addFruit(new Apple(4.2));
        System.out.printf("Box2 with apples contains %d apple(-s) and weights %.2f%n", boxWithApples2.countOfFruits(), boxWithApples2.getWeight());

        Box<Orange> boxWithOranges = new Box<>();
        boxWithOranges.addFruit(new Orange(1.5));
        boxWithOranges.addFruit(new Orange(2));
        boxWithOranges.addFruit(new Orange(2.2));
        boxWithOranges.addFruit(new Orange(1.2));
        boxWithOranges.addFruit(new Orange(1.4));
        System.out.printf("Box with oranges contains %d orange(-s) and weights %.2f%n", boxWithOranges.countOfFruits(), boxWithOranges.getWeight());

        // move apples from one box to other
        //boxWithApples1.addFromOtherBox(boxWithOranges);
        boxWithApples1.addFromOtherBox(boxWithApples2);

        System.out.printf("Box1 with apples contains %d apple(-s) and weights %.2f%n", boxWithApples1.countOfFruits(), boxWithApples1.getWeight());
    }
}
