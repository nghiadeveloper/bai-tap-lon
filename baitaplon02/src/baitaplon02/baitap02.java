package baitaplon02;

import java.util.Scanner;

public class baitap02 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Cho người dùng nhập vào 3 số nguyên. Viết chương trình xuất ra các số theo thứ tự tăng dần 
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào 3 số nguyên
		 * - Đầu ra: Xuất ra các số theo thứ tự tăng dần
		 * - Xử lý: 
		 * 		+ Yêu cầu người dùng nhập vào 3 số nguyên
		 * 		+ Sử dụng cấu trúc điều kiện if để so sánh và hoán đổi các số, đảm bảo rằng num1 <= num2 <= num3
		 * 		+ In ra các số theo thứ tự tăng dần
		 */
		
			Scanner scanner = new Scanner(System.in);
		  
			System.out.print("Nhập số nguyên thứ nhất: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Nhập số nguyên thứ hai: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Nhập số nguyên thứ ba: ");
		int num3 = scanner.nextInt();
		
		// Sắp xếp các số theo thứ tự tăng dần
		int temp;
		
		if (num1 > num2) {
		    // Đổi chỗ num1 và num2
		    temp = num1;
		    num1 = num2;
		    num2 = temp;
		}
		if (num1 > num3) {
		    // Đổi chỗ num1 và num3
		    temp = num1;
		    num1 = num3;
		    num3 = temp;
		}
		if (num2 > num3) {
		    // Đổi chỗ num2 và num3
		    temp = num2;
		    num2 = num3;
		    num3 = temp;
		}
		
		System.out.println("Các số theo thứ tự tăng dần: " + num1 + ", " + num2 + ", " + num3);

	}

}
