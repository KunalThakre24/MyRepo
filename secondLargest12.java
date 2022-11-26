import java.util.*; 

// Find the second largest element in the given Array.
public class secondLargest12 {
    public static int firstMax(int[] arr) {
        int MX = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > MX){
                MX = arr[i];
            }
        }
        return MX;
    }

    public static int secondMax(int[] arr) {
        int MX = firstMax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == MX){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = firstMax(arr);
        return secondMax; 
   }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter element");
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("The second largest element in the arrray is " + secondMax(arr));

    }
}
