package recursion;

import java.util.Arrays;
import java.util.Optional;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,23,3,5,9,3,7,8};
        System.out.println(ls(arr,3));
    }
    private static int ls(int[] arr, int target){
        return helper(arr,0,target);
    }
    private static int helper(int[] arr,int index,int target) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return helper(arr,index+1,target);
    }
    private static int helper2(int[] arr,int index,int target) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return helper(arr,index+1,target);
    }
}
