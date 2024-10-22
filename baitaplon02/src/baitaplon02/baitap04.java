package baitaplon02;

import java.util.Scanner;

public class baitap04 {

	public static void main(String[] args) {

		/**
		 * Đề bài:
		 * Viết chương trình nhập vào số nguyên co hai chữ số. Hãy in ra cách đọc của số nguyên này.
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào một số nguyên có 2 chữ số
		 * - Đầu ra: Chương trình in ra kết quả cách đọc của số nguyên đó (bằng chữ)
		 * - Xử lý:
		 * 		+ Yêu cầu người dùng nhập vào một số nguyên có 2 chữ số
		 * 
		 * 		+ Kiểm tra: 
		 * 			. Nếu số nguyên nhập vào có 2 chữ số: thực hiện bước tiếp theo
		 * 			. Nếu số nguyên nhập vào không phải 2 chữ số: báo lỗi! và yêu cầu "Vui lòng nhập số nguyên có đúng hai chữ số."
		 * 		
		 * 		+ Sử dụng mảng ones để chứa cách đọc các chữ số đơn vị từ 0 đến 9
		 * 		+ Sử dụng mảng tens để chứa cách đọc cho các chữ số hàng chục từ 10 đến 90
		 * 
		 * 		+ Tách số nguyên thành hàng chục và hàng đơn vị, sau đó ghép lại để tạo thành cách đọc chính xác
		 * 
		 * 		+ In ra kết quả cách đọc của số nguyên người dùng vừa nhập bằng chữ
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào số nguyên có hai chữ số: ");
		int number = scanner.nextInt();
		
		if (number < 10 || number > 99) {
		    System.out.println("Vui lòng nhập số nguyên có đúng hai chữ số.");
		} else {
		    String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
		    String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
		
		    int tensDigit = number / 10;
		    int onesDigit = number % 10;
		
		    System.out.println("Cách đọc của số " + number + " là: " + tens[tensDigit] + " " + ones[onesDigit]);
		}

	}

}
