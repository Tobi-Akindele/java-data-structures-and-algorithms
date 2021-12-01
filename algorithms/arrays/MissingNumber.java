package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		missingNumber1(new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 10 });
		missingNumber2(new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 10 });
	}

	public static void missingNumber1(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if ((i + 1) < intArray.length) {
				if (intArray[i + 1] - intArray[i] > 1) {
					System.out.println(intArray[i] + 1);
					break;
				}
			}
		}
	}

	public static void missingNumber2(int[] intArray) {
		int upperLimit = intArray[intArray.length - 1];
		int sumOfPerfectArray = upperLimit * (upperLimit + 1) / 2; // n(n+1)/2 Formula for sum of integers from 1 to n
		int sumOfIntArray = 0;

		for (int i = 0; i < intArray.length; i++) {
			sumOfIntArray += intArray[i];
		}
		int missingElement = sumOfPerfectArray - sumOfIntArray;
		System.out.println(missingElement);
	}
}
