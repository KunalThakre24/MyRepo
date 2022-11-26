import java.util.*;
// make a method( add 2 no. ) then call it 
public class Function2 {
  public static int addNumber( int a, int b){
    int sum = a + b ;
    return sum ;
   }
   
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a");
    int a = sc.nextInt();
    System.out.println("enter b");
    int b = sc.nextInt();
    
    int sum = addNumber(a, b);
    System.out.println("total sum is :" + sum);
    }

}
