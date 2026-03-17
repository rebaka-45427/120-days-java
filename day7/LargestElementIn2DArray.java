package day7;
import java.util.Scanner;
public class LargestElementIn2DArray {
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
        int largest=matrix[0][0];
        System.out.println("The largest element is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println(largest);
        sc.close();
    }
}
