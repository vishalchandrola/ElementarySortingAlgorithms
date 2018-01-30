package com.ElementarySortClass;

public class InsertionSort {

	@SuppressWarnings("unchecked")
	public static <T> void sort(Comparable<T>[] a) {
		
		int n = a.length;
		
		for(int i = 0;i<n;i++){
			for(int j=i;j<n;j++) {
				if((a[j]).compareTo( (T) a[j-1]) < 0) {
					exch(a,j,j-1);
				}
			}
		}
	}

	private static <T> void exch(Comparable<T>[] a, int i, int j) {

		Comparable<T> swap = a[i];
		a[i]=a[j];
		a[j]=swap;
	}
	
	private static <T> boolean less(Comparable<T> a,Comparable<T> b) {
		return (Comparable<T> a).compareTo(b) < 0;
		
	}
}
