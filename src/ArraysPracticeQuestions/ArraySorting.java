package ArraysPracticeQuestions;

public class ArraySorting {

	public static boolean arraySortedOrNot(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		int s[] = { 90, 80, 100, 70, 40, 30 };
		int b[] = { 10, 20, 30, 40, 50 };

		System.out.println(ArraySorting.arraySortedOrNot(s));

		System.out.println(ArraySorting.arraySortedOrNot(b));

	}

}