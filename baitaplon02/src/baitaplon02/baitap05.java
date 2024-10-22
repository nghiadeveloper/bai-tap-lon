package baitaplon02;

import java.util.Scanner;

public class baitap05 {
	
	/**
	 * Đề bài:
	 * Hãy viết chương trình "Chào hỏi" các thành viên trong gia đình có đặc điểm sau đây: 
	 * Đầu tiên máy sẽ hỏi ai đang sử dụng máy, sau đó căn cứ vào câu trả lời nhận được mà máy cần đưa ra một câu chào hợp lý, dễ thương. 
	 * Giả sử gia đình có 4 thành viên là: Bố (B), Mẹ (M), Anh trai (A), Em gái (E)
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Yêu cầu người dùng nhập vào thành viên trong gia đình ví dụ như: Bố (B), Mẹ (M), Anh trai (A), Em gái (E)
	 * - Đầu ra: In ra một câu chào hỏi hợp lý, dễ thương
	 * - Xử lý: 
	 * 		+ Yêu cầu người dùng nhập vào thành viên trong gia đình ví dụ như: Bố (B), Mẹ (M), Anh trai (A), Em gái (E)
	 * 		+ Khi được hỏi "Ai đang sử dụng máy?", bạn hãy nhập tên của thành viên trong gia đình (có thể nhập tên đầy đủ hoặc viết tắt là B, M, A, E) 
	 * 		+ Viết hàm chaoHoi và sử dụng switch - case để giải quyết yêu cầu đề bài
	 * 		+ Chương trình sẽ trả về câu chào phù hợp với thành viên mà bạn đã nhập
	 * 		+ In ra kết quả
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
	    System.out.print("Ai đang sử dụng máy? (Bố, Mẹ, Anh trai, Em gái): ");
	    String hoTen = scanner.nextLine();
	
	    String cauChao = chaoHoi(hoTen);
	    System.out.println(cauChao);
	
	}
	
	public static String chaoHoi(String hoTen) {
	    switch (hoTen) {
	        case "Bố":
	        case "B":
	            return "Chào Bố! Hôm nay Bố có khỏe không?";
	        case "Mẹ":
	        case "M":
	            return "Chào Mẹ! Mẹ đã nấu ăn gì ngon hôm nay?";
	        case "Anh trai":
	        case "A":
	            return "Chào Anh trai! Hôm nay Anh có dự định gì không?";
	        case "Em gái":
	        case "E":
	            return "Chào Em gái! Em đã hoàn thành bài tập về nhà chưa?";
	        default:
	            return "Xin chào! Rất vui được gặp bạn.";
	    }
	}

}
