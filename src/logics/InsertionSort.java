package logics;

import java.util.Scanner;

public class InsertionSort {

	public static void sort(int arr[]) {

		int i, j, temp;
		for (i = 1; i < arr.length; i++) {
			j = i; 
			temp = arr[i];
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n, i;

		System.out.println("Enter number of integer elements");
		n = s.nextInt();

		int arr[] = new int[n];

		System.out.println("\nEnter the integer elements");
		for (i = 0; i < n; i++)
			arr[i] = s.nextInt();

		sort(arr);

		System.out.println("\nElements after sorting ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		s.close();
	}
}