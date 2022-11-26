/* take input from the user and print rectangular pattern
     *****
     ****
     ***
     **
     *     
*/
import java.util.*;
public class LoopsPattern4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int r = sc.nextInt();
       // System.out.print("enter column : ");
        //int c = sc.nextInt();
        
        for(int i=0; /* || 1 */ i<=r; i++){             // || ( i = r; i >= 1; i-- )
            for(int j=1; j<=r-i; /* (r+1-i) */ j++){    //             j <= i;
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}