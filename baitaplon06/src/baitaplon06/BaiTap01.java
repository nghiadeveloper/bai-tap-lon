package baitaplon06;

import java.util.Scanner;

public class BaiTap01 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Xây dựng chương trình cho phép người dùng nhập vào: Tên, Mã SV, điểm Toán, điểm Lý, điểm Hóa
		 * Thực hiện các nghiệp vụ dưới đây:
		 * - Tính điểm trung bình từng sinh viên ( T + L + H) / 3
		 * - Xếp loại từng sinh viên theo: >=9 -> Xuất Sắc, 9<Giỏi<=8, 8<Khá<=7, <7<=6, <=5, còn lại Yếu 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số lượng sinh viên:");
		int n = scanner.nextInt();
		scanner.nextLine();

		Student[] studentList = new Student[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập thông tin sinh viên thứ " + (i + 1) + ":");

			System.out.print("\nNhập tên sinh viên: ");
			String name = scanner.nextLine();

			System.out.print("\nNhập mã sinh viên: ");
			String studentId = scanner.nextLine();

			System.out.print("\nNhập điểm Toán: ");
			double mathScore = scanner.nextDouble();

			System.out.print("\nNhập điểm Lý: ");
			double physicsScore = scanner.nextDouble();

			System.out.print("\nNhập điểm Hóa: ");
			double chemistryScore = scanner.nextDouble();

			scanner.nextLine();

			Student student = new Student(name, studentId, mathScore, physicsScore, chemistryScore);
			studentList[i] = student;
		}

		System.out.println("\nThông tin và xếp loại sinh viên:");
		for (int i = 0; i < n; i++) {
			studentList[i].show();
		}

	}

}