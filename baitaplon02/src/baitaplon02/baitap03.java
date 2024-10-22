package baitaplon02;

import java.util.Scanner;

public class baitap03 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Cũng yêu cầu như câu 2, nhưng cho phép hỏi người dùng muốn xuất theo thứ tự nào? 
		 * 		- Nếu người dùng chọn 1 thì xuất tăng dần 
		 * 		- Nếu người dùng chọn 2 thì xuất giảm dần
		 * 
		 * Theo mô hình 3 khối ta có:
		 *  - Đầu vào: Yêu cầu người dùng nhâp vào 3 số nguyên
		 *  - Đầu ra: Xuất ra các số theo thứ tự tăng dần hoặc giảm dần
		 *  - Xử lý:
		 *  	+ Yêu cầu người dùng nhâp vào 3 số nguyên
		 *  	+ Chương trình yêu cầu người dùng chọn cách sắp xếp (tăng dần hoặc giảm dần).
		 *  	+ Sử dụng thuật toán sắp xếp nổi bọt (bubble sort) đơn giản để sắp xếp các số theo thứ tự tăng dần (re-search trên google) 
		 *  	+ Dựa vào lựa chọn của người dùng, chương trình sẽ xuất các số theo thứ tự tăng dần hoặc giảm dần
		 *  	+ Xử lý lựa chọn không hợp lệ: Nếu người dùng nhập lựa chọn khác 1 hoặc 2, chương trình sẽ thông báo lỗi
		 *  	+ In ra kết quả
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		// Nhập 3 số nguyên
		System.out.print("Nhập số nguyên thứ nhất: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Nhập số nguyên thứ hai: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Nhập số nguyên thứ ba: ");
		int num3 = scanner.nextInt();
		
		// Hỏi người dùng muốn xuất theo thứ tự nào
		System.out.println("Chọn cách sắp xếp:");
		System.out.println("1. Xuất theo thứ tự tăng dần");
		System.out.println("2. Xuất theo thứ tự giảm dần");
		System.out.print("Nhập lựa chọn của bạn (1 hoặc 2): ");
		int choice = scanner.nextInt();
		
		// Sắp xếp các số theo thứ tự
		int[] nums = {num1, num2, num3};
		
		// Sắp xếp theo thứ tự tăng dần
		for (int i = 0; i < nums.length - 1; i++) {
		    for (int j = i + 1; j < nums.length; j++) {
		        if (nums[i] > nums[j]) {
		            // Đổi chỗ
		            int temp = nums[i];
		            nums[i] = nums[j];
		            nums[j] = temp;
		        }
		    }
		}
		
		// Xuất kết quả theo lựa chọn
		if (choice == 1) {
		    // Xuất theo thứ tự tăng dần
		    System.out.println("Các số theo thứ tự tăng dần: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
		} else if (choice == 2) {
		    // Xuất theo thứ tự giảm dần
		    System.out.println("Các số theo thứ tự giảm dần: " + nums[2] + ", " + nums[1] + ", " + nums[0]);
		} else {
		    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn 1 hoặc 2.");
		}

	}

}
