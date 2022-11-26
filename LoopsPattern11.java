/*  1
   2 2
  3   3
 4444444   */
 import java.util.*;
 public class LoopsPattern11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int r = sc.nextInt();
        System.out.print("enter column : ");
        int c = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++) {
                if(i+j==5 || j-i==3 || i==4){
                   System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
 }
 