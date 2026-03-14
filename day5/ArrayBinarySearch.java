package day5;
import java.util.Arrays;
public class ArrayBinarySearch {
    public static void main(String[]args){
        int[] a={54,92,35,42,3,8};
        Arrays.sort(a);
        System.out.println("35 in the index of: "+Arrays.binarySearch(a,35));
    }
}
