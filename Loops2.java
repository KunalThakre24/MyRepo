import java.util.*;
// find the sum of digits in a given no. n . 
public class Loops2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. : ");
        int n = sc.nextInt();
        int totalsum = 0;
        int givenno = n;

        while(n>0){
            totalsum = totalsum + n % 10;
            n/=10;
        }
        System.out.print("the sum of "+ givenno + " = " + totalsum);
    }
}