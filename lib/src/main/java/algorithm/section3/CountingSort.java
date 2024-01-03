package algorithm.section3;

public class CountingSort {
    public static int[] exec1(int[] target){
        var clone = target.clone();
        var max = 0;
        for(var value : clone){
            if(max < value){
                max = value;
            }
        }
        var tmpList = new int[max+1];
        for(var value : clone){
            tmpList[value]++;
        }
        var countingList = new int[max+1];
        for(int i = 1; i < tmpList.length; i++){
            countingList[i] = tmpList[i] + countingList[i-1];
        }

        var result = new int[clone.length];
        for(int i = clone.length - 1; i >= 0; i--){
            var value = clone[i];
            var index = countingList[value];
            result[index - 1] = value;
            countingList[value]--;
        }
        return result;
    }
}
