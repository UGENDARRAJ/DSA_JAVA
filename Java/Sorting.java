import java.util.*;

public class Sorting {

//  MAIN METHOD
    public static void main(String[] args){
        int arr[] = {3,1,-5,4,0};
        // selection(arr);
        // bubble(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

//  SELECTION SORT
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = getmaxindex(arr, 0, last);
            swap(arr, max, last);
        }

    }
//  BUBBLE SORT
    static void bubble(int[] arr){
        for(int i=0;i<arr.length; i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
//  INSERTION SORT
    static void  insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
//  FIND THE MAXIMUM ELEMENT
    static int getmaxindex(int[]arr, int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
//  SWAPPING THE ELEMENTS USING TEMP VARIABLE
    static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    
}
