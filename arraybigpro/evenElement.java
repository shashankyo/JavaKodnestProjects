package arraybigpro;

import java.util.Scanner;

public class evenElement {
	void evenElements(int arr[]) {
		System.out.println("Even elements are");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i] + " ");
			} else {
				continue;
			}
		}
	}
	void oddElements(int arr[]) {
		System.out.println("Odd elements are");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 != 0) {
				System.out.println(arr[i] + " ");
			} else {
				continue;
			}
		}
	}
	void evenValues(int arr[]) {
		System.out.println("Even Values are");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " ");
			} else {
				continue;
			}
		}
	}
	void oddValues(int arr[]) {
		System.out.println("Odd Values are");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i] + " ");
			} else {
				continue;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = scan.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the values");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		evenElement p = new evenElement();
		p.evenElements(arr);
		p.oddElements(arr);
		p.evenValues(arr);
		p.oddValues(arr);

	}
}

