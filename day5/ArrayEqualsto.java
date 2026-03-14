package day5;
import java.util.Arrays;
public class ArrayEqualsto {
    public static void main(String[]args){
        int[] a={1,2,3,4};
        int[] b={1,3,2,4};
        int[] c={1,2,3,4};

        System.out.println("a and b are : "+Arrays.equals(a,b));
        System.out.println("a and c are: "+Arrays.equals(a,c));
    }
}
