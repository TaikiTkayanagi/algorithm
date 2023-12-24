package algorithm.section3;

public class InsertionSort {
    public static int[] exec1(int[] target) {
        var clone = target.clone();
        for (int i = 1; i < clone.length; i++) {
            var tmpValue = clone[i];
            var j = i - 1;
            while (j >= 0 && clone[j] > tmpValue) {
                clone[j + 1] = clone[j];
                j--;
            }
            clone[j + 1] = tmpValue;

        }
        return clone;
    }
}
