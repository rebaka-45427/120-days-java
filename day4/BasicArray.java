package day4;
import java.util.Scanner;
public class BasicArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] n=new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<10;i++){
            n[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.print(n[i]);
        }
        sc.close();
    }
}