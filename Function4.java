import java.util.*;

public class Function4 {
    public static void printFactorial(int n){
        
        if ( n < 0 ){
            System.out.print(" bsdk negative ka kabhi faactorial nikalta hai kya");
        }
         
        int factorial = 1;
         
        for ( int i=n; i>=1; i--) {
            factorial = factorial * i ;
            
        }
         System.out.println( factorial);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter n :");
        int n = sc.nextInt();

        printFactorial(n);

    }
}