import java.util.*;

public class Arrays_Arraylist {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         //  array Declaration - arr is defined in stack
    // int[] arr;

    // //  array initialization - object is being created in heap memory
    // arr = new int[5];
    // String[] arr2 = new String[5];
    // for(int i:arr){
    //     System.out.println(i);
    // }

    // for(String i:arr2){
    //     System.out.println(i);
    // }

        //  Arrays of primitives 
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 56;
        arr[4] = 0;
        

        // For each loop, where the num represents every elment of the array
        for(int num:arr){
            // System.out.println(num);
        }
        // System.out.println(Arrays.toString(arr));

        // Arrays of objects

        String[] arr2 = new String[3];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = s.next();
        }
        for(String str:arr2){
            // System.out.println(str);
        }
        System.out.println(Arrays.toString(arr2));
    }
}
