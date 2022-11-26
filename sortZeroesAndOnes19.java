// import java.util.*;

// // Sort the array which only consist 0 and 1. 
// public class sortZeroesAndOnes19 {

//      public static void printArray(int[] arr) {
//          for (int i = 0; i < arr.length; i++) {
//              System.out.print(arr[i] + " "); 
//         } 
//         //  System.out.println(Arrays.toString(arr));
//          System.out.println();
//      }

//     // public static void swap(int[] arr, int i, int j) {
//     //     int temp = arr[i];
//     //     arr[i] = arr[j];
//     //     arr[j] = temp;
//     // }

//     public static void sortZeroesAndOnes(int[] arr) {
//         int n = arr.length;
//         int zeroes = 0;

//         // count numbers of zeroes.
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == 0) {
//                 zeroes++;
//             }
//         }

//         // 0 to zeroes-1 : 0, zeroes to n-1 : 1
//         for (int i = 0; i < n; i++) {
//             if (i < zeroes) {
//                 arr[i] = 0;
//             } else {
//                 arr[i] = 1;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         System.out.println("Enter " + size + " element");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("original array : ");
//         //printArray(arr);
//         System.out.println(Arrays.toString(arr));

//         System.out.println("sorted array : ");
//         sortZeroesAndOnes(arr);
//         // printArray(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
import java.util.*;
public class sortZeroesAndOnes19 {
    public static void kl(int[] arr) {
        int n = arr.length;
        int zeroes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(i<zeroes){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }        
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1};
        kl(arr);
        System.out.println(Arrays.toString(arr));
    }
}