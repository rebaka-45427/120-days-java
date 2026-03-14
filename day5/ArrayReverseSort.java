package day5;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class ArrayReverseSort{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Integer[] n=new Integer[6];
        System.out.println("Enter 6 numbers to sort: ");
        for(int i=0;i<6;i++){
            n[i]=sc.nextInt();
        }
        Arrays.sort(n, Collections.reverseOrder());
        System.out.println(Arrays.toString(n));
        sc.close();
    }
}
