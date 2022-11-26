// draw this pattern.
/*  123456
    123456
    123456
    123456   */

import java.util.*;
public class LoopsPattern7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}