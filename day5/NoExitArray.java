package day5;

import java.util.Scanner;

public class NoExitArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] n=new int[5];
        System.out.println("Enter a 5 Number: ");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Enter a Target: ");
        int r=sc.nextInt();
        for(int i=0;i<n.length;i++){
            if(n[i]==r){
                System.out.println("Target found at "+i);
            }
        }
        sc.close();
    }
}
