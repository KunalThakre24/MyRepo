import java.util.*;
// count the number of digits for a given number n.
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the no. : ");
        int n = sc.nextInt();
        int totaldigits = 0;
        int givenno = n;

        while( n>0) {
            n=n/10;
            totaldigits++;
        }
         System.out.print("total no.in " + givenno + " is " + totaldigits);
    
    }

}