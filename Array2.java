// take an array of names as input from the user and print them on the screen.


import java.util.*;

public class Array2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int size = sc.nextInt();
        String names[] = new String[size];

        // input
        for(int i=0; i<size; i++){
            System.out.print("enter name : ");
            names[i] = sc.next();
        }
      
        // output
        for( int i=0; i<names.length; i++){
            System.out.println("name" + (i+1) +" is :" + names[i]);
        
        }
    }
}