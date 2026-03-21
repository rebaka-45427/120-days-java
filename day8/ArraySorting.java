package day8;
import java.util.Arrays;
import java.util.Collections;
import java.lang.reflect.Array;
public class ArraySorting {
    public static void main(String[]args){
        Object arr=Array.newInstance(Integer.class,5);
         for (int i = 0; i < 5; i++) {
            Array.set(arr, i, (i + 1) * 10);
        }
        for(int i=0;i<Array.getLength(arr);i++){
            System.out.println(Array.get(arr,i));
        }
        Integer[] realArr = (Integer[]) arr;
        Arrays.sort(realArr,Collections.reverseOrder());
        System.out.println(Arrays.toString(realArr));
    }
}
