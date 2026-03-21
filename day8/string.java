package day8;
import java.lang.reflect.Array;
public class string {
    public static void main(String[] args) {

        Object arr = Array.newInstance(String.class, 2);

        Array.set(arr, 0, "Java");
        Array.set(arr, 1, "Reflection");

        System.out.println(Array.get(arr, 0));
        System.out.println(Array.get(arr, 1));
    }
}
