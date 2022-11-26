import java.util.*;
// Reverse an array consisting of integer values.
// public class reverseAnArray16 {
//    public static void reverseArray(int[] arr) {
//        for(int i=arr.length - 1; i>=0; i--){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size : ");
//        int size = sc.nextInt();
//        System.out.println("Enter element");
//        int[] arr = new int[size];

//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        reverseArray(arr);
//    }
// }
public class reverseAnArray16 {
    public static int[] reveseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

//        for (int i=n-1; i>=0; i--){
//            ans[j++] = arr[i];
//     }
        int i = n-1, j=0;
        // int j = 0;
        while (i>=0){
            ans[j++] = arr[i--];
        }
        return ans;
    }

    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7};
        int[] ans = reveseArray(arr);
       // printArray(ans);
System.out.println(Arrays.toString(ans));
    }
}