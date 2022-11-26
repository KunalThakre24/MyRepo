import java.util.*;

// Rotate the given array 'a' by k steps, where k is non-negative.
// note : k can be greater than as well.
public class rotateArrayBy_K_Steps_17 {
    public static int[] rotateArrayBy_K(int[] arr, int k) {
        int n = arr.length; 
        k = k % n;
        int[] ans = new int[n];
        int j=0;

        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }

        for(int i=0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;               
    }

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.print("Enter k (how many times you want to rotate) : ");
        int k = sc.nextInt();

        int[] ans = rotateArrayBy_K(arr, k);
        printArray(ans);

    }
    
}
