package algorithm.section3;

/**
 *
 * Cocktail(コックテイル)(別名:シェーカーソート)ソート
 * 左から並び替えを行いその後右側への並び替えを行う。それを全ての並び替えが終わるまで行う
 * 並び替えが発生しない場合その場でループを終了させる
 */
public class CocktailSort {
    public static int[] exec1(int[] target){
        var targetCopy = target.clone();
        boolean swap = false;
        var limitLast = targetCopy.length - 1;
        var limitFirst = 0;
        while(!swap){
            int swapCount = 0;
            for(int i = limitFirst; i < limitLast; i++){
                if(targetCopy[i] > targetCopy[i+1]){
                    var tmp = targetCopy[i];
                    targetCopy[i] = targetCopy[i+1];
                    targetCopy[i+1] = tmp;
                    swapCount++;
                }
            }
            //左から右への並び替えで変更が発生しない場合while文を終了させる
            if(swapCount == 0){
                break;
            }
            limitLast--;
            for(int j = limitLast; j > limitFirst; j--){
                if(targetCopy[j] < targetCopy[j-1]){
                    var tmp = targetCopy[j];
                    targetCopy[j] = targetCopy[j-1];
                    targetCopy[j-1] = tmp;
                    swapCount++;
                }
            }
            limitFirst++;
            swap = swapCount == 0;
        }
        return targetCopy;
    }
}
