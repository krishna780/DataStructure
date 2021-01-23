package Sorting;

public class SelectionSort {
	// we will select starting index element after that compare starting element to
	// rem aing elements

	public static void main(String[] args) {
		int[] intArray = { 20, 15, -15, -29, 58, 97, 6 };
		for (int lastindex = intArray.length - 1; lastindex > 0; lastindex--) {
			int selectIndex = 0;
			for (int i = 1; i < lastindex; i++) {
				if (intArray[i] > intArray[selectIndex]) {
					selectIndex = i;
				}
				// System.out.println(intArray[selectIndex]);

			}
			swap(intArray, selectIndex, lastindex);
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
