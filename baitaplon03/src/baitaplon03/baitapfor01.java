package baitaplon03;

public class baitapfor01 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * In tắt cả số nguyên dương lẻ / chẵn nhỏ hơn 100 (Sử dụng vòng lặp while và for) - dùng bước nhảy và dùng %2 
		 * 
		 * Theo mô hình 3 khối ta có:
		 * - Đầu vào: Viết vòng lặp For và While in ra các số từ 1 đến 100 
		 * - Đầu ra: In tắt cả số nguyên dương lẻ / chẵn nhỏ hơn 100 (Sử dụng vòng lặp while và for)
		 * - Xử lý: 
		 * 		+ Xuất ra câu thông báo in ra các số chẵn / lẻ nhỏ hơn 100
		 * 		+ Thực hiện như sau:
		 * 			. Nếu các số là số chẵn thì i sẽ chạy từ 2 đến 98 và mỗi lần chạy i sẽ tăng lên 2 (i = i + 2) 
		 * 			. Nếu các số là số lẻ thì i sẽ chạy từ 1 đến 99 và mỗi lần chạy i sẽ tăng lên 2 (i = i + 2) 
		 * 		+ In ra kết quả các số chẵn và lẻ bé hơn 100
		 */

		
		// Vòng lặp for
		System.out.println("Các số chẵn nhỏ hơn 100:");
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nCác số lẻ nhỏ hơn 100:");
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        

        
        // Vòng lặp while
        System.out.println("\n\nCác số chẵn nhỏ hơn 100:");
        int i = 2;
        while (i < 100) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\n\nCác số lẻ nhỏ hơn 100:");
        i = 1;
        while (i < 100) {
            System.out.print(i + " ");
            i += 2;
        }
	}

}
