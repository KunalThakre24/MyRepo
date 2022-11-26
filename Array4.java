// Make an array take input from user.
import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter index : ");
        int size = sc.nextInt();
        int[] n = new int[size];

        /*  int[] arr = new int[6];
            int[0] = 3;
            int[1] = 5;
            int[n] = n;
            int[] arr = { 1, 3, 4, 5, 3};
            int[] arr = declaration of array. arr is getting defined in the stack.
            arr = new int[6] = initialisation actually here object is being created in heap memory.
         */

        for(int i=0; i<n.length; i++){
        n [i] = sc.nextInt();
        }

        // FOR EACH METHOD FOR PRINTING THE OUTPUT.
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+ " ");
        }
        System.out.println();
        // another pattern to print array.
        for(int num : n){
           System.out.print( num + " ");
        }
        System.out.println();
        // this one most efficient/Productive.
        System.out.print(Arrays.toString(n));
    }
}



