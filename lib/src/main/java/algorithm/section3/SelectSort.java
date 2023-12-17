package algorithm.section3;

/**
 * 選択ソート
 * 最小値を求めていき、0から当てはめていく
 */
public class SelectSort {
    public static int[] exec1(int[] target){
        var targetCopy = target.clone();

        for(int i = 0; i < targetCopy.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < targetCopy.length; j++){
                if(targetCopy[minIndex] > targetCopy[j]){
                    minIndex = j;
                }
            }
            var tmp = targetCopy[minIndex];
            targetCopy[minIndex] = targetCopy[i];
            targetCopy[i] = tmp;
        }
        return targetCopy;
    }
}
