// check if number is armstrong or not.
import java.util.*;
public class Methods_5 {
 private static Object originalNum;

public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print(" enter number :");
    int n = 153;
    isarmStrong(n);
 }
 
 public static void isarmStrong(int n) {
   int originalNum, remainder, result = 0;
   originalNum = n;
   while(originalNum != 0){
       remainder = originalNum % 10 ;
       result += Math.pow(remainder, 3);
       originalNum /= 10;  
   }
   
   if(result == n){
    System.out.println(n + " is an armstrong number ");
   } else{
    System.out.println(n + " is not an armstrong number ");
   }
 }
}