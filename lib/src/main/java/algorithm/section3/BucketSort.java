package algorithm.section3;

import java.util.ArrayList;

public class BucketSort {
    private static int getMax(int[] target){
        var max = 0;
        for(var i : target){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static int[] exec1(int[] target){
        var clone = target.clone();
        var max = getMax(clone);
        var size = max / clone.length;
        var bucket = new ArrayList<ArrayList<Integer>>(size);
        for(int i = 0; i < size; i++){
            bucket.add(i, new ArrayList<>(size));
        }

        for(var value : clone){
            var i = value / clone.length;
            if(i >= size){
                --i;
            }
            bucket.get(i).add(value);
        }

        var result = new int[clone.length];
        var i = 0;
        for(var list : bucket){
            if(list.size() == 0){
                continue;
            }
            for(var j = 1; j < list.size(); j++){
                var tmp = list.get(j);
                var k = j - 1;
                while(k >= 0 && list.get(k) > tmp){
                    list.set(k+1, list.get(k));
                    k--;
                }
                list.set(k+1, tmp);
            }
            for(var value : list){
                result[i] = value;
                i++;
            }
        }
        return result;
    }
}
