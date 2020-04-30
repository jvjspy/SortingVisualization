package com.chung.algorithms;



public class MergeSort extends Sort{

	@Override
	protected void sort() {
		sortHelper(data, 0, data.length-1);
	}
	private void sortHelper(int[] a,int l,int r){
		if(l<r){
			int m=(l+r)/2;
			sortHelper(a, l, m);
			sortHelper(a, m+1, r);
			merge(a, l, m, r);
		}
	}
	private void merge(int[] a,int l,int m,int r){
		int nl=m-l+1;
		int nr=r-m;
		int[] al=new int[nl];
		int[] ar=new int[nr];
		for(int i=0;i<nl;i++)		al[i]=a[l+i];
		for(int i=0;i<nr;i++)		ar[i]=a[m+1+i];
		int k=l,i=0,j=0;
		while(i<nl&&j<nr){
			if(al[i]<ar[j]){
				a[k]=al[i];
				i++;
			}else{
				a[k]=ar[j];
				j++;
			}
			addState(data);
			k++;
		}
		while(i<nl){
			a[k]=al[i];
			addState(data);
			i++;
			k++;
		}
		while(j<nr){
			a[k]=ar[j];
			addState(data);
			j++;
			k++;
		}
	}
}

























