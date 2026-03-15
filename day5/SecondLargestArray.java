package day5;
import java.util.Scanner;
public class SecondLargestArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] n=new int[5];
        System.out.println("Enter a numbers: ");
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        int largest=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>largest){
                largest=n[i];
            }
        }
        int secmax=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>secmax && n[i]!=largest){
                secmax=n[i];
            }
        }
        System.out.println("secmax: "+secmax);
        sc.close();
    }
    
}
