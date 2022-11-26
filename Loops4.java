// find the sum of the following series
//  S = 1-2+3-4...n
import java.util.*;
public class Loops4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. : ");
        int n = sc.nextInt();
        int totalsum = 0;

        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                totalsum = totalsum - i;
            }else{
                totalsum = totalsum + i;
            }
        }
        System.out.print(totalsum);
     
    }
}