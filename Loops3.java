import java.util.*;
// Reverse the digit of a number.

public class Loops3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. : ");
        int n = sc.nextInt();
        int Reversedans = 0;
        

        while(n>0){
            Reversedans = Reversedans * 10 + n % 10;
            n = n / 10 ;            
        }

        System.out.print("the reversed no. is " + Reversedans);
    }
}