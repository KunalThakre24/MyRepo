import java.util.*;;
// Arrays.sort(); method
//public class QuesArray8 {
//    public static void largestAndSmallest(int[] arr) {
//    Arrays.sort(arr);
//    for(int i=0; i<arr.length; i++){
//        System.out.println(arr[i]);
//    }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        largestAndSmallest(arr);
//    }
//}


// print the ( smallest and largest ) element in the array as the output.
public class QuesArray8 {
     static int[] largestAndSmallest(int[] arr) {
    Arrays.sort(arr);
     int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans =  largestAndSmallest(arr);
        System.out.println("smallest : "+ ans[0]);     
        System.out.println("largest : "+ ans[1]);
    }
}
    