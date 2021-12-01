package arrays;

public class ArrayPermutations {

	public static void main(String[] args) {
		System.out.println(permutation1(new int[] {1,2,3,4,5}, new int[] {5,1,2,3,4}));
		System.out.println(permutation2(new int[] {1,2,3,4,5}, new int[] {5,1,2,3,4}));
	}

	public static boolean permutation1(int[] array1, int[] array2) {//should work for String array too
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			int count = 0;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					count++;
				}
			}
			if (count != 1) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean permutation2(int[] array1, int[] array2) {// should work for integer array only
		if (array1.length != array2.length) {
			return false;
		}
		int sumOfArray1 = 0, sumOfArray2 = 0;
		int productOfArray1 = 1, productOfArray2 = 1;
		for (int i = 0; i < array1.length; i++) {// since we have same length, we'll use length array1
			sumOfArray1 += array1[i];
			productOfArray1 *= array1[i];

			sumOfArray2 += array2[i];
			productOfArray2 *= array2[i];
		}

		return sumOfArray1 == sumOfArray2 && productOfArray1 == productOfArray2;
	}
}
