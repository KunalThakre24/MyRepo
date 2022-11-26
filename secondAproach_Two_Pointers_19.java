import java.util.*;
public class secondAproach_Two_Pointers_19 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
        // printArray(arr);
         System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
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
        sortZeroesAndOnes(arr);
        
    }
}



// import java.util.*;
// public class secondAproach_Two_Pointers_19 {
//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void Two_Pointer(int[] arr) {
//         int n = arr.length;
//         int l = 0, r = n-1;
//         while (l < r) {
//             if (arr[l] == 1 && arr[r] == 0) {
//                 swap(arr, l, r);
//                 l++;
//                 r--;
//             }

//             if (arr[l] == 0) {
//                 l++;
//             }

//             if (arr[r] == 1) {
//                 r--;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
    
//     public static void main(String[] args) {
//         int[] arr = {1, 0, 1, 0, 1, 0, 1, 1, 1};
//         Two_Pointer(arr);  
         
//     }
// }