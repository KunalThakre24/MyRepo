// Find the last occurence of an element x in a givn array.
import java.util.*;
public class QuesArray5 {
    public static int lastOccurence(int[] arr, int x) {
        int lastIndex = -1; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i; 
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter x ");
        int x = sc.nextInt();

        System.out.println("the last occurence of "+ x + " is on index " + lastOccurence(arr, x));
    }
}
