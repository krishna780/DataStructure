package Sorting;

public class ShellSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = { 26, 85, 68, 25, 13, 93, 89 };

		for (int gap = intArr.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < intArr.length; i++) {
				int newElement = intArr[i];
				int j = i;
				while (j >= gap && intArr[j - gap] > newElement) {
					intArr[j] = intArr[j - gap];
					j -= gap;
				}
				intArr[j] = newElement;
			}

		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
