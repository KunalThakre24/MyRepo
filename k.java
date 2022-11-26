import java.util.*;
/*  Check if we can partition the array into two subarrays with equal sum. More formally, check the prefix sum of a part of the array
    is equal to the suffix sum of rest of the array */
public class k {
    public static boolean equalSumPartition (int[] arr) {
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];

            int suffixsum = totalSum - prefSum;
            if(suffixsum == prefSum){
                return true;
            }
        }
        return false;
    }

    private static int findArraySum(int[] arr) {
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            t = t + arr[i];
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal partition possible : " + equalSumPartition(arr));
    }
}
