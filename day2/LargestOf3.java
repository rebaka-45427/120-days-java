import java.util.Scanner;
public class LargestOf3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Numbers 1: ");
        int first=sc.nextInt();
        System.out.println("Enter a Numbers 2: ");
        int second=sc.nextInt();
        System.out.println("Enter a Numbers 3: ");
        int third=sc.nextInt();
        if(first>second && first>third){
            System.out.println("First is greater");
        }
        else if (second>third){
            System.out.println("Second is greater");
        }
        else{
            System.out.println("Third is greater");
        }
        sc.close();
    }
}