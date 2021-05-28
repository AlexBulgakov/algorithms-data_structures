package Home_Lection2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {



    public static void main(String[] args) {
        ArrayImpl<Integer> firstArray = new ArrayImpl();
        SortedArrayImpl<Integer> sortedArray = new SortedArrayImpl<>();
        for (int i = 0; i < 50; i++) {
            sortedArray.add(i + 1);
        }

        ArrayImpl<Integer> secondArray = new ArrayImpl<>();
        for (int i = 0; i < 10000; i++) {
            secondArray.add((int)Math.random() * 10000);
        }

        ArrayImpl<Integer> thirdArray = new ArrayImpl<>();
        for (int i = 0; i < 10000; i++) {
            thirdArray.add((int)Math.random() * 10000);
        }

        ArrayImpl<Integer> fourthArray = new ArrayImpl<>();
        for (int i = 0; i < 10000; i++) {
            fourthArray.add((int)Math.random() * 10000);
        }

        fillArray(firstArray);
        addArray(firstArray, 9);
        removeArray(firstArray, 5691);
        searchArray(firstArray, 541);
        searchSortedArray(sortedArray, 45);

        sortedBubble(secondArray);
        sortedSelect(thirdArray);
        sortedInsert(fourthArray);
    }

    public static void fillArray (ArrayImpl<Integer> arr) {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            arr.add(random.nextInt(10000));
        }
    }

    public static void addArray (ArrayImpl<Integer> arr, int value) {
        arr.add(value);
    }

    public static void removeArray (ArrayImpl<Integer> arr, int index) {
        arr.remove(index);
    }

    public static void searchArray (ArrayImpl<Integer> arr, int value) {
        arr.indexOf(value);

    }

    public static void searchSortedArray (SortedArrayImpl<Integer> arr, int value) {
        arr.indexOf(value);
    }

    public static void sortedBubble (ArrayImpl<Integer> arr) {
        long startTime = System.nanoTime();
        arr.sortBubble();
        float deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.println("SortBubble " + deltaTime + " milliseconds");
    }

    public static void sortedSelect (ArrayImpl<Integer> arr) {
        long startTime = System.nanoTime();
        arr.sortSelect();
        float deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.println("SortSelect " + deltaTime + " milliseconds");
    }

    public static void sortedInsert (ArrayImpl<Integer> arr) {
        long startTime = System.nanoTime();
        arr.sortInsert();
        float deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.println("SortInsert " + deltaTime + " milliseconds");
    }

}
