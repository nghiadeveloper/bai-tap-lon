package baitaplon07;

public class BaiTap04 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Lớp Xe Hơi và Xe Máy:
		 * - Lớp cơ sở: PhuongTienGiaoThong
		 * - Lớp con: XeHoi, XeMay
		 * - Thuộc tính: Hãng sản xuất, màu sắc, năm sản xuất
		 * - Phương thức: Hiển thị thông tin về xe.
		 */

		PhuongTienGiaoThong xeHoi = new XeHoiBT04("Mazda", "Đỏ", 2024);
		xeHoi.hienThiThongTin();

		System.out.println();

		PhuongTienGiaoThong xeMay = new XeMayBT04("Vinfast", "Xanh", 2024);
		xeMay.hienThiThongTin();
		
	}

}
