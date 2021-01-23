package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 26, 85, 68, 25, 13, 93, 89 };
		for (int i = 1; i < intArr.length; i++) {
			int newElement = intArr[i];
			int j;
			for (j = i; j > 0 && intArr[j - 1] > newElement; j--) {
				intArr[j] = intArr[j - 1];
			}
			intArr[j] = newElement;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
