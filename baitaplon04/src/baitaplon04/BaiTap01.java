package baitaplon04;

import java.util.Iterator;
import java.util.Scanner;

public class BaiTap01 {
	
	/**
	 * a. Viết hàm nhập
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Yêu cầu người dùng nhập vào số lượng phần tử và nhập từng giá trị cho mảng 
	 * - Đầu ra: Hiển thị các giá trị mà người dùng đã nhập
	 * - Xử lý: 
	 * 		+ Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
	 * 		+ Khởi tạo một mảng số nguyên có kích thước n. Mảng này sẽ được dùng để lưu trữ các số nguyên mà người dùng nhập vào
	 * 		+ Yêu cầu người dùng nhập n số nguyên
	 * 		+ Sử dụng vòng lặp for để sau mỗi lần lặp chương trình sẽ yêu cầu nhập số thứ (i + 1) đến khi thỏa điều kiện dừng vòng lặp
	 * 		+ Trả về mảng array chứa các số nguyên mà người dùng đã nhập 
	 */
	
	public static int[] inputArray(int n) {
	    Scanner scanner = new Scanner(System.in);
	    
	    int[] array = new int[n];
	
	    System.out.println("Nhập " + n + " giá trị cho mảng:");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Vui lòng nhập số nguyên thứ " + (i + 1) + ": ");
	        array[i] = scanner.nextInt();
	    }
	
