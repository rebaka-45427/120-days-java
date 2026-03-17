package day7;
import java.util.Scanner;
public class ColSumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter 9 elements for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 3x3 Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum Matrix is:");
        
        for (int i = 0; i < 3; i++) {
            int sum=0;
            for (int j = 0; j < 3; j++) {
                sum=sum+matrix[j][i];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
