import java.util.Arrays;

public class Mehtods_3 {
    public static void main(String[] args) {
        // create an array
        int[] arr = {2, 4, 6, 7, 5, 1};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    // now here change method changed the value of first index of an array
    // because here we are modifying the reference variable.
    static void change(int[] nums){
        nums[0] = 45;// if you make a change to the obj via this ref variable same obj will be change. 
    }
}
