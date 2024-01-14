package algorithm.section3;

public class QuickSort {
    /**
     * Pivot(基準値)の値のインデックスを求める
     * @param target
     * @param low 最小値のインデックス
     * @param high 最大値のインデックス
     * @return
     */
    private static int partition(int[] target, int low, int high){
        var i = low - 1;
        var pivot = target[high];
        for(int j = low; j < high; j++){
            if(target[j] < pivot){
                i++;
                var tmp = target[i];
                target[i] = target[j];
                target[j] = tmp;
            }
        }
        i++;
        var tmp = target[i];
        target[i] = pivot;
        target[high] = tmp;
        return i;
    }

    private static void exec(int[] target, int low, int high){
        if(high <= low){
            return;
        }
        var index = partition(target, low, high);
        exec(target, low, index-1);
        exec(target, index+1, high);
    }

    public static int[] exec1(int[] target){
        var clone = target.clone();
        exec(clone, 0, clone.length - 1);
        return clone;
    }

    private static void quickSort(int[] target, int left, int right){
        if(left >= right){
            return;
        }
        var pivot = target[right];
        var pivotIndex = left;

        for(int i = left; i < right; i++){
            if(pivot >= target[i]){
                var tmp = target[i];
                target[i] = target[pivotIndex];
                target[pivotIndex] = tmp;
                pivotIndex++;
            }
        }

        var tmp = target[pivotIndex];
        target[pivotIndex] = target[right];
        target[right] = tmp;

        quickSort(target, left, pivotIndex - 1);
        quickSort(target, pivotIndex + 1, right);
    }


    public static int[] exec2(int[] target){
        var clone = target.clone();
        quickSort(clone, 0, clone.length - 1);
        return clone;
    }
}
