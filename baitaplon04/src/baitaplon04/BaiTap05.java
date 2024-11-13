package baitaplon04;

import java.util.Scanner;

public class BaiTap05 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Viết chương trình nhập vào N phần trong mảng và gán giá trị cho các phần tử của mảng. 
		 * Tìm số lớn nhất và số nhỏ nhất của mảng.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số phần tử n: ");
		int n = scanner.nextInt();

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		int max = numbers[0];
		int min = numbers[0];

		for (int i = 1; i < n; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		System.out.println("Số lớn nhất trong mảng là: " + max);
		System.out.println("Số nhỏ nhất trong mảng là: " + min);

	}

}
