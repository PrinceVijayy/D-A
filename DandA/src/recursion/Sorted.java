package recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        System.out.println(isSorted(arr));
    }
    private static boolean isSorted(int[] arr){
        if (arr.length==1){
            return true;
        }
       return helper2(arr,0);
    }

    private static boolean helper(int[] arr,int curr,int prev ,boolean b) {
        if(curr==arr.length){
            return b;
        }
        if(arr[prev]<=arr[curr]){
            return helper(arr,curr+1,prev+1,true);
        }
        return false;
    }
    private static boolean helper2(int[] arr,int index) {
        if(index==arr.length-1){
            return true;
        }
       return arr[index]<=arr[index+1] && helper2(arr,index+1);
    }
}
