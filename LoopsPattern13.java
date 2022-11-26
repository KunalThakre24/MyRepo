// print  0 and 1 triangle.

import java.util.*;
public class LoopsPattern13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=(r+i); j++){
                if( (i+j) % 2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
                 System.out.println(" ");
        }
    }
}