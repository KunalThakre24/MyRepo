import java.util.*;

// Swap an array.-
public class swapAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " element ");
        int[] arr = new int[n];
        int l = arr.length;


        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before swaping : ");
        System.out.println(Arrays.toString(arr));

        // int temp = arr[0]; 
        // arr[0] = arr[arr.length - 1];
        // arr[arr.length - 1] = temp;

        System.out.print("Array after swaping : ");
        reverseAnArray(arr);
       // System.out.println(arr);   //(arr));
    }

    public static void swapAnArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseAnArray(int[] arr) {
        // Two pointer. method
        int i=0, j=arr.length-1;
        while(i < j){
        swapAnArray(arr, i, j);
        i++;
        j--;
        }

        System.out.println(Arrays.toString(arr));
        // for (int l = 0; l < arr.length; l++) {
        //     System.out.print(arr[l] + " ");
        // }
    }
}
