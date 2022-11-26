import java.util.*;
public class QuesArray6 {
    public static int checkGreater(int arr[], int x) {
        int count = 0; 
        for (int i=0; i<arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,44,6,7,45,3};
        int x = 6;
        System.out.println("there are "+ checkGreater(arr, x) + " numbers which are strictly greater than "+ x);
    }
}