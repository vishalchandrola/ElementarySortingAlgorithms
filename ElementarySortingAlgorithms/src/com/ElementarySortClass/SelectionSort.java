package com.ElementarySortClass;

public class SelectionSort {
	
public static <T> void sort(Comparable<T>[] a) {
		
		int n = a.length;
		int min;
		for(int i = 0;i<n;i++){
			min = i;
			for(int j=i+1;j<n;j++) {
				if(less(a[j],a[min])) {
					min = j;
				}
			}
			exch(a,i,min);
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
