package baitaplon05;

import java.util.Scanner;

public class BaiTap01 {
	
	public static int findMax(int a, int b, int c) {
	    int max = a; 
	    if (b > max) {
	        max = b;
	    }
	    if (c > max) {
	        max = c; 
	    }
	    return max;
	}

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Viết hàm tìm số lớn nhất trong 3 số a, b, c do người dùng nhập vào. 
		 */
		
		Scanner scanner = new Scanner(System.in);
	        
		System.out.print("Nhập số a: ");
		int a = scanner.nextInt();
		
		System.out.print("Nhập số b: ");
		int b = scanner.nextInt();
		
		System.out.print("Nhập số c: ");
		int c = scanner.nextInt();
		
		int max = findMax(a, b, c);

		System.out.println("Số lớn nhất là: " + max);

	}

}
