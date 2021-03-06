package com.ElementarySortClass;

public class InsertionSort {

	
	public static <T> void sort(Comparable<T>[] a) {
		
		int n = a.length;
		
		for(int i = 0;i<n;i++){
			for(int j=i;j>0;j--) {
				if(less(a[j],a[j-1])) {
					exch(a,j,j-1);
				}
				else
					break;
			}
		}
	}

	private static <T> void exch(Comparable<T>[] a, int i, int j) {

		Comparable<T> swap = a[i];
		a[i]=a[j];
		a[j]=swap;
	}
	
	@SuppressWarnings("unchecked")
	private static <T> boolean less(Comparable<T> a,Comparable<T> b) {
		return a.compareTo((T) b) < 0;
		
	}
}
