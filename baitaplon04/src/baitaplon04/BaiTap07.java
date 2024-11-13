package baitaplon04;

import java.util.Scanner;

public class BaiTap07 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài
		 * Nhập mảng có n phần tử (bằng tay hoặc tự động) các số nguyên, hiển thị mảng vừa nhập ra màn hình.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số phần tử n: ");
		int n = scanner.nextInt();

		int[] numbers = new int[n];

		System.out.println("Nhập vào các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử thứ " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		System.out.print("Mảng vừa nhập là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

}
