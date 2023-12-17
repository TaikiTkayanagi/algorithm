package algorithm.section3;

/**
 * コムソート
 * 1.3は固定でそれを配列の長さで割る値がgapとなり、gapが1になるまで又はswapがtrueになるまでループを繰り返す
 */
public class CombSort {
    public static int[] exec1(int[] target){
        var targetCopy = target.clone();
        final double DIVISION = 1.3;
        var gap = (int)Math.floor(targetCopy.length / DIVISION);
        var swap = true;

        while(gap != 1 || swap){
            swap = false;
            for(int i = 0; i + gap < targetCopy.length; i++){
                if(targetCopy[i] > targetCopy[i+gap]){
                    var tmp = targetCopy[i];
                    targetCopy[i] = targetCopy[i+gap];
                    targetCopy[i+gap] = tmp;
                    swap = true;
                }
            }

            gap = (int)Math.floor(gap / DIVISION);
            if(gap < 1){
                gap = 1;
            }
        }
        return targetCopy;
    }
}
