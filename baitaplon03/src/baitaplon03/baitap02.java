package baitaplon03;

import java.util.Scanner;

public class baitap02 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Tính tổng các số lớn hơn không do người dùng dùng nhập vào. Chương trình sẽ dừng khi nhập vào số bằng 0 hoặc số âm (Sử dụng vòng lặp for và while)
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập vào các số lớn hơn 0 để tính tổng, nhập 0 hoặc số âm để dừng
		 * - Đầu ra: Tính tổng các số đã nhập vào (các số lớn hơn 0)
		 * - Xử lý: 
		 * 		+ Yêu cầu người dùng nhập vào các số lớn hơn 0 để tính tổng
		 *		
		 *		+ Kiểm tra các số mà nbgười dùng nhập vào
		 *			. Néu số nhập vào lớn hơn 0: yêu cầu người dùng thực hiện nhập tiếp tục số thứ 2 
		 *			. Néu số nhập vào bé hơn 0 hoặc bằng 0: thoát khỏi vòng lặp và thực hiện tính tổng của các số lớn hơn 0
		 *		
		 *		+ In ra kết quả phép tính tổng
		 */

		Scanner scanner = new Scanner(System.in);
		
		int tong = 0;
		System.out.println("Nhập các số lớn hơn 0 để tính tổng, nhập 0 hoặc số âm để dừng:");
		
		while (true) {
		    System.out.print("Nhập số: ");
		    int so = scanner.nextInt();
		
		    if (so <= 0) {
		        break;
		    }
		    // Cộng dồn vào tổng
		    tong += so;
		}
		System.out.println("Tổng các số lớn hơn 0 là: " + tong);
		
	}

}
