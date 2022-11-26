/* Two num. are entered by the user, x and n. write a function to find the value of one num.
 raised to the power of another i.e xⁿ. */

import java.util.*;

public class Function10 {
    public static void powerOfInputs () {
        Scanner sc = new Scanner ( System.in );
        System.out.print(" ente a :");
        int a = sc.nextInt();
        System.out.print(" ente b : ");
        int b = sc.nextInt();
     System.out.print( Math.pow( a, b) );
    }

    public static void main ( String args[] ) {
        
        powerOfInputs();
    }
}