package recursion.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        int[] ints = bSort(arr, arr.length - 1, 0);
        for (int a :
                arr) {
            System.out.println(a);
        }
    }

    private static int[] bSort(int[] arr, int i, int j) {
        if (i == 0) {
            return arr;
        }
        if (i<j) {
            return bSort(arr, i-1, 0);
        } else {
            if (arr[i] < arr[j]) {
                //swap
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
            return bSort(arr, i, j+1);
        }
    }

    /*private static int[] bSort(int[] arr, int i, int j) {
        if (i == 0) {
            return arr;
        }
        j -= 1;
        if (j < 0) {
            i -= 1;
            j = i;
            return bSort(arr, i, j);
        } else {
            if (arr[i] < arr[j]) {
                //swap
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
            return bSort(arr, i, j);

        }
    }*/
}
