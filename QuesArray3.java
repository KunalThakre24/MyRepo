// Search the given element x in the array. If present then return the index else return -1.
public class QuesArray3 {
    public static void main(String[] args) {
        int arr[] = {3, 7, 5, 6, 7, 2};
        int x = 7; 
        int y = -1;

        for(int i=0; i<arr.length; i++){
            if( arr[i] == x ){
                y = i;   
                break;           
            } 
        }
        if(y==-1){
            System.out.println("not found");
        }else
        System.out.println("found 6 at index "+ y);
    }
}
    