package day8;

import java.lang.reflect.Array;

public class ArrayNewInstance {
    public static void main(String[]args){
        int[] arr=(int[])Array.newInstance(int.class, 5);
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
