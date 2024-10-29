package baitaplon04;

import java.util.Scanner;

public class BaiTap1_1 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Viết chương trình nhập vào một số nguyên
		 * In ra chuỗi “Số lẻ” nếu số đó là số lẻ và “Số chẵn” nếu số đó là số chẵn.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
		    System.out.println("Số " + number + " là số chẵn");
		} else {
		    System.out.println("Số " + number + " là số lẻ");
		}
		
	}

}
