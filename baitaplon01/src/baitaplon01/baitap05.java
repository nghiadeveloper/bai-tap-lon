package baitaplon01;

import java.util.Scanner;

public class baitap05 {

	public static void main(String[] args) {

		/**
		 * Đề bài: Nhập vào độ C -> đổi sang độ F : °F = ( °C x 1.8 ) + 32
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào độ C
		 * - Đầu ra: In ra kết quả chuyển đổi từ độ C sang độ F
		 * - Xử lý:
		 * 		+ Yêu cầu người dùng nhập vào độ C
		 * 		+ Chuyển đổi độ C sang độ F theo công thức: độ F = (độ C x 1.8) + 32
		 * 		+ In ra kết quả
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào độ C: ");
		double celsius = scanner.nextDouble();

		// Chuyển đổi sang độ F
		double fahrenheit = (celsius * 1.8) + 32;

		System.out.printf("Độ F tương ứng là: " + fahrenheit);

	}

}
