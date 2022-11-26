import java.util.*;
// Rotate the given array 'a' by k steps, where k is non-negative without using extra space.
public class rotateArrayBy_K_wtotsp {
    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }    

    public static void reverse(int[] arr, int st, int end) {
        while (st < end) {
            swap(arr, st, end);
            st++;
            end--;
        }
    }

    public static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        // System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println(" Eneter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter how many times to rotate : ");
        int k = sc.nextInt();

        System.out.print("Before rotate : ");
        System.out.println(Arrays.toString(arr));

        rotateInPlace(arr, k);
        System.out.print("After rotate : ");
        System.out.println(Arrays.toString(arr));
    }
}
