package com.MergeSort;

public class MergerSort {
	
	public <T> void merge(Comparable<T>[] a,Comparable<T>[] aux,int low,int mid,int hi)  {
	
	//	assert isSorted(a,low,mid);
	//	assert isSorted(a, mid+1, hi);
		
		for(int i = low;i<hi;i++) {
			aux[i] = a[i];
		}
		
		int i = low;
		int j = mid+1;
		
		for(int k = low;k<hi;k++) {
			if(i>mid)
				aux[k] = a[j++];
			else if(j>hi)
				aux[k] = a[i++];
			else if(less(aux[i],aux[j]))
				aux[k] = a[i++];
			else
				aux[k] = a[j++];
		}
	}
		public <T> void sort(Comparable<T>[] a,Comparable<T>[] aux,int low,int hi)  {

		if(hi<=low)
			return;
		int mid = (low+hi)/2;
		sort(a, aux, low, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, low, mid, hi);
	}
	
	
	public <T> void sort(Comparable<T>[] a)  {
		
		Comparable<T>[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length-1);
	}


	
	private <T> boolean less(Comparable<T> a,Comparable<T> b) {
		return a.compareTo((T) b) < 0;
	}


	private boolean isSorted(Comparable<T>[] a, int low, int mid) {

		
		return false;
	}



}
