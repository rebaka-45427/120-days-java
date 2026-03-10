import java.util.Scanner;
public class Clac {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter Choice \n1.Add \n2.Sub \n3.Mul \n4.Div");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                int sum=a+b;
                System.out.println(sum);
                break;
            case 2:
                int sub=a-b;
                System.out.println(sub);
                break;
            case 3:
                int mul=a*b;
                System.out.println(mul);
                break;
            case 4:
                int div=a/b;
                System.out.println(div);
                break;
            default:
                System.out.println("Enter a valid Choice: ");
        sc.close();
        }
    }   
}
