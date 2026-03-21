package day8;
import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {

        Object arr = Array.newInstance(int.class, 3);

        Array.set(arr, 0, 10);
        Array.set(arr, 1, 20);
        Array.set(arr, 2, 30);

        System.out.println(Array.get(arr, 0)); // 10
        System.out.println(Array.get(arr, 1)); // 20
        System.out.println(Array.get(arr, 2)); // 30
    }
}