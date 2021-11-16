package recursionexercises;

public class Exercise {

	public static int productofArray(int A[], int N) {
		if (A.length == 0) {
			return 0;
		}
		if (N < 0) {
			return 1;
		}
		if (N == 0) {
			return A[0];
		}
		return A[N - 1] * productofArray(A, N - 1);
	}

	public static String reverse(String str) {
		if (str.length() == 0) {
			return str;
		}
		return Character.toString(str.charAt(str.length() - 1)) + reverse(str.substring(0, str.length() - 1));
	}

	public static boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		if (Character.toString(s.charAt(0)).equals(Character.toString(s.charAt(s.length() - 1)))) {
			return isPalindrome(s.substring(1, s.length() - 1));
		} else {
			return false;
		}
	}

	public static char first(String str) {
		if (str.length() == 0) {
			return ' ';
		}
		if (Character.isUpperCase(str.charAt(str.length() - 1))) {
			return str.charAt(str.length() - 1);
		} else {
			return first(str.substring(0, str.length() - 1));
		}
	}

	public static String capitalizeWord(String str) {

		if (str.isEmpty()) {
			return str;
		}
		char chr = str.charAt(str.length() - 1);
		if (str.length() == 1) {
			return Character.toString(Character.toUpperCase(chr));
		}
		if ((str.substring(str.length() - 2, str.length() - 1).equals(" "))) {
			chr = Character.toUpperCase(chr);
		}
		return capitalizeWord(str.substring(0, str.length() - 1)) + Character.toString(chr);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Exercise.productofArray(arr, arr.length));
		System.out.println(reverse("Damola"));
		System.out.println(isPalindrome("tacocat"));
		System.out.println(first("appmillerS"));
		System.out.println(capitalizeWord("i  love  java"));
	}
}
