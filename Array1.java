// // Take an array as input from the user. Search for a given num x and print the index at which it occurs.


// import java.util.*;

// public class Array1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter num : ");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         System.out.print("enter x : ");
//         int x = sc.nextInt();

//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == x){
//             System.out.print("X found at index : " + i);
//             }
//         }
//     }
// }

import java.util.*;
public class Array1 {
    public static int indexOfNum(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no : ");
        int numbers[] = new int[6];
        for( int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        // int numbers[8] = sc.nextInt();                      // {2, 4, 6, 6, 7, 8, 5, 4, 8};
        int key = 8;

        int index = indexOfNum(numbers,key);
        if(index == -1){
            System.out.print("NOT Found ");
        } else {  System.out.print("key Found at index "+ index);}
    }
}



