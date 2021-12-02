package arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates2(new int[] { 1, 1, 2, 2, 3, 2, 5 })));
	}

	private static int removeDuplicates(int a[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n - 1];
		return j;
	}

	//Flawed
	public static int[] removeDuplicates(int[] arr) {

		int result = removeDuplicates(arr, arr.length);
		int[] newArray = new int[result];

		for (int i = 0; i < result; i++) {
			newArray[i] = arr[i];
		}
		return newArray;
	}
	
	public static int[] removeDuplicates2(int[] arr) {
		if (arr.length == 0 || arr.length == 1)
			return arr;

		String visited = "";
		for (int i = 0; i < arr.length; i++) {
			if (!visited.contains(String.valueOf(arr[i]))) {
				visited += String.valueOf(arr[i]) + ",";
			}
		}
		return Arrays.stream(visited.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();
	}
}
