/*
     1         Number triangle
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6 */

public class LoopsPattern16 {
    public static void main(String[]args) {
        int r = 6;

        for(int i=1; i<=r; i++) {
            for(int j=1; j<=(r-i); j++) {
                System.out.print(" ");
            }

            // for(int l=1; l<=(r-1); l++) {
            //    System.out.print(" ");
            // }          

            for(int l=1; l<=i; l++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}