// Print the sum of array.
public class QuesArray1 {
     void sumOfArray() {
    int[] arr = { 3, 5, 6, 7 };
    int sum = 0;  
    for (int i = 0;i < arr.length; i++) {
        sum += arr[i];
    }
    System.out.println(sum + " ");
}

public static void main(String[] args) {
    QuesArray1 obj = new QuesArray1();
    obj.sumOfArray();
}
}

