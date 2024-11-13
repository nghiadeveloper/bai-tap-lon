package baitaplon04;

import java.util.Scanner;

public class BaiTap01 {

	public static void main(String[] args) {

		/**
		 * Đề bài:
		 * Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên
		 * In ra màn hình “Đây là số nguyên dương”
		 * Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
		int number = scanner.nextInt();

		if (number >= 0) {
			System.out.println("Số " + number + " là số nguyên dương");
		} else {
			System.out.println("Số " + number + " là số nguyên âm");
		}
		
	}

}
