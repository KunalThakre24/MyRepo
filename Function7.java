import java.util.*;
// write a program which takes radius as a input ans gives circumference as output.
public class Function7 { 
    public static void radiusOfCircumference ( double n ) {
        
        double circumference = ( 2 * 3.14 * n ) ; 
        System.out.println( " the circumference of given num is " + circumference); 
    }

    public static void main ( String args [] ) {
        Scanner sc = new Scanner ( System.in );
        System.out.print(" enter the radius : ");
        double n = sc.nextDouble();

        radiusOfCircumference(n);
                  
    }
}  



