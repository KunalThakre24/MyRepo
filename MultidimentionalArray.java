import java.util.*;

public class MultidimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*  int [][] arr = new int[3][];

            int[0][1] = 2; int[0][2] = 4;         23......
         *  int[1][2] = 2; int[1][2] = 4;         456.....
         *
         *  int[][] arr2 = {
         *          {1, 4, 6, 7},
         *          {3, 6, 9, 2},
         *          {1, 4, 5, 7} 
         *    }
         * int [][] arr = { {1,3,5} , {2,4,} }     this one is important one.
         */
        int[][] arr = new int[2][3];
        System.out.println(arr.length); // length will show total row no.(the first[])

         for(int i=0; i< arr.length; i++){ // for row.  i=row
            for(int j=0; j<arr[i].length; j++){ // for column. i=row 
                arr[i][j] = in.nextInt();
            }
        }

       // 1 method
        // for(int i=0; i< arr.length; i++){ // for row.  i=row
        //      for(int j=0; j<arr[i].length; j++){ // for column. i=row 
        //         System.out.print(arr[i][j] + " ");
                
        //      }
        //     System.out.println();
        // }

        // 2 method
        // for(int i=0; i< arr.length; i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        // 3 method (enhanced for loop)
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }    
}