package baitaplon01;

import java.util.Scanner;

public class baitap02 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài: 
		 * Viết chương trình tính giá trị đơn thức P(x) = ax^n (a là số thực, n là số nguyên không âm) với x = 8 cho trước. (Sử dụng thư viện Math)
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Yêu cầu người dùng nhập các giá trị như sau: Nhập a (số thực) và Nhập n (số nguyên không âm)
		 * - Đầu ra: Tính giá trị đơn thức P(x) = ax^n
		 * - Xử lý: 
		 * 		+ Với giá trị x cho trước là: x = 8
		 * 		+ Yêu cầu người dùng nhập vào giá trị a (số thực) và n (số nguyên không âm)
		 * 		+ Chương trình sẽ kiểm tra giá trị n mà người dùng nhập vào là số nguyên không âm. Nếu giá trị hợp lệ sẽ thực hiện tiếp bước tiếp theo
		 * 		+ In ra kết quả của giá trị đơn thức P(x) = ax^n
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a (số thực): ");
        double a = scanner.nextDouble();

        System.out.print("Nhập n (số nguyên không âm): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("n phải là số nguyên không âm.");
            return;
        }

        double x = 8;

        // Tính giá trị của P(x) = ax^n
        double result = a * Math.pow(x, n);

        System.out.println("Giá trị của P(x) = " + result);
	}

}
