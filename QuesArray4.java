// Count the no. of occurrences of a particular element X.
import java.util.*;
public class QuesArray4 {   
    public static int countOccurence(int[] arr, int x) {
        int count = 0;
        // int x = 5;

        for(int i=0; i<arr.length; i++){
        if(arr[i] == x){
            count++;    
        }
        }
        return count;
    }

    public static void main(String[] args) {
    Scanner sc= new Scanner( System.in);
    int[] arr = new int[5];
    System.out.println("enter element ");
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("enter num to count");
    int x = sc.nextInt();
    System.out.println("the number is "+ countOccurence(arr, x) +" times in the array");  

    }
    
}
