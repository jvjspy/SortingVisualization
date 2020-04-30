package com.chung.algorithms;


public class HeapSort extends Sort{

	@Override
	protected void sort() {
		int n=data.length;
		for(int i=n/2;i>=0;i--)		heapify(data,n,i);
		for(int i=n-1;i>=0;i--){
			int t=data[0];
			data[0]=data[i];
			data[i]=t;
			addState(data);
			heapify(data, i, 0);
		}
	}
	private void heapify(int [] a,int n,int i){
		int p=i,l=2*i+1;
		if(l<n&&a[l]>a[p])		p=l;
		if(l+1<n&&a[l+1]>a[p])	p=l+1;
		if(p!=i){
			int t=a[p];
			a[p]=a[i];
			a[i]=t;
			addState(data);
			heapify(a,n, p);
		}
	}
}





















