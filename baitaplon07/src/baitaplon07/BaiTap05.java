package baitaplon07;

public class BaiTap05 {

	public static void main(String[] args) {

		/**
		 * Đề bài:
		 * Lớp Hệ Thống Điều Hòa và Lớp Máy Sấy:
		 * - Lớp cơ sở: ThietBiDien
		 * - Lớp con: DieuHoa, MaySay
		 * - Thuộc tính: Các thuộc tính liên quan đến thiết bị cụ thể, chẳng hạn như công suất, chức năng (làm lạnh hoặc làm nóng), v.v
		 * - Phương thức: Các phương thức đặc biệt cho từng loại thiết bị.
		 */
		
		ThietBiDien dieuHoa = new DieuHoa("Panasonic", 2000, "Làm lạnh");
		dieuHoa.hienThiThongTin();
		dieuHoa.khoiDong();
		((DieuHoa) dieuHoa).dieuChinhNhietDo(27);
		dieuHoa.ketThuc();

		System.out.println();

		ThietBiDien maySay = new MaySay("Samsung", 1500, 7);
		maySay.hienThiThongTin();
		maySay.khoiDong();
		((MaySay) maySay).sayDo();
		maySay.ketThuc();
        
	}

}
