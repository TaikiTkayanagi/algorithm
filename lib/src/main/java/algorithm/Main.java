package algorithm;

import algorithm.section3.BubbleSort;
import algorithm.section3.CocktailSort;
import algorithm.section3.CombSort;

public class Main {
    private static void showArray(String name, int[] target){
        System.out.println("algorithm:" + name);
        for(var value : target){
            System.out.print(value);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] target = {4, 5, 1, 8, 7, 3};
        showArray("BubbleSort", BubbleSort.exec(target));
        showArray("BubbleSort", BubbleSort.exec2(target));
        showArray("CocktailSort", CocktailSort.exec1(target));
        showArray("CombSort", CombSort.exec1(target));
    }
}
