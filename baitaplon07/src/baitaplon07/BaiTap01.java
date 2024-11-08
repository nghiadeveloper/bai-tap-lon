package baitaplon07;

public class BaiTap01 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Tạo một lớp HocSinh để lưu trữ thông tin của một học sinh, bao gồm tên, tuổi và điểm số. 
		 * Thêm các phương thức để in thông tin và tính điểm trung bình
		 */
		
		double[] diemCuaHocSinh = { 8.5, 9.0, 9.5, 8.0 };
		HocSinh hocSinh = new HocSinh("Nguyễn Hiếu Nghĩa", 25, diemCuaHocSinh);

		hocSinh.inThongTin();

		System.out.println("Điểm trung bình: " + hocSinh.tinhDiemTrungBinh());
        
	}

}
