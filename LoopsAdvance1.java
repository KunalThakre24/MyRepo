// print butterfly pattern.
import java.util.*;
public class LoopsAdvance1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row ");
        int r = sc.nextInt();

        // upper part
        for(int i=1; i<=r; i++){
            // 1 half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for spaces
            for(int j=1; j<=2 * (r-i); j++){
                System.out.print(" ");
            }
            // 2 half
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=r; i>=1; i--){
            // 1 half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for spaces
            for(int j=1; j<=2 * (r-i); j++){
                System.out.print(" ");
            }
            // 2 half
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 