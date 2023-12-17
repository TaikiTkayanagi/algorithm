package algorithm;

import algorithm.section3.BubbleSort;
import algorithm.section3.CocktailSort;

public class Main {
    private static void showArray(int[] target){
        for(var value : target){
            System.out.println(value);
        }
    }
    public static void main(String[] args){
        int[] target = {4, 5, 1, 8, 7, 3};
        // showArray(BubbleSort.exec(target));
        // System.out.println();
        // showArray(BubbleSort.exec2(target));
        showArray(CocktailSort.exec1(target));
    }
}
