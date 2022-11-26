// Find the maximum & minimum number in an array of integers.
// Hint : Read about Integer.VALUE & Integer.MAX_VALUE in java.



// import java.util.*;

// public class Array3 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter : ");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         // input
//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }


//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         // output
//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i] < min) {
//                 min = numbers[i];
//             }

//             if(numbers[i] > max) {
//                 max = numbers[i];
//             }
            
//         }
        
//         System.out.println("Smallest num is "+ min);
//         System.out.println("Largest num is "+ max);
//     }
// }

import java.util.*;
public class Array3 {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for( int i=0; i<number.length; i++) {
            if( largest < number[i]) {
                largest = number[i];
            }

            if( Smallest > number[i]){
                Smallest = number[i];
            }
        }
         System.out.println("The smallest no. in this array is " + Smallest);
        return largest;
    }

    public static void main(String[]arg) {
        int number[] = {1, 3, 4, 5, 3, 4, 9};
        System.out.print("The largest no. in this array is " + getLargest(number));
    }
}