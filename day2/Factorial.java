import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Factorial: ");
        int n=sc.nextInt();
        int Fact=1;
        for(int i=1;i<=n;i++){
            Fact=Fact*i;
        }
        System.out.println(Fact);
        sc.close();
    }
}
