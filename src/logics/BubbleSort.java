package logics;

public class BubbleSort {
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}

			}
		}

	}

	public static void main(String args[]) {
		int[] arr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		sort(arr);
		
		for(int a :arr)
			System.out.println(a);
			
	}
}

