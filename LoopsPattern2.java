/* take input from the user and print rectangular pattern
     ******
     ******
     ******   
*/
import java.util.*;
public class LoopsPattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int r = sc.nextInt();
        System.out.print("enter column : ");
        int c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}