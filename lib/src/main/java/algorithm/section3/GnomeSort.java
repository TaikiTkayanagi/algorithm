package algorithm.section3;

public class GnomeSort {
    public static int[] exec1(int[] target){
        var clone = target.clone();
        var i = 0;
        while (i < clone.length - 1) {
            if(clone[i] > clone[i+1]){
                var tmp = clone[i+1];
                clone[i+1] = clone[i];
                clone[i] = tmp;
                if(i > 0){
                    i--;
                }
            } else {
                i++;
            }
        }
        return clone;
    }
}
