import java.util.*;
/* Given 2 integers a and b. Swap the 2 given values using sum and difference
  methods.
 */
public class sumNdifferenceSwap15 {
    public static void swapwithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
               
        System.out.println(a);             
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        swapwithoutTemp(a, b);
    }
}
