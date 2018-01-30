package com;

import java.util.Scanner;

import com.ElementarySortClass.InsertionSort;

public class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Double arr[] = new Double[n];

		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextDouble();
		}
		InsertionSort.sort(arr);

		sc.close();
	}

}
