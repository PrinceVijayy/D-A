package leetcode_easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {

        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != arr[j]) {
                arr[j] = nums[i];
                j++;
            }
        }
        return j + 1;
    }
}
