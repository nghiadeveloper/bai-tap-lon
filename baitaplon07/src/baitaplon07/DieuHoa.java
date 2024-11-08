package baitaplon07;

public class DieuHoa extends ThietBiDien {
	
	String chucNang;

	public DieuHoa(String thuongHieu, int congSuat, String chucNang) {
		super(thuongHieu, congSuat);
		this.chucNang = chucNang;
	}

	public void dieuChinhNhietDo(int nhietDo) {
		System.out.println("Điều hòa đang làm " + chucNang + " ở nhiệt độ " + nhietDo + "°C.");
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin máy điều hòa:");
		super.hienThiThongTin();
		System.out.println("Chức năng: " + chucNang);
	}
	
}
