import java.util.*;
// take 3 input from user and make a function to print their average. 
public class Function5 {
    public static void averageOfNumber( int a, int b, int c) {
        int average = ( a + b + c ) / 3 ;
        System.out.print( " the average of a, b and c is : " + average );
        return; 
        }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner( System.in );
        System.out.print( " enter the a : ");
        int a = sc.nextInt();
        System.out.print( " enter the b : ");
        int b = sc.nextInt();
        System.out.print( " enter the c : ");
        int c = sc.nextInt();

         averageOfNumber( a, b, c);
        
    }    
}