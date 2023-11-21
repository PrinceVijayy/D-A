package basic_programs;

public class ECC46_getOddCount {

	public static void main(String[] args) {
		
		System.out.println(getOddCount(new int[]{1,2,3,4,5}));

	}

	public static String getOddCount(int arr[]) {
		int count=0;
		boolean allEven = true;
		boolean negativeOrZero = false;
		for (int i : arr) {
			if (i <= 0) {
				negativeOrZero=true;
			}
			//if any one element is odd
			if (i % 2 != 0) {
				//all even is false
				allEven = false;
				count++;
			}
		}
		if (arr.length != 5) return "-1";
		else if(negativeOrZero) return "-2";
		else if (allEven) return "-3";
		else if(arr.length==0) return "-4";
		else return String.valueOf(count);
	}

}
