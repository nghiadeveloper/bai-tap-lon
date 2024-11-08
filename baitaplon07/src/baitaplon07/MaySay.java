package baitaplon07;

public class MaySay extends ThietBiDien {

	int dungTich;

	public MaySay(String thuongHieu, int congSuat, int dungTich) {
		super(thuongHieu, congSuat);
		this.dungTich = dungTich;
	}

	public void sayDo() {
		System.out.println("Máy sấy đang sấy đồ với dung tích " + dungTich + "kg.");
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin máy sấy:");
		super.hienThiThongTin();
		System.out.println("Dung tích: " + dungTich + "kg");
	}

}
