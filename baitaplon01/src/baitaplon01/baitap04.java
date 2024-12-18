package baitaplon01;

import java.util.Scanner;

public class baitap04 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Tính giá trị trung bình của 5 số được nhập từ bàn phím (Sử dụng hằng số, biến tích lũy, toán tử +=, chú ý phép chia nguyên -ép kiểu )
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào giá trị 5 con số
		 * - Đầu ra: Tính trung bình 5 con số
		 * - Xử lý:
		 * 		+ Khai báo hằng số NUM_COUNT gán giá trị là 5
		 * 		+ Yêu cầu người dùng nhập vào giá trị 5 con số 
		 * 		+ Tính giá trị trung bình
		 */
		
		final int NUM_COUNT = 5;

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int number;

		// Nhập 5 số và tính tổng
		for (int i = 1; i <= NUM_COUNT; i++) {
			System.out.print("Nhập số thứ " + i + ": ");
			number = scanner.nextInt();
			sum += number;
		}

		// Tính giá trị trung bình (ép kiểu để không gặp lỗi chia nguyên)
		double average = (double) sum / NUM_COUNT;

		System.out.printf("Giá trị trung bình của 5 số là: " + average);
	}

}
