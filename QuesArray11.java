import java.util.*;

/* Find the unique no. in a given array where all the element are being repeated
   twice with one value being unique. */
public class QuesArray11 {
    public static int theUinque(int[] arr) {
        int n = arr.length; 
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                   arr[i] = -1;
                   arr[j] = -1; 
                }
            }
        }
        
        int ans = -1; 
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
             ans = arr[i];   
            }           
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The ans is :");
        System.out.println(theUinque(arr));
    }
}
