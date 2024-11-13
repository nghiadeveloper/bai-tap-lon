package baitaplon05;

import java.util.Scanner;

public class BaiTap04 {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		return (double) a / b;
	}
    
	public static void main(String[] args) {

		/**
		 * Đề bài:
		 * Viết chương trình java tính toán đơn giản cộng, trừ, nhân, chia số nguyên khác 0.  
		 * Yêu cầu sử dụng hàm. Xuất thông báo cho người dùng chọn. Nếu là 1 thì cộng, 2 thì trừ, 3 thì nhân, 4 thì chia
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Chọn phép toán:");
		System.out.println("1. Cộng");
		System.out.println("2. Trừ");
		System.out.println("3. Nhân");
		System.out.println("4. Chia");

		System.out.print("Chọn phép tính: ");
		int choice = scanner.nextInt();

		System.out.print("Nhập số nguyên thứ nhất: ");
		int num1 = scanner.nextInt();

		System.out.print("Nhập số nguyên thứ hai (khác 0 nếu chia): ");
		int num2 = scanner.nextInt();

		if (choice == 4 && num2 == 0) {
			System.out.println("Lỗi: Không thể chia cho 0.");
		} else {
			int result;
			switch (choice) {
			case 1:
				result = add(num1, num2);
				System.out.println("Kết quả: " + result);
				break;
			case 2:
				result = subtract(num1, num2);
				System.out.println("Kết quả: " + result);
				break;
			case 3:
				result = multiply(num1, num2);
				System.out.println("Kết quả: " + result);
				break;
			case 4:
				result = (int) divide(num1, num2);
				System.out.println("Kết quả: " + result);
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
			}

		}

	}

}
