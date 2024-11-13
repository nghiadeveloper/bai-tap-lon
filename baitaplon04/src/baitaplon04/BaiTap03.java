package baitaplon04;

import java.util.Scanner;

public class BaiTap03 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài: 
		 * Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào một số nguyên dương n: ");
		int n = scanner.nextInt();

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Tổng tất cả số chẵn từ 0 đến " + n + " là: " + sum);

	}

}
