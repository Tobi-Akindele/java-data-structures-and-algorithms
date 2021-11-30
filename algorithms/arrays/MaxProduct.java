package arrays;

public class MaxProduct {

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] {10,20,30,40,50}));
	}

	public static String maxProduct(int[] intArray) {
		int max = Integer.MIN_VALUE;
		String pairs = "";
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				int product = intArray[i] * intArray[j];
				if (product > max) {
					pairs = intArray[i] + "," + intArray[j];
					max = product;
				}
			}
		}
		return pairs;
	}
}
