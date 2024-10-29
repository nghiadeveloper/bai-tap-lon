package baitaplon05;

import java.util.Scanner;

public class BaiTap03 {
	
	public static int calculateSum(int a, int b, int c) {
	    return a + b + c;
	}

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Viết hàm tính tổng 3 số do người dùng nhập vào.
		 */

		Scanner scanner = new Scanner(System.in);
        
		System.out.print("Nhập số thứ nhất: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Nhập số thứ hai: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Nhập số thứ ba: ");
		int num3 = scanner.nextInt();
		
		int sum = calculateSum(num1, num2, num3);
		
		System.out.println("Tổng của ba số là: " + sum);

	}

}
