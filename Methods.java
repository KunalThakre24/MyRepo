import java.util.*;
public class Methods {
    // without static(first we have to make a instance of the class then we can 
    // use the method ). 
    public int addNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 3, b = 5;

        Methods obj = new Methods();
        int sum = obj.addNumber(a, b);
     
        System.out.println("su, ; " + sum);
    }
}
