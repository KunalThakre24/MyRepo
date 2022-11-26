/* write a function that takes in age as input and returns if that person is eligible
 to vote or not . A person of age > 18 is eligible to vote. */
 
 import java.util.*;

 public class Function8 {
    public static void aplicableForVoteOrNot( int n ) {
        if(  n > 18) {
            System.out.print( " you are above age limit, you can vote ");
        }else { 
            System.out.print( " you are not above age limit, you can not vote ");
        }
    }

    public static void main( String args []) {
        Scanner sc = new Scanner( System.in );
        System.out.print( " enter your age : ");
        int n = sc.nextInt();

        aplicableForVoteOrNot( n );
    }

 }