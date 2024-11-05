package baitaplon06;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

	private List<Student02> studentList;

	public StudentManagement() {
		studentList = new ArrayList<>();
	}

	public void createStudent(Student02 student) {
		studentList.add(student);
	}

	public void createDummyData() {
		studentList.add(new Student02("Nguyễn Hiếu Nghĩa", "SV001", 9.5, 9.5, 9.0));
		studentList.add(new Student02("Phạm Quang Linh", "SV002", 8.0, 7.0, 7.5));
		studentList.add(new Student02("Phạm Thị Nhật Lệ", "SV003", 5.5, 6.0, 4.5));
		studentList.add(new Student02("Hằng Du Mục", "SV004", 4.0, 5.0, 4.5));
		studentList.add(new Student02("Nguyễn Thúc Thùy Tiên", "SV005", 6.5, 7.5, 8.0));
	}

	// In danh sách sinh viên
	public void displayAllStudents() {
		System.out.println("\nDanh sách sinh viên:");
		for (Student02 student : studentList) {
			student.show();
		}
	}

	// In sinh viên có điểm trung bình cao nhất
	public void displayTopStudent() {
		Student02 studentMax = null;
		double scoreMax = 0;
		for (Student02 student : studentList) {
			if (student.calculateAverage() > scoreMax) {
				scoreMax = student.calculateAverage();
				studentMax = student;
			}
		}
		if (studentMax != null) {
			System.out.println("\nSinh viên có điểm trung bình cao nhất:");
			studentMax.show();
		}
	}

	// In tất cả sinh viên yếu
	public void displayWeakStudents() {
		System.out.println("\nDanh sách sinh viên yếu:");
		for (Student02 student : studentList) {
			if (student.calculateAverage() < 5) {
				student.show();
			}
		}
	}

	// Tìm sinh viên theo tên
	public void findStudentByName(String name) {
		System.out.println("\nTìm sinh viên theo tên: " + name);
		boolean found = false;
		for (Student02 student : studentList) {
			if (student.getName().equalsIgnoreCase(name)) {
				student.show();
				found = true;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy sinh viên với tên " + name);
		}
	}

	// Tìm sinh viên theo mã
	public void findSudentById(String studentId) {
		System.out.println("\nTìm sinh viên theo mã: " + studentId);
		boolean found = false;
		for (Student02 student : studentList) {
			if (student.getStudentId().equalsIgnoreCase(studentId)) {
				student.show();
				found = true;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy sinh viên với mã " + studentId);
		}
	}

	// Xóa sinh viên theo mã
	public void deleteStudentById(String studentId) {
		boolean found = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getStudentId().equalsIgnoreCase(studentId)) {
				studentList.remove(i);
				System.out.println("Đã xóa sinh viên có mã " + studentId);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy sinh viên với mã " + studentId);
		}
	}

}
