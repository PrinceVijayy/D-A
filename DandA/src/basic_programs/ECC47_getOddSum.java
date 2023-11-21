package basic_programs;

public class ECC47_getOddSum {

	public static void main(String[] args) {

		System.out.println(getOddSum(new int[] { 1, 2, 3, 4, 5 }));

	}

	public static int getOddSum(int arr[]) {
		int result = 0;
		boolean allEven = true;
		boolean negativeOrZero = false;
		for (int i : arr) {
			if (i <= 0) {
				negativeOrZero = true;
			}
			// if any one element is odd
			if (i % 2 != 0) {
				// all even is false
				allEven = false;
				result+=i;
			}
		}
		if (arr.length != 5)
			return -1;
		else if (negativeOrZero)
			return -2;
		else if (allEven)
			return -3;
		else if (arr.length == 0)
			return -4;
		else
			return result;
	}

}
