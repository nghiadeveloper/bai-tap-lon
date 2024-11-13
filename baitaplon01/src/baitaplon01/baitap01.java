package baitaplon01;

import java.util.Scanner;

public class baitap01 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài: 
		 * Viết chương trình tính chiều dài cạnh huyền của một tam giác vuông khi biết 2 cạnh góc vuông
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào 2 giá trị a và b (giá trị của chiều dài 2 cạnh góc vuông)
		 * - Đầu ra: Tính chiều dài cạnh huyền của tam giác vuông
		 * - Xử lý:
		 * 		+ Yêu cầu người dùng nhập 2 giá trị a và b (giá trị của chiều dài 2 cạnh góc vuông)
		 * 		+ Tính chiều dài cạnh huyền của tam giác vuông theo công thức:  c = sqrt(a^2 + b^2)
		 * 		+ In ra kết quả 
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập chiều dài cạnh góc vuông thứ nhất (a): ");
		double a = scanner.nextDouble();

		System.out.print("Nhập chiều dài cạnh góc vuông thứ hai (b): ");
		double b = scanner.nextDouble();

		// Tính chiều dài cạnh huyền c
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		System.out.printf("Chiều dài cạnh huyền của tam giác vuông là: " + c);

	}

}
