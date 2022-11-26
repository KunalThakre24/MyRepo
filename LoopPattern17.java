/* Palindromic pattern 
           1
          212
         32123 */

import java.util.*;

public class LoopPattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }

            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
         
            for(int K=2; K<=i; K++ ){
                System.out.print(K);
            }
        
            System.out.println();
        }
    }
}