// Take the input from the user and print the pyramid pattern.
import java.util.*;
public class LoopsPattern5{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter row : ");
    int r = sc.nextInt();
   // System.out.print("enter column : ");
   // int c = sc.nextInt();

    for(int i=1; i<=r; i++){
        for(int j=1; j<=(r-i); j++){
            System.out.print(" ");
        }
        for(int k=1; k<=(2*i-1); k++){
            System.out.print( "*" );
        }
        System.out.println(" ");
     }
    }
}