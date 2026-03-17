package day7;
public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr ={
        {1, 2, 3},
        {4, 5},
        {6, 7, 8, 9}
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int largest=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(largest<arr[i][j]){
                    largest=arr[i][j];
                }
            }
        }
        System.out.println("The Largest Is : ");
        System.out.print(largest);
    }
}
