package arrays;

public class ArrayPermutations {

	public static void main(String[] args) {
		System.out.println(permutation(new int[] {1,2,3,4,5}, new int[] {5,1,2,3,7}));
	}

	public static boolean permutation(int[] array1, int[] array2) {
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
}
