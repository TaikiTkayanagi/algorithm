package algorithm.section3;

public class BubbleSort {
    public static int[] exec(int[] target){
        var copyTarget = target.clone();
        //limitを直接的に定義してループする
        for(int j = copyTarget.length - 1; j > 0; j--){
            for(int i = 0; i < j; i++){
                if(copyTarget[i] > copyTarget[i+1]){
                    var tmp = copyTarget[i];
                    copyTarget[i] = copyTarget[i+1];
                    copyTarget[i+1] = tmp;
                }
            }
        }
        return copyTarget;
    }

    public static int[] exec2(int[] target){
        var copyTarget = target.clone();
        //limitを間接的に定義してループする
        //iを使ってlimitを求める(copyTarget.length - 1 - i)がlimitの部分
        for(int i = 0; i < copyTarget.length; i++){
            for(int j = 0; j < copyTarget.length - 1 - i; j++){
                if(copyTarget[j] > copyTarget[j+1]){
                    var tmp = copyTarget[j];
                    copyTarget[j] = copyTarget[j+1];
                    copyTarget[j+1] = tmp;
                }
            }
        }
        return copyTarget;
    }
}
