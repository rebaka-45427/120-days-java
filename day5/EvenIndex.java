package day5;
import java.util.Scanner;
public class EvenIndex {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] n=new int[5];
        System.out.println("Enter a number: ");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Even Index: ");
        for(int i=0;i<n.length;i++){
            if(i%2==0){
                System.out.println(n[i]);
            }
        }
        
        sc.close();
    }
}
