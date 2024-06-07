// import java.util.*;
class Array{
    public static void main(String[] args) {
        // Array --> Type{String, int ,Boolena, char}
        // int[] arr = new int[5];    
        
        // //Declaration of Array
        // int[] arr2;

        // // //Intialization of Array
        // arr2 = new int[5];
        // arr[0] = 5;
        // arr[1] = 6;
        // arr[2] = 3;
        // arr[3] = -1;
        // arr[4] = 0;

        // for(int i:arr){
        //     // System.out.println(i);
        // }

        // // Task1: copy the arr into arr2
        // for (int i = 0; i < arr.length; i++) {
        //     arr2[i] = arr[i];
        // }
        // for(int i:arr2){
        //     System.out.println(i);
        // }

        // Task2: create a num array and find the smallest and largest array value in an array
        int[]num = new int[10];

        num[0] = 9;
        num[1] = 0;
        num[2] = 8;
        num[3] = 11;
        num[4] = -1;
        num[5] = -16; //smallest
        num[6] = 20; // largest
        num[7] = -2;
        num[8] = 2;
        num[9] = -3;
       
        // sort --> 0=smallest, length-1 = largest
        // track a var and update it 
        // min, max functions

        int min = num[0];
        int max = num[0];
        for(int i=0;i<num.length;i++){
            if(min>num[i]){
                min = num[i];
            }
            if(max<num[i]){
                max = num[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}