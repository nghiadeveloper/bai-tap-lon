package baitaplon04;

import java.util.Scanner;

public class BaiTap06 {
	
	public static double calculateArea(double width) {
		return width * width;
	}

	public static double calculatePerimeter(double width) {
		return 4 * width;
	}

	public static void main(String[] args) {
		/**
		 * Đề bài:
		 * Viết một chương trình nhập vào chiều rộng của hình vuông và có các phương thức sau:
		 * - Phương thức tính diện tích hình vuông.
		 * - Phương thức tính chu vi hình vuông.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào chiều rộng của hình vuông: ");
		double width = scanner.nextDouble();

		double area = calculateArea(width);
		double perimeter = calculatePerimeter(width);

		System.out.println("Diện tích hình vuông là: " + area);
		System.out.println("Chu vi hình vuông là: " + perimeter);
		
	}

}
