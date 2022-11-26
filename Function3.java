import java.util.*;
// make a method( multiply 2 no. ) then call it
public class Function3 {
    public static int calculateProduct(int a, int b) {
        return a * b;
     }  

     public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();

        int product = calculateProduct(a, b);
        System.out.print(" total product is :" + product);
     }
   
}