package baitaplon04;

import java.util.Scanner;

public class BaiTap04 {

	public static void main(String[] args) {

		/**
		 * Đề bài:
		 * Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
		 * Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số phần tử n: ");
		int n = scanner.nextInt();

		int[] numbers = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}

		double average = (double) sum / n;
		System.out.println("Giá trị trung bình của mảng là: " + average);

	}

}
