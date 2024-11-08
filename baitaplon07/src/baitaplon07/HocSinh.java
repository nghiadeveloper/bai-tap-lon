package baitaplon07;

import java.util.Arrays;

public class HocSinh {

	String ten;
	int tuoi;
	double[] diemSo;

	public HocSinh(String ten, int tuoi, double[] diemSo) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.diemSo = diemSo;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double[] getDiemSo() {
		return diemSo;
	}

	public void setDiemSo(double[] diemSo) {
		this.diemSo = diemSo;
	}

	public void inThongTin() {
		System.out.println("Tên: " + ten);
		System.out.println("Tuổi: " + tuoi);
		System.out.print("Điểm số: ");
		System.out.println(Arrays.toString(diemSo));
	}

	public double tinhDiemTrungBinh() {
		double tongDiem = 0;
		for (double diem : diemSo) {
			tongDiem += diem;
		}
		return diemSo.length > 0 ? tongDiem / diemSo.length : 0;
	}
}
