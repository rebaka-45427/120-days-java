package day3;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] n=new int[5];
        int sum=0;
        System.out.println("Enter a numbers: ");
        for(int i=0;i<5;i++){
            n[i]=sc.nextInt();
            sum+=n[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
