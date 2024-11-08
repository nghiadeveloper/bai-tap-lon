package baitaplon07;

public class TroChoi {

	String tenTroChoi;
	int soLuotChoi;

	public TroChoi(String tenTroChoi, int soLuotChoi) {
		this.tenTroChoi = tenTroChoi;
		this.soLuotChoi = soLuotChoi;
	}

	public String getTenTroChoi() {
		return tenTroChoi;
	}

	public void setTenTroChoi(String tenTroChoi) {
		this.tenTroChoi = tenTroChoi;
	}

	public int getSoLuotChoi() {
		return soLuotChoi;
	}

	public void setSoLuotChoi(int soLuotChoi) {
		this.soLuotChoi = soLuotChoi;
	}

	public void batDauTroChoi() {
		System.out.println("Trò chơi '" + tenTroChoi + "' đã bắt đầu!");
		System.out.println("Số lượt chơi: " + soLuotChoi);
	}

	public void ketThucTroChoi() {
		System.out.println("Trò chơi '" + tenTroChoi + "' đã kết thúc!");
	}

}
