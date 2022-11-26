import java.util.*;
// Given an integers array 'a'. Return the prefix sum/running sum in the same array.
public class prefixSumArrays {
    public static int[] SumArrays(int[] arr) {
        int n = arr.length;
        int[] prf = new int[n];
        prf[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prf[i] = prf[i-1] + arr[i];
        }
        return prf;
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
        // for (int i : arr) {
        //     arr[i] = sc.nextInt();
        // }

        System.out.print("Before sum : ");
        System.out.println(Arrays.toString(arr));

        int[] pref = SumArrays(arr);
        System.out.print("After sum : ");
        System.out.println(Arrays.toString(pref));
    }
}
