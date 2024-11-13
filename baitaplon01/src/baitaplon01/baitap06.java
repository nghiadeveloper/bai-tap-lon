package baitaplon01;

import java.util.Scanner;

public class baitap06 {

	public static void main(String[] args) {

		/**
		 * Đề bài: 
		 * Cho trước tỉ giá VND-USD là : 23.500đ, viết chương trình nhập vào số USD và tính ra tiền VNĐ
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào số USD
		 * - Đầu ra: Chuyển đổi USD sang VNĐ
		 * - Xử lý: 
		 * 		+ Yêu cầu người dùng nhập vào số USD
		 * 		+ Chuyển đổi USD sang VNĐ theo công thức: vnd = usd * 23500
		 * 		+ In ra kết quả
		 */
		
		final double EXCHANGE_RATE = 23500;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số USD: ");
		double usd = scanner.nextDouble();

		// Tính ra tiền VNĐ
		double vnd = usd * EXCHANGE_RATE;

		System.out.printf("Số tiền tương ứng là: " + vnd + " VNĐ");

	}

}
