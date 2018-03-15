package com;

import java.util.Scanner;

import com.ElementarySortClass.InsertionSort;
import com.ElementarySortClass.ShellSort;

public class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		/*		Double arr[] = new Double[n];

		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextDouble();
		}
		InsertionSort.sort(arr);
*/
		
		String arr[] = new String[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.next();
		}
		
		ShellSort.sort(arr);
		
		for(int i = 0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
		sc.close();
	}

}
