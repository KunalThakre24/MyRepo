import java.util.*;

// Rotate the given array 'a' by k steps. where k is non-negative without using extra spaces.
// Note : k can be greater than n as well.
public class rotateWithoutSpace18 {
    public static void Reverse(int[] arr) {
        int i=0; j=arr.length;
        while(i<j){

        }
    }
    public static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);      
    }
}
