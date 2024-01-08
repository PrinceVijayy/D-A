package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(bSearch(arr, 8, 0, arr.length - 1));
    }

    static int bSearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return bSearch(arr, target, start, mid - 1);
        }
        return bSearch(arr, target, mid + 1, end);
    }
}
