import java.util.*;
// write a function to print the sum of odd no. from 0 to n.
public class Function6 {
    public static void sumOfOdd(int n ) { 
       
        int sum = 0 ;
        for( int i=0; i<=n; i++) {
            if ( i % 2 != 0) {
                sum = sum + i ;
            }
        }    
         System.out.println(" the sum of odd is : " + sum ); 
    }

    public static void main( String args[] ) {
         Scanner sc = new Scanner(System.in);
         System.out.print(" enter the desire no : ");
         int n = sc.nextInt();
         
         sumOfOdd(n);
         
    }
}