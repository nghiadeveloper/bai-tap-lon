package baitaplon06;

import java.util.Scanner;

public class BaiTap02 {

	public static void main(String[] args) {

		/**
		 * Xây dựng chương trình OOP cho phép người dùng nhập vào: Tên, Mã SV, điểm Toán, Lý Hóa. 
		 * Cho phép nhập nhiều Sinh viên và thực hiện (Viết hàm tạo dữnliệu giả) 
		 * - Tính điểm trung bình từng sinh viên ( T + L + H)/3 
		 * - Xếp loại từng sinh viên theo: >=9 -> Xuất Sắc, 9<Giỏi<=8, 8<Khá<=7, <7<=6, <=5, còn lại Yếu. In ra danh sách theo mẫu 
		 * - In ra SV có ĐTB cao nhất. In ra danh sách theo mẫu 
		 * - In ra tất cả sinh viên Yếu. In ra danh sách theo mẫu 
		 * - Tìm sinh viên theo tên. In ra danh sách theo mẫu
		 * - Tìm sinh viên theo mẫu
		 * - Xóa 1 sinh viên theo mẫu
		 */

		Scanner scanner = new Scanner(System.in);

		StudentManagement studentManagement = new StudentManagement();
		studentManagement.createDummyData();

		while (true) {
			System.out.println("\n1. In danh sách sinh viên");
			System.out.println("2. In sinh viên có điểm trung bình cao nhất");
			System.out.println("3. In tất cả sinh viên yếu");
			System.out.println("4. Tìm sinh viên theo tên");
			System.out.println("5. Tìm sinh viên theo mã");
			System.out.println("6. Xóa sinh viên theo mã");
			System.out.println("7. Thoát");
			System.out.print("Chọn chức năng (1-7): ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				studentManagement.displayAllStudents();
				break;
			case 2:
				studentManagement.displayTopStudent();
				break;
			case 3:
				studentManagement.displayWeakStudents();
				break;
			case 4:
				System.out.print("Nhập tên sinh viên cần tìm: ");
				String name = scanner.nextLine();
				studentManagement.findStudentByName(name);
				break;
			case 5:
				System.out.print("Nhập mã sinh viên cần tìm: ");
				String studentId = scanner.nextLine();
				studentManagement.findSudentById(studentId);
				;
				break;
			case 6:
				System.out.print("Nhập mã sinh viên cần xóa: ");
				String deleteStudentId = scanner.nextLine();
				studentManagement.deleteStudentById(deleteStudentId);
				break;
			case 7:
				System.out.println("Thoát chương trình.");
				scanner.close();
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
			}
		}

	}

}
