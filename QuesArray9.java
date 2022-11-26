import java.util.*;

import javax.xml.transform.Source;

//find the total numbers of pairs in array whose sum is equal to given value X. 
public class QuesArray9 {
    public static int pairsum(int[]arr, int target) {
        int ans = 0; 
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target ){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
       System.out.print("Enter target no. : ");
        int X = sc.nextInt();
        
        System.out.print("Enter element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
               
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        
        System.out.print("Total pairs : ");
        System.out.println(pairsum(arr, X));
    }
}
