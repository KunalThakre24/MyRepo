import java.util.*;

/*  Given an array 'a' consisting of integers. Return the first value of that is repeating in this array.
 If no value is being repeated, return -1.
*/
public class _1stRepeatingNumber13 {
    public static int firstRepeating(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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

    System.out.println("The first repeatating element in the arrray is " + firstRepeating(arr));

    }    
}
