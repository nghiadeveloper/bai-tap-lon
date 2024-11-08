package baitaplon07;

public class XeMayBT04 extends PhuongTienGiaoThong {

	public XeMayBT04(String hangSanXuat, String mauSac, int namSanXuat) {
		super(hangSanXuat, mauSac, namSanXuat);
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin xe máy: ");
		super.hienThiThongTin();
	}

}
