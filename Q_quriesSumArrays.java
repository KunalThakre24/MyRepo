import java.util.*;
/*  Given an arrray of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from 
    1 to r ( both included ).
    NOTE : The values of 1 and r in queries follow 1-based indexing.
*/
public class  Q_quriesSumArrays{
    public static int[] SumArrays(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        
        System.out.println(" Enter elements : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        
        int[] pref = SumArrays(arr);
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();
        
        while(q-- > 0){
            System.out.println("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r] - pref[l-1];
            System.out.println("sum : " + ans);
        }
    }
}
