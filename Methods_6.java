import java.util.Scanner;

public class Methods_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        System.out.println(isarmStrong(n));
    }

    public static boolean isarmStrong(int n) {
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem ;
        }
        return sum == original;
    }
}
