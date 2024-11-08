package baitaplon07;

public class XeHoiBT04 extends PhuongTienGiaoThong {

	public XeHoiBT04(String hangSanXuat, String mauSac, int namSanXuat) {
		super(hangSanXuat, mauSac, namSanXuat);
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin xe hơi: ");
		super.hienThiThongTin();
	}

}
