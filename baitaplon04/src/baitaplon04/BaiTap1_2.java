package baitaplon04;

import java.util.Scanner;

public class BaiTap1_2 {
	
	public static boolean kiemTraSoNguyenTo(int number) {
	    if (number <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= number - 1; i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		
		/**
		 * Đề bài: 
		 * Viết chương trình nhập vào một số nguyên và in ra chuỗi “Số nguyên tố” 
		 * nếu số đó là số nguyên tố và “Không phải số nguyên tố” nếu số đó không phải là số nguyên tố.

		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào một số nguyên: ");
		int number = scanner.nextInt();
		
		if (kiemTraSoNguyenTo(number) == true) {
		    System.out.println(number + " là số nguyên tố.");
		} else {
		    System.out.println(number + " không phải là số nguyên tố.");
		}

	}

}
