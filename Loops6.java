import java.util.*;
public class Loops6{
    public static void main(String args[]) {
        Scanner sc = new Scanner ( System.in );
        System.out.print(" ente a : ");
        int a = sc.nextInt();
        System.out.print(" ente b : ");
        int b = sc.nextInt();

        int ans = 1;

        for(int i = 1; i <= b; i++){
            ans *= a;
        }
        System.out.print("the power of given output is "+ ans);
        
        //System.out.print("the power of given output is "+ Math.pow( a, b) );
    }
}