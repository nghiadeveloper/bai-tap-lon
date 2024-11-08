package baitaplon07;

public class BaiTap03 {

	public static void main(String[] args) {

		/**
		 * Đề bài:
		 * Tạo lớp TroChoi để biểu diễn một trò chơi đơn giản. 
		 * Bạn có thể thêm các thuộc tính như tên trò chơi, số lượt chơi và phương thức để bắt đầu và kết thúc trò chơi.
		 */

		TroChoi troChoi = new TroChoi("Trốn tìm", 5);
		
		troChoi.batDauTroChoi();
		troChoi.ketThucTroChoi();
		
	}

}
