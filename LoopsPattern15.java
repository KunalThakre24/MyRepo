/*    ******      Solid Rhombus Pattern
     ******
    ******
   ******  */

import java.util.*;

public class LoopsPattern15 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++) {
            for(int j=1; j<=(r-i); j++) {
                System.out.print(" ");
            }

            for(int l=1; l<=r; l++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}