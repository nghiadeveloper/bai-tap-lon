package baitaplon07;

public class ThietBiDien {
	
	String thuongHieu;
    int congSuat;
    
	public ThietBiDien(String thuongHieu, int congSuat) {
		super();
		this.thuongHieu = thuongHieu;
		this.congSuat = congSuat;
	}

	public String getThuongHieu() {
		return thuongHieu;
	}

	public void setThuongHieu(String thuongHieu) {
		this.thuongHieu = thuongHieu;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
    
	public void khoiDong() {
        System.out.println(thuongHieu + " đã được bật.");
    }

    // Phương thức tắt thiết bị
    public void ketThuc() {
        System.out.println(thuongHieu + " đã được tắt.");
    }

    // Phương thức hiển thị thông tin chung
    public void hienThiThongTin() {
        System.out.println("Thương hiệu: " + thuongHieu);
        System.out.println("Công suất: " + congSuat + "W");
    }

}
