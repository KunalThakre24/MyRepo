import java.util.*;

// Check if the given array is sorted or not.
public class QuesArray7 {                       // non static.
    public boolean isSorted(int[] arr) {
        boolean Check = true; 
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                Check = false;
            }
        }
        return Check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter element");
            int[] arr = new int[5];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            QuesArray7 obj = new QuesArray7();  //isSorted(arr)
            boolean ans = obj.isSorted(arr);
            System.out.println("is the given array sorted ? : "+ ans);
        
    }
}
