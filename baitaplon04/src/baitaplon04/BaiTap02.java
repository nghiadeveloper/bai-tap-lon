package baitaplon04;

import java.util.Scanner;

public class BaiTap02 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Viết chương trình cho phép nhập vào một số nguyên dạng số từ 1 đến 10, 
		 * sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào một số nguyên từ 1 đến 10: ");
		int number = scanner.nextInt();

		String result;

		switch (number) {
		case 1:
			result = "Một";
			break;
		case 2:
			result = "Hai";
			break;
		case 3:
			result = "Ba";
			break;
		case 4:
			result = "Bốn";
			break;
		case 5:
			result = "Năm";
			break;
		case 6:
			result = "Sáu";
			break;
		case 7:
			result = "Bảy";
			break;
		case 8:
			result = "Tám";
			break;
		case 9:
			result = "Chín";
			break;
		case 10:
			result = "Mười";
			break;
		default:
			result = "Số không hợp lệ. Vui lòng nhập số từ 1 đến 10.";
			break;
		}

		System.out.println(result);

	}

}
