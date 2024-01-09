package recursion.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        int[] ints = sSort(arr, arr.length - 1, 0,0);
        for (int a :
                arr) {
            System.out.println(a);
        }
    }

    private static int[] sSort(int[] arr, int i, int j, int max) {
        if (i == 0) {
            return arr;
        }
        if (i<j) {
            return sSort(arr, i-1, 0,max);
        } else {
            if (arr[j] < arr[j]) {
                //swap
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
            return sSort(arr, i, j+1,max);
        }
    }
}
