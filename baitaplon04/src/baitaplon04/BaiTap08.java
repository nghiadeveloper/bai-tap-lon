package baitaplon04;

import java.util.Scanner;

public class BaiTap08 {

	public static void main(String[] args) {
		
		/**
		 * Đề bài:
		 * Nhập mảng có n phần tử các số nguyên, In ra các phần tử là số chẵn.
		 */

		Scanner scanner = new Scanner(System.in);
        
		System.out.print("Nhập vào số phần tử n: ");
		    int n = scanner.nextInt();
		   
		    int[] numbers = new int[n];
		    
		    System.out.println("Nhập vào các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
		    System.out.print("Phần tử thứ " + (i + 1) + ": ");
		    numbers[i] = scanner.nextInt();
		}
		
		System.out.print("Các số chẵn trong mảng là: ");
		boolean hasEven = false; 
		for (int i = 0; i < n; i++) {
		    if (numbers[i] % 2 == 0) {
		        System.out.print(numbers[i] + " ");
		        hasEven = true;
		    } 
		}
		System.out.println("Không có số chẵn trong mảng");
	}

}
