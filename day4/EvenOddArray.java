package day4;
import java.util.Scanner;
public class EvenOddArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] n=new int[5];
        System.out.println("Enter a number: ");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int[] even=new int[5];
        int[] odd=new int[5];
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                even[i]=n[i];
            }
            else{
                odd[i]=n[i];
            }
        }
        System.out.print("Even: ");
        for(int i=0;i<n.length;i++){
            if(even[i]!=0){
                System.out.print(even[i]+" ");
            }
        }
        System.out.print("Odd: ");
        for(int i=0;i<n.length;i++){
            if(odd[i]!=0){
                System.out.print(odd[i]+" ");
            }
        }
        sc.close();
    }
}
