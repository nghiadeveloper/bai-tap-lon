package baitaplon01;

import java.util.Scanner;

public class baitap03 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Viết chương trình tính nhập vào số nguyên dương n với 2 ký số, tính và xuất tổng 2 ký số của n.
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào một số nguyên dương có 2 ký số (10-99)
		 * - Đầu ra: Tính tổng của 2 ký số được tách ra từ một số nguyên dương
		 * - Xử lý:
		 * 		+ Yêu cầu người dùng nhập vào một số nguyên dương có 2 ký số (10-99)
		 * 		+ Tách số nguyên ra thành 2 ký số
		 * 		+ Tính tổng của 2 ký số
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào một số nguyên dương có 2 ký số (10-99): ");
		int n = scanner.nextInt();

		// Tách số nguyên ra thành 2 ký số
		int firstDigit = n / 10;
		int secondDigit = n % 10;

		// Tính tổng
		int sum = firstDigit + secondDigit;

		System.out.println("Tổng của 2 ký số là: " + sum);

	}

}
