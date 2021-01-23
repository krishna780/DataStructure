package Sorting;

public class BubbleSortEx {

	public static void main(String[] args) {
		int[] intArray = { 20, 15, -15, -29, 58, 97, 6 };
		for (int lastIndexArray = intArray.length - 1; lastIndexArray > 0; lastIndexArray--) {
			for (int i = 0; i < lastIndexArray; i++) {
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);

				}
				System.out.println(intArray[lastIndexArray] + " " + intArray[i]);
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void swap(int[] array, int j, int i) {
		if (i == j) {
			return;
		} else if (i > j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}
