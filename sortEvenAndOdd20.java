import java.util.*;

/* Given an array og integers 'a', move all the even integers at the beginning of the array followed by all the odd 
integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition. 
 */
public class sortEvenAndOdd20 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortEvenAndOdd(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;
        while (left < right) {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }

            if (arr[right] % 2 == 1) {
                right--;
            }
        } 
        System.out.println(Arrays.toString(arr));
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
        sortEvenAndOdd(arr);
    }
}

