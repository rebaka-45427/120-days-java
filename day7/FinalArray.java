package day7;
public class FinalArray {
    public static void main(String[]args){
        final int[] numbers={10,20,30,40};
        numbers[0]=100;
        numbers[2]=300;
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
