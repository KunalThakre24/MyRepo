import java.util.*;

// Count the number of triplets whose sum is equal to given X. 
public class QuesArray10 {
     public static int tripletsSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("enter element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Enter target : ");
        int x = sc.nextInt(); 

        System.out.println("total no of triplets are");
        System.out.println(tripletsSum(arr, x));
     }
}

