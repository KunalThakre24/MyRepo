import java.util.*;
 /* Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of
  each number sorted in non-decreasing order.
 */
public class lsorting_Non_DecreasingWithSquare21 {
    public static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int l = 0, r = n-1, k = 0;
        int[] ans = new int[n];

        while (l <= r) {
            if (Math.abs(arr[l]) > Math.abs(arr[r])) {
                arr[k++] = arr[l] * arr[l];
                l++;
            } else {
                arr[k++] = arr[r] * arr[r];
                r--; 
            }          
        }
        return ans;
    }


    public static void reveseArray(int[] arr) {
        int l = 0, r = arr.length;
        while(l < r){
            swap(arr, l , r);
            l++;
            r--;
        }
    }

    private static void swap(int[] arr, int l, int r) {
        int tem = arr[l];
        arr[l] = arr[r];
        arr[r] = tem;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }

        System.out.println("original array : ");
        //printArray(arr);
        System.out.println(Arrays.toString(arr));

        
        System.out.println("sorted array : ");
        int[] ans = sortSquare(arr);
        // reverseArray(ans);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