	    return array;
	}


	
	/**
	 * a. Viết hàm xuất
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Yêu cầu người dùng nhập vào số lượng phần tử và nhập từng giá trị cho mảng 
	 * - Đầu ra: Hiển thị các giá trị mà người dùng đã nhập
	 * - Xử lý: 
	 * 		+ Sử dụng vòng lặp for duyệt qua từng phần tử mà người dùng đã nhập
	 * 		+ Xuất ra các giá trị mà người dùng đã nhập
	 */
	
	public static void printArray(int[] array) {
		
	    System.out.println("Các số nguyên trong mảng là:");
	    
	    for (int i = 0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
	    }
	    
	    System.out.println(); 
	}


	
	/**
	 * b. Tìm số lớn nhất và vị trí của nó trong mảng
	 *
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Từ các giá trị mà người dùng nhập vào cho mảng thực hiện tìm số lớn nhất và vị trí của nó trong mảng
	 * - Đầu ra: Tìm số lớn nhất và vị trí của nó trong mảng
	 * - Xử lý: 
	 * 		+ Khai báo biến max: giá trị của phần tử đầu tiên trong mảng
	 * 		+ Khai báo biến position: lưu vị trí của số lớn nhất, bắt đầu từ chỉ số 0 (vị trí của phần tử đầu tiên)
	 * 		+ Sử dụng vòng lặp for: lặp từ phần tử thứ hai (vị trí thứ 1) cho đến hết mảng
	 * 		+ Kiểm tra xem phần tử hiện tại (array[i]) có lớn hơn giá trị của max hay không
	 * 		+ Cập nhật giá trị của max thành phần tử hiện tại
	 * 		+ Cập nhật vị trí của số lớn nhất thành chỉ số của phần tử hiện tại
	 */
	
	public static void findMax(int[] array) {
	    int max = array[0];
	    int position = 0;
	
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > max) {
	            max = array[i];
	            position = i;
	        }
	    }
	    
	    System.out.println("Số lớn nhất là: " + max + " tại vị trí: " + position);
	}


    
	/**
	 * c. Tìm số âm đầu tiên và vị trí của nó trong mảng
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Từ các giá trị mà người dùng nhập vào cho mảng thực hiện tìm số âm đầu tiên và vị trí của nó trong mảng
	 * - Đầu ra: Tìm số âm đầu tiên và vị trí của nó trong mảng
	 * - Xử lý:
	 * 		+ Sử dụng vòng lặp for: Bắt đầu lặp từ phần tử đầu tiên (chỉ số 0) cho đến hết mảng. Vòng lặp này sẽ kiểm tra từng phần tử trong mảng
	 * 		+ Kiểm tra xem phần tử hiện tại (array[i]) có phải là số âm hay không? bằng cách so sánh giá trị của phần tử với 0
	 * 		+ In ra số âm đầu tiên tìm thấy và vị trí của nó trong mảng
	 * 		+ Kết thúc phương thức ngay sau khi tìm thấy số âm đầu tiên (return)
	 */
	
	public static void findFirstNegative(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] < 0) {
	            System.out.println("Số âm đầu tiên là: " + array[i] + " tại vị trí: " + i);
	            return;
	        }
	    }
	    
	    System.out.println("Không có số âm trong mảng.");
	}


	
	/**
	 * d. Tìm số âm lớn nhất và vị trí của nó trong mảng
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Từ các giá trị mà người dùng nhập vào cho mảng thực hiện tìm số âm lớn nhất và vị trí của nó trong mảng
	 * - Đầu ra: Tìm số âm lớn nhất và vị trí của nó trong mảng
	 * - Xử lý:
	 * 		+ Khai báo biến maxNeg với giá trị nhỏ nhất của kiểu số nguyên (Integer.MIN_VALUE)
	 * 		+ Khai báo biến position với giá trị -1, dùng để lưu vị trí của số âm lớn nhất. Giá trị -1 cũng được sử dụng để kiểm tra xem có số âm nào trong mảng hay không?
	 * 		+ Sử dụng vòng lặp fpr: lặp qua từng phần tử trong mảng từ chỉ số 0 đến chỉ số cuối cùng
	 * 		+ Kiểm tra xem phần tử hiện tại (array[i]) có phải là số âm và lớn hơn giá trị maxNeg hay không?
	 * 		+ Nếu thỏa điều kiện:
	 * 			. Cập nhật giá trị của maxNeg thành phần tử âm hiện tại
	 * 			. Cập nhật vị trí của số âm lớn nhất thành chỉ số của phần tử hiện tại
	 * 		+ Kiểm tra xem có tìm thấy số âm nào không?
	 * 			. Nếu position khác -1 (đã tìm thấy ít nhất một số âm)
	 * 			. Nếu có số âm lớn nhất: In ra số âm lớn nhất (maxNeg) và vị trí của nó (position)
	 * 			. Ngược lại không có số âm nào 
	 */
    
	public static void findMaxNegative(int[] array) {
	    int maxNeg = Integer.MIN_VALUE;
	    int position = -1;
	
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] < 0 && array[i] > maxNeg) {
	            maxNeg = array[i];
	            position = i;
	        }
	    }
	
	    if (position != -1) {
	        System.out.println("Số âm lớn nhất là: " + maxNeg + " tại vị trí: " + position);
	    } else {
	        System.out.println("Không có số âm trong mảng.");
	    }
	}

    
	
	/**
	 * e. Tính tổng các số chẵn
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Từ các giá trị mà người dùng nhập vào cho mảng thực hiện tính tổng các số chẵn
	 * - Đầu ra: Tính tổng các số chẵn
	 * - Xử lý:
	 * 		+ Khai báo biến sum với giá trị 0 dùng để lưu tổng của các số chẵn trong mảng
	 * 		+ Sử dụng vòng lặp foreach để duyệt qua từng phần tử trong mảng. Mỗi phần tử được gán cho biến num trong mỗi lần lặp
	 * 		+ Kiểm tra xem số hiện tại (num) có phải là số chẵn hay không? Bằng cách sử dụng phép chia lấy dư %:
	 *			. Nếu num chia cho 2 còn dư 0 thì số đó là số chẵn
	 * 			. Nếu thỏa điều kiện trên thì số chẵn hiện tại sẽ được cộng vào sum
	 * 		+ Trả về sum
	 */
    
	public static int sumEven(int[] array) {
	    int sum = 0;
	    
	    for (int num : array) {
	        if (num % 2 == 0) {
	            sum += num;
	        }
	    }  
	    
	    return sum;
	}


	
	/**
	 * f. Đếm có bao nhiêu số âm
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Từ các giá trị mà người dùng nhập vào cho mảng thực hiện đếm có bao nhiêu số âm
	 * - Đầu ra: Đếm có bao nhiêu số âm
	 * - Xử lý:
	 * 		+ Khai báo biến count với giá trị 0 dùng để lưu trữ số lượng số âm trong mảng
	 * 		+ Sử dụng vòng lặp foreach để duyệt qua từng phần tử trong mảng. Mỗi phần tử được gán cho biến num trong mỗi lần lặp
	 * 		+ Kiểm tra xem số hiện tại (num) có phải là số âm hay không?
	 * 			. Nếu thỏa điều kiện thì biến count sẽ được tăng lên 1 (count++)
	 * 		+ Trả về count
	 */
    
	public static int countNegative(int[] array) {
	    int count = 0;
	    
	    for (int num : array) {
	        if (num < 0) {
	            count++;
	        }
	    }
	    
	    return count;
	}

    
	
	/**
	 * g. Tổng các số âm
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Từ các giá trị mà người dùng nhập vào cho mảng thực hiện tính tổng các số âm
	 * - Đầu ra: Tính tổng các số âm
	 * - Xử lý:
	 * 		+ Khai báo biến sum với giá trị 0 dùng để lưu tổng của các số âm trong mảng
	 * 		+ Sử dụng vòng lặp foreach để duyệt qua từng phần tử trong mảng. Mỗi phần tử được gán cho biến num trong mỗi lần lặp
	 * 		+ Kiểm tra xem số hiện tại (num) có phải là số âm hay không?
	 *  		. Nếu thỏa điều kiện trên, số âm hiện tại sẽ được cộng vào sum
	 *  	+ Trả về sum
	 */
    
	public static int sumNegative(int[] array) {
	    int sum = 0;
	    
	    for (int num : array) {
	        if (num < 0) {
	            sum += num;
	        }
	    }
	    
	    return sum;
	}


	
	/**
	 * h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không?
	 * 
	 * Theo mô hình 3 khối ta có:
	 * - Đầu vào: Từ các giá trị mà người dùng nhập và yêu cầu người dùng nhập vào số nguyên x
	 * - Đầu ra: Tìm số nguyên x mà người dùng nhập vào có tồn tại trong mảng đó hay không?
	 * - Xử lý:
	 * 		+ Sử dụng vòng lặp foreach để duyệt qua từng phần tử trong mảng. Mỗi phần tử được gán cho biến num trong mỗi lần lặp
	 * 		+ Kiểm tra xem phần tử hiện tại (num) có bằng với giá trị x hay không?
	 * 		+ Nếu thỏa điều kiện trên: In ra thông báo rằng số x có trong mảng
	 */
	
	public static void findXInArray(int[] array, int x) {
	    for (int num : array) {
	        if (num == x) {
	            System.out.println("Số " + x + " có trong mảng.");
	            return;
	        }
	    }
	    
	    System.out.println("Số " + x + " không có trong mảng.");
	}

	public static void main(String[] args) {

		/**
		 * Đề bài: 
		 * Cho nguòi dùng nhập vào n số nguyên và lưu trữ trong mảng
		 * a. Viết hàm nhập và hàm xuất
		 * b. Tìm số lớn nhất và vị trí của nó trong mảng
		 * c. Tìm số âm đầu tiên và vị trí của nó trong mảng
		 * d. Tìm số âm lớn nhất và vị trí của nó trong mảng
		 * e. Tính tổng các số chẵn
		 * f. Đếm có bao nhiêu số âm
		 * g. Tổng các số âm
		 * h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số lượng phần tử n: ");
		
		int n = scanner.nextInt();

        // a. Viết hàm nhập và hàm xuất
        int[] array = inputArray(n);
        printArray(array);

        // b. Tìm số lớn nhất và vị trí của nó trong mảng
        findMax(array);
        
        // c. Tìm số âm đầu tiên và vị trí của nó trong mảng
        findFirstNegative(array);
        
        // d. Tìm số âm lớn nhất và vị trí của nó trong mảng
        findMaxNegative(array);
        
        // e. Tính tổng các số chẵn
        int evenSum = sumEven(array);
        System.out.println("Tổng các số chẵn trong mảng là: " + evenSum);
        
        // f. Đếm có bao nhiêu số âm
        int negativeCount = countNegative(array);
        System.out.println("Có " + negativeCount + " số âm trong mảng.");
        
        // g. Tổng các số âm
        int negativeSum = sumNegative(array);
        System.out.println("Tổng các số âm trong mảng là: " + negativeSum);

        // h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không
        System.out.print("Nhập số x để kiểm tra: ");
        int x = scanner.nextInt();
        findXInArray(array, x);
        
	}

}
