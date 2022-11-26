// calculate the maximum value out of all the elements in the array.
import java.util.*;
public class QuesArray2{
 void maxOfArray() {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5]; 
   for(int i=0; i<arr.length; i++){
     arr[i] = sc.nextInt();
   }
    int ans = 0;

    for(int i=0; i<arr.length; i++){
        if(arr[i] > ans){
            ans = arr[i];
        }
    }
    System.out.println(ans);
}

    public static void main(String[] args) {
        QuesArray2 obj = new QuesArray2();
        obj.maxOfArray();
    }
}
