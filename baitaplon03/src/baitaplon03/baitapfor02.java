package baitaplon03;

import java.util.Scanner;

public class baitapfor02 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài: 
		 * Tính tổng các số chẵn từ 1 đến n. Với n dược nhập từ người dùng (Sử dụng vòng lặp while và for)
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào một số nguyên n
		 * - Đầu ra: Tính tổng các số chẵn từ 1 đến n do người dùng nhập 
		 * - Xủ lý:
		 * 		+ Yêu cầu người dùng nhập vào một số nguyên n
		 * 		+ Sử dụng vòng lặp while và for xuát ra các só từ 1 đến n (Với n dược nhập từ người dùng)
		 * 		+ Vòng lặp sẽ bắt đầu khởi chạy với i = 2 cho đén n và mỗi lần lặp i sẽ công thêm 2 (i = i + 2)
		 * 		+ Thực hiện tính tổng các số chẵn từ 1 đến n
		 * 		+ In ra kết quả tính tổng các số chẵn
		 */
		
		Scanner scanner = new Scanner(System.in);

//		Vòng lặp for
		System.out.print("Nhập n: ");
		int n = scanner.nextInt();

		int tong = 0;
		for (int i = 2; i <= n; i += 2) {
			tong += i;
		}

		System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + tong);

//		Vòng lặp while
//		System.out.print("Nhập n: ");
//		int n = scanner.nextInt();
//		
//		int tong = 0;
//		int i = 2;
//		while (i <= n) {
//		    tong += i;
//		    i += 2; 
//		}

		System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + tong);

	}

}
