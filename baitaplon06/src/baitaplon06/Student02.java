package baitaplon06;

public class Student02 {

	// Bài tập 02

	private String name;
	private String studentId;
	private double mathScore;
	private double physicsScore;
	private double chemistryScore;

	public Student02(String name, String studentId, double mathScore, double physicsScore, double chemistryScore) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.mathScore = mathScore;
		this.physicsScore = physicsScore;
		this.chemistryScore = chemistryScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	public double getPhysicsScore() {
		return physicsScore;
	}

	public void setPhysicsScore(double physicsScore) {
		this.physicsScore = physicsScore;
	}

	public double getChemistryScore() {
		return chemistryScore;
	}

	public void setChemistryScore(double chemistryScore) {
		this.chemistryScore = chemistryScore;
	}

	public double calculateAverage() {
		return (mathScore + physicsScore + chemistryScore) / 3;
	}

	public String classify() {
		double average = calculateAverage();
		if (average >= 9) {
			return "Xuất sắc";
		} else if (average < 9 && average >= 8) {
			return "Giỏi";
		} else if (average < 8 && average >= 7) {
			return "Khá";
		} else if (average < 7 && average >= 6) {
			return "Tiên tiến";
		} else if (average < 6 && average >= 5) {
			return "Trung bình";
		} else {
			return "Yếu";
		}
	}

	public void show() {
		System.out.println("Tên sinh viên: " + name);
		System.out.println("Mã sinh viên: " + studentId);
		System.out.println("Điểm trung bình: " + calculateAverage());
		System.out.println("Xếp loại: " + classify());
	}

}
