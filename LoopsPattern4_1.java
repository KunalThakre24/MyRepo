/* take input from the user and print rectangular pattern
     *****    ||    12345
     ****           1234
     ***            123
     **             12
     *              1
*/
import java.util.*;
public class LoopsPattern4_1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int r = sc.nextInt();

        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
