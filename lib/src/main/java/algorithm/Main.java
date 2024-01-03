package algorithm;

import algorithm.section3.BubbleSort;
import algorithm.section3.BucketSort;
import algorithm.section3.CocktailSort;
import algorithm.section3.CombSort;
import algorithm.section3.CountingSort;
import algorithm.section3.GnomeSort;
import algorithm.section3.InsertionSort;
import algorithm.section3.SelectSort;
import algorithm.section3.ShellSort;

public class Main {
    private static void showArray(String name, int[] target){
        System.out.println("algorithm:" + name);
        for(var value : target){
            System.out.print(value);
            System.out.print(",");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] target = {4, 5, 1, 8, 7, 3};
        showArray("BubbleSort", BubbleSort.exec(target));
        showArray("BubbleSort", BubbleSort.exec2(target));
        showArray("CocktailSort", CocktailSort.exec1(target));
        showArray("CombSort", CombSort.exec1(target));
        showArray("SelectSort", SelectSort.exec1(new int[]{2, 5, 1, 8, 7, 3}));
        showArray("GnomeSort", GnomeSort.exec1(new int[]{2, 5, 1, 8, 7, 3}));
        showArray("InsertionSort", InsertionSort.exec1(new int[]{2, 5, 1, 8, 7, 3}));
        showArray("BucketSort", BucketSort.exec1(new int[]{1, 5, 28, 25, 100, 52, 27, 91, 22, 99}));
        showArray("Shell Sort", ShellSort.exec1(new int[]{5,6,9,2,3}));
        showArray("Counting Sort", CountingSort.exec1(new int[]{4,3,6,2,3,4,7}));
    }
}
