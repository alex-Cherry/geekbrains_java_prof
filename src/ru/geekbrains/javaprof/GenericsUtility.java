package ru.geekbrains.javaprof;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsUtility {
    // Method replaces elements in a generic array
    public static <T> void replaceElementsInArray(T[] arr, int index1, int index2) {
        String errorMessage = "%s must be between %d and %d!";
        if (index1 > (arr.length - 1) || index1 < 0) {
            throw new IllegalArgumentException(String.format(errorMessage, "index1", 0, arr.length - 1));
        }
        if (index2 > (arr.length - 1) || index2 < 0) {
            throw new IllegalArgumentException(String.format(errorMessage, "index2", 0, arr.length - 1));
        }

        T element1 = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = element1;
    }

    // Method just prints an array
    public static <T> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // method gets an ArrayList from an array
    public static <T> ArrayList<T> convertArrayToArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
