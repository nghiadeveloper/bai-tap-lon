package baitaplon04;

import java.util.Scanner;

public class BaiTap {

	public static void main(String[] args) {
		
		/**
		 * Đề bài: 
		 * Cho người dùng nhập vào n số nguyên và lưu trữ trong mảng
		 * a. Viết hàm nhập và hàm xuất
		 * b. Tìm số lớn nhất và vị trí của nó trong mảng
		 * c. Tìm số âm đầu tiên và vị trí của nó trong mảng
		 * d. Tìm số âm lớn nhất và vị trí của nó trong mảng
		 * e. Tính tổng các số chẵn
		 * f. Đếm có bao nhiêu số âm
		 * g. Tổng các số âm
		 * h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không?
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		// a. Nhập và xuất
		System.out.print("Nhập số lượng phần tử n: ");
		int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
        	System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập là:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        
        // b. Tìm số lớn nhất và vị trí của nó
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Số lớn nhất: " + max + " tại vị trí: " + maxIndex);

        
        
        // c. Tìm số âm đầu tiên và vị trí của nó
        int firstNegativeIndex = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex != -1) {
            System.out.println("Số âm đầu tiên: " + array[firstNegativeIndex] + " tại vị trí: " + firstNegativeIndex);
        } else {
            System.out.println("Không có số âm trong mảng.");
        }

        
        
        // d. Tìm số âm lớn nhất và vị trí của nó
        int maxNegative = Integer.MIN_VALUE;
        int maxNegativeIndex = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0 && array[i] > maxNegative) {
                maxNegative = array[i];
                maxNegativeIndex = i;
            }
        }
        if (maxNegativeIndex != -1) {
            System.out.println("Số âm lớn nhất: " + maxNegative + " tại vị trí: " + maxNegativeIndex);
        } else {
            System.out.println("Không có số âm trong mảng.");
        }

        
        
        // e. Tính tổng các số chẵn
        int sumEven = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        System.out.println("Tổng các số chẵn: " + sumEven);

        
        
        // f. Đếm có bao nhiêu số âm
        int countNegative = 0;
        for (int num : array) {
            if (num < 0) {
                countNegative++;
            }
        }
        System.out.println("Số lượng số âm: " + countNegative);

        
        
        // g. Tổng các số âm
        int sumNegative = 0;
        for (int num : array) {
            if (num < 0) {
                sumNegative += num;
            }
        }
        System.out.println("Tổng các số âm: " + sumNegative);

        
        
        // h. Tìm x có trong mảng hay không
        System.out.print("Nhập giá trị x để tìm trong mảng: ");
        int x = scanner.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == x) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Giá trị " + x + " có trong mảng.");
        } else {
            System.out.println("Giá trị " + x + " không có trong mảng.");
        }


	}

}
