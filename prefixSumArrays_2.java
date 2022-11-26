import java.util.*;
// Given an integers array 'a'. Return the prefix sum/running sum in the same array without making an extra array,
public class prefixSumArrays_2 {
    public static int[] SumArrays(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
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
    
        System.out.print("Before sum : ");
        System.out.println(Arrays.toString(arr));

        int[] pref = SumArrays(arr);
        System.out.print("After sum : ");
        System.out.println(Arrays.toString(pref));
    }
}
