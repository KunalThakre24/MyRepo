import java.util.*;
// Swap the given numbers. 

public class quesSwap14  {
    public static void swap(int a, int b) {
        int tem = 0;
        tem = a; 
        a = b;
        b = tem; 
        System.out.println(a);      
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a = 2; 
        int b = 5;
        swap(a, b);
    }
}
