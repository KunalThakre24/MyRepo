// check number is prime or not.
import java.util.*;
public class Methods_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.println(" number is : " + isPrime(n));
    }
    public static boolean isPrime (int n) {
        Boolean isPrime = true; 
       for(int i=2; i<=(n-1); i++);
            if(n % 2 == 0){
            return false;
        }
         return true;
        }
    }

