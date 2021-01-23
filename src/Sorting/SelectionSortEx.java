package Sorting;

public class SelectionSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 7, 8, 3, 5, 6, 7, 2, 3, 4, 5 };
		for (int in = 0; in < numbers.length - 1; in++) {

			int minNumber = in;
			for (int j = in + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[minNumber]) {

					minNumber = j;

				}
			}
			if (minNumber != in) {

				swap(numbers, minNumber, in);

			}
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void swap(int[] array, int j, int i) {
		if (i == j) {
			return;
		} else if (i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}
