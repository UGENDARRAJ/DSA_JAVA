import java.util.*;

public class merge {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merges(left, right);
    }

    private static int[] merges(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];

        int i=0,j=0,k=0;
        while( i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not completely inserted
        // Copy the remaining Elements
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
