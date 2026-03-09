package day1;
import java.util.Scanner;
public class SumOfNo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Add");
        int n=sc. nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
            sum++;
        }
        System.out.println(sum);
        sc.close();
    }
}
