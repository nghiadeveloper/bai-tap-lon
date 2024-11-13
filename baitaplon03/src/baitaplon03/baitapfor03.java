package baitaplon03;

public class baitapfor03 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài: 
		 * Có bao nhiêu số chia hết cho 3 từ 0 đến 1000 (Sử dụng vòng lặp while và for)
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Sử dụng vòng lặp while và for để in ra các số từ 0 đến 1000 (Đếm số lượng các số chia hết cho 3)
		 * - Đầu ra: Đếm số lượng các số chia hết cho 3 (từ 0 đến 1000)
		 * - Xử lý:
		 * 		+ Khởi tạo biến đếm: count = 0
		 * 		+ Sử dụng vòng lặp while và for để in ra các số từ 0 đến 1000
		 * 		+ Kiểm tra điều kiện:
		 * 			. Nếu giá trị ở vị trí thứ i chia hết cho 3 (với số dư = 0): thực hiện bước đếm số khi vòng lăp thỏa điều kiện dừng
		 * 			. Nếu giá trị ở vị trí thứ i không chia hết cho 3 (với số dư khác 0): báo lỗi
		 * 
		 * 		+ In ra kết quả số lượng các số chia hết cho 3
		 */
		
//		Vòng lặp for
//		int count = 0;
//		for (int i = 0; i <= 1000; i++) {
//		    if (i % 3 == 0) {
//		        count++;
//		    }
//		}
//		System.out.println("Số lượng số chia hết cho 3 từ 0 đến 1000 là: " + count);

//		Vòng lặp while
		int count = 0;
		int i = 0;
		while (i <= 1000) {
			if (i % 3 == 0) {
				count++;
			}
			i++;
		}
		System.out.println("Số lượng số chia hết cho 3 từ 0 đến 1000 là: " + count);
	}

}
