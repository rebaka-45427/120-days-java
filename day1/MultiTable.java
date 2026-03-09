package day1;
import java.util.Scanner;
public class MultiTable {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number print table: ");
        int n=sc.nextInt();
        int mul=1;
        for(int i=1;i<=10;i++){
            mul=n*i;
            System.out.println(n+" "+"x"+" "+i+" "+"="+" "+mul);
        }
        sc.close();
    }
}
