package baitaplon05;

import java.util.Scanner;

public class BaiTap02 {
	
	public static String checkEvenOrOdd(int number) {
	    if (number % 2 == 0) {
	        return "chẵn";
	    } else {
	        return "lẻ";
	    }
	}

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Viết hàm kiểm tra một số do người dùng nhập vào là số chẵn hay số lẻ
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập một số: ");
		int number = scanner.nextInt();
		
		String result = checkEvenOrOdd(number);
		System.out.println("Số " + number + " là số " + result + ".");

	}

}
