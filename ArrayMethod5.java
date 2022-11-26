// array by function
import java.util.*;
public class ArrayMethod5 {
    public static void main(String[] args) {
        int[] num = { 3, 4, 5, 6,};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    public static void change(int[] arr) {
        arr[1] = 45;
    }
}
