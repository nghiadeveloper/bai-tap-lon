package baitaplon02;

import java.util.Scanner;

public class baitap01 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài: 
		 * Viết chưng trình nhập vào 2 số nguyên m, n. Xác định và xuất số nguyên lớn nhất
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhâp 2 số nguyên m và n
		 * - Đầu ra: So sánh và tìm số lớn nhất
		 * - Xử lý;
		 * 		+ Yêu cầu người dùng nhâp 2 số nguyên m và n
		 * 		+ So sánh hai số: Sử dụng toán tử điều kiện (toán tử ba ngôi) để xác định số lớn hơn giữa m và n.
		 * 		+ In ra kết quả số nguyên lớn nhất
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số nguyên m: ");
		int m = scanner.nextInt();
		
		System.out.print("Nhập số nguyên n: ");
		int n = scanner.nextInt();
		
		// Tìm số lớn nhất: Sử dụng toán tử điều kiện (toán tử ba ngôi)
		int max = (m > n) ? m : n;
		
		System.out.println("Số nguyên lớn nhất là: " + max);

	}

}
