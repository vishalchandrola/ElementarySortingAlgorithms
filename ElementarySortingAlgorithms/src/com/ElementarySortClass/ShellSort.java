package com.ElementarySortClass;

public class ShellSort {
	
public static <T> void sort(Comparable<T>[] a) {
		
		int n = a.length;
		int h = 1;
		while(h<n/3) {
			h = 3*h+1;
		}
		
		while(h>=1) {
			for(int i = h;i<n;i++){
				for(int j=i;j>=h;j=j-h) {
					if(less(a[j],a[j-h])) {
						exch(a,j,j-h);
					}
					else
						break;
				}
			}
			for(int j = 0;j<n;j++) {
				System.out.print(a[j]+" ");
			}
			h = h/3;
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
