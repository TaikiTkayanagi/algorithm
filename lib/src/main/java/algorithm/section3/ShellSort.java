package algorithm.section3;

public class ShellSort {
    public static int[] exec1(int[] target){
        var clone = target.clone();

        var division = 2;
        var gap = (int)Math.floor(clone.length / division);

        while(gap > 0){
            for(int i = gap; i < clone.length; i++){
                var j = i;
                var tmp = clone[j];
                while(j >= gap && clone[j-gap] > tmp){
                    clone[j] = clone[j-gap];
                    j -= gap;
                }
                clone[j] = tmp;
            }
            gap = (int)Math.floor(gap / division);
        }
        return clone;
    }
}
